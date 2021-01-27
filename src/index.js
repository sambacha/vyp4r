const antlr4 = require('./antlr4/index')
const { VyperLexer } = require('./lib/VyperLexer')
const { VyperParser } = require('./lib/VyperParser')
const ASTBuilder = require('./ASTBuilder')
const ErrorListener = require('./ErrorListener')
const { buildTokenList } = require('./tokens')

function ParserError(args) {
  const { message, line, column } = args.errors[0]
  this.message = `${message} (${line}:${column})`
  this.errors = args.errors

  if (Error.captureStackTrace) {
    Error.captureStackTrace(this, this.constructor)
  } else {
    this.stack = new Error().stack
  }
}

ParserError.prototype = Object.create(Error.prototype)
ParserError.prototype.constructor = ParserError
ParserError.prototype.name = 'ParserError'

function tokenize(input, options) {
  options = options || {}

  const chars = new antlr4.InputStream(input)
  const lexer = new VyperLexer(chars)
  const tokens = new antlr4.CommonTokenStream(lexer)

  return buildTokenList(tokens.tokenSource.getAllTokens(), options)
}

function parse(input, options) {
  options = options || {}

  const chars = new antlr4.InputStream(input)

  const listener = new ErrorListener()

  const lexer = new VyperLexer(chars)
  lexer.removeErrorListeners()
  lexer.addErrorListener(listener)

  const tokens = new antlr4.CommonTokenStream(lexer)

  const parser = new VyperParser(tokens)

  parser.removeErrorListeners()
  parser.addErrorListener(listener)
  parser.buildParseTrees = true

  const tree = parser.sourceUnit()

  let tokenList
  if (options.tokens) {
    const tokenSource = tokens.tokenSource
    tokenSource.reset()

    tokenList = buildTokenList(tokenSource.getAllTokens(), options)
  }

  if (!options.tolerant && listener.hasErrors()) {
    throw new ParserError({ errors: listener.getErrors() })
  }

  const visitor = new ASTBuilder(options)
  const ast = visitor.visit(tree)

  if (options.tolerant && listener.hasErrors()) {
    ast.errors = listener.getErrors()
  }
  if (options.tokens) {
    ast.tokens = tokenList
  }

  return ast
}

function _isASTNode(node) {
  return (
    !!node && typeof node === 'object'
    && Object.prototype.hasOwnProperty.call(node, 'type')
  )
}

function visit(node, visitor) {
  if (Array.isArray(node)) {
    node.forEach(child => visit(child, visitor))
  }

  if (!_isASTNode(node)) return

  let cont = true

  if (visitor[node.type]) {
    cont = visitor[node.type](node)
  }

  if (cont === false) return

  for (const prop in node) {
    if (Object.prototype.hasOwnProperty.call(node, prop)) {
      visit(node[prop], visitor)
    }
  }

  const selector = node.type + ':exit'
  if (visitor[selector]) {
    visitor[selector](node)
  }
}

exports.tokenize = tokenize
exports.parse = parse
exports.visit = visit
exports.ParserError = ParserError