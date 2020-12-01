// Generated from Vyper.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var VyperListener = require('./VyperListener').VyperListener;
var VyperVisitor = require('./VyperVisitor').VyperVisitor;

var grammarFileName = "Vyper.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003 \u00cf\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010\u0004",
    "\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014\t",
    "\u0014\u0004\u0015\t\u0015\u0003\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0003\u0007\u0003/\n\u0003\f\u0003\u000e\u00032\u000b\u0003\u0003\u0003",
    "\u0007\u00035\n\u0003\f\u0003\u000e\u00038\u000b\u0003\u0003\u0003\u0007",
    "\u0003;\n\u0003\f\u0003\u000e\u0003>\u000b\u0003\u0003\u0003\u0007\u0003",
    "A\n\u0003\f\u0003\u000e\u0003D\u000b\u0003\u0003\u0003\u0007\u0003G",
    "\n\u0003\f\u0003\u000e\u0003J\u000b\u0003\u0003\u0003\u0006\u0003M\n",
    "\u0003\r\u0003\u000e\u0003N\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0007\u0004W\n\u0004\f\u0004\u000e\u0004",
    "Z\u000b\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003",
    "\u0007\u0005\u0007g\n\u0007\u0003\u0007\u0003\u0007\u0005\u0007k\n\u0007",
    "\u0003\b\u0003\b\u0005\bo\n\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0005\t{\n\t\u0003\n\u0003",
    "\n\u0003\n\u0003\n\u0005\n\u0081\n\n\u0003\u000b\u0003\u000b\u0003\f",
    "\u0003\f\u0003\f\u0003\f\u0003\f\u0005\f\u008a\n\f\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r\u0094\n\r\f\r\u000e",
    "\r\u0097\u000b\r\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000e",
    "\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f",
    "\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0007\u0010",
    "\u00a9\n\u0010\f\u0010\u000e\u0010\u00ac\u000b\u0010\u0003\u0010\u0003",
    "\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003",
    "\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u00ba",
    "\n\u0012\f\u0012\u000e\u0012\u00bd\u000b\u0012\u0003\u0012\u0003\u0012",
    "\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0005\u0013\u00c9\n\u0013\u0003\u0014\u0003",
    "\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0002\u0002\u0016\u0002\u0004",
    "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e ",
    "\"$&(\u0002\u0002\u0002\u00d5\u0002*\u0003\u0002\u0002\u0002\u00040",
    "\u0003\u0002\u0002\u0002\u0006P\u0003\u0002\u0002\u0002\b]\u0003\u0002",
    "\u0002\u0002\na\u0003\u0002\u0002\u0002\fc\u0003\u0002\u0002\u0002\u000e",
    "n\u0003\u0002\u0002\u0002\u0010z\u0003\u0002\u0002\u0002\u0012\u0080",
    "\u0003\u0002\u0002\u0002\u0014\u0082\u0003\u0002\u0002\u0002\u0016\u0089",
    "\u0003\u0002\u0002\u0002\u0018\u008b\u0003\u0002\u0002\u0002\u001a\u009a",
    "\u0003\u0002\u0002\u0002\u001c\u009f\u0003\u0002\u0002\u0002\u001e\u00a4",
    "\u0003\u0002\u0002\u0002 \u00af\u0003\u0002\u0002\u0002\"\u00b4\u0003",
    "\u0002\u0002\u0002$\u00c8\u0003\u0002\u0002\u0002&\u00ca\u0003\u0002",
    "\u0002\u0002(\u00cc\u0003\u0002\u0002\u0002*+\u0005\u0004\u0003\u0002",
    "+,\u0007\u0002\u0002\u0003,\u0003\u0003\u0002\u0002\u0002-/\u0005\u0006",
    "\u0004\u0002.-\u0003\u0002\u0002\u0002/2\u0003\u0002\u0002\u00020.\u0003",
    "\u0002\u0002\u000201\u0003\u0002\u0002\u000216\u0003\u0002\u0002\u0002",
    "20\u0003\u0002\u0002\u000235\u0005\n\u0006\u000243\u0003\u0002\u0002",
    "\u000258\u0003\u0002\u0002\u000264\u0003\u0002\u0002\u000267\u0003\u0002",
    "\u0002\u00027<\u0003\u0002\u0002\u000286\u0003\u0002\u0002\u00029;\u0005",
    "\f\u0007\u0002:9\u0003\u0002\u0002\u0002;>\u0003\u0002\u0002\u0002<",
    ":\u0003\u0002\u0002\u0002<=\u0003\u0002\u0002\u0002=B\u0003\u0002\u0002",
    "\u0002><\u0003\u0002\u0002\u0002?A\u0005 \u0011\u0002@?\u0003\u0002",
    "\u0002\u0002AD\u0003\u0002\u0002\u0002B@\u0003\u0002\u0002\u0002BC\u0003",
    "\u0002\u0002\u0002CH\u0003\u0002\u0002\u0002DB\u0003\u0002\u0002\u0002",
    "EG\u0005&\u0014\u0002FE\u0003\u0002\u0002\u0002GJ\u0003\u0002\u0002",
    "\u0002HF\u0003\u0002\u0002\u0002HI\u0003\u0002\u0002\u0002IL\u0003\u0002",
    "\u0002\u0002JH\u0003\u0002\u0002\u0002KM\u0005(\u0015\u0002LK\u0003",
    "\u0002\u0002\u0002MN\u0003\u0002\u0002\u0002NL\u0003\u0002\u0002\u0002",
    "NO\u0003\u0002\u0002\u0002O\u0005\u0003\u0002\u0002\u0002PQ\u0007\u0003",
    "\u0002\u0002QR\u0007\u0004\u0002\u0002RS\u0007\u0005\u0002\u0002SX\u0005",
    "\b\u0005\u0002TU\u0007\u0006\u0002\u0002UW\u0005\b\u0005\u0002VT\u0003",
    "\u0002\u0002\u0002WZ\u0003\u0002\u0002\u0002XV\u0003\u0002\u0002\u0002",
    "XY\u0003\u0002\u0002\u0002Y[\u0003\u0002\u0002\u0002ZX\u0003\u0002\u0002",
    "\u0002[\\\u0007\u0007\u0002\u0002\\\u0007\u0003\u0002\u0002\u0002]^",
    "\u0007\u001b\u0002\u0002^_\u0007\u0004\u0002\u0002_`\u0007\u0019\u0002",
    "\u0002`\t\u0003\u0002\u0002\u0002ab\u0007\u001b\u0002\u0002b\u000b\u0003",
    "\u0002\u0002\u0002cd\u0007\u001b\u0002\u0002df\u0007\u0004\u0002\u0002",
    "eg\u0007\b\u0002\u0002fe\u0003\u0002\u0002\u0002fg\u0003\u0002\u0002",
    "\u0002gh\u0003\u0002\u0002\u0002hj\u0005\u000e\b\u0002ik\u0007\t\u0002",
    "\u0002ji\u0003\u0002\u0002\u0002jk\u0003\u0002\u0002\u0002k\r\u0003",
    "\u0002\u0002\u0002lo\u0005\u0016\f\u0002mo\u0005\u0010\t\u0002nl\u0003",
    "\u0002\u0002\u0002nm\u0003\u0002\u0002\u0002o\u000f\u0003\u0002\u0002",
    "\u0002p{\u0007\n\u0002\u0002q{\u0007\u000b\u0002\u0002r{\u0007\f\u0002",
    "\u0002s{\u0007\r\u0002\u0002t{\u0007\u000e\u0002\u0002u{\u0005\u0012",
    "\n\u0002v{\u0007\u000f\u0002\u0002wx\u0007\u0010\u0002\u0002xy\u0007",
    "\u001d\u0002\u0002y{\u0007\u0011\u0002\u0002zp\u0003\u0002\u0002\u0002",
    "zq\u0003\u0002\u0002\u0002zr\u0003\u0002\u0002\u0002zs\u0003\u0002\u0002",
    "\u0002zt\u0003\u0002\u0002\u0002zu\u0003\u0002\u0002\u0002zv\u0003\u0002",
    "\u0002\u0002zw\u0003\u0002\u0002\u0002{\u0011\u0003\u0002\u0002\u0002",
    "|\u0081\u0007\u0012\u0002\u0002}\u0081\u0007\u0013\u0002\u0002~\u0081",
    "\u0007\u0014\u0002\u0002\u007f\u0081\u0005\u0014\u000b\u0002\u0080|",
    "\u0003\u0002\u0002\u0002\u0080}\u0003\u0002\u0002\u0002\u0080~\u0003",
    "\u0002\u0002\u0002\u0080\u007f\u0003\u0002\u0002\u0002\u0081\u0013\u0003",
    "\u0002\u0002\u0002\u0082\u0083\u0007\u001b\u0002\u0002\u0083\u0015\u0003",
    "\u0002\u0002\u0002\u0084\u008a\u0005\u0018\r\u0002\u0085\u0086\u0007",
    " \u0002\u0002\u0086\u008a\b\f\u0001\u0002\u0087\u008a\u0005\u001c\u000f",
    "\u0002\u0088\u008a\u0005\u001e\u0010\u0002\u0089\u0084\u0003\u0002\u0002",
    "\u0002\u0089\u0085\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002",
    "\u0002\u0089\u0088\u0003\u0002\u0002\u0002\u008a\u0017\u0003\u0002\u0002",
    "\u0002\u008b\u008c\u0007\u0005\u0002\u0002\u008c\u008d\u0007\u001b\u0002",
    "\u0002\u008d\u008e\u0007\u0004\u0002\u0002\u008e\u0095\u0005\u0010\t",
    "\u0002\u008f\u0090\u0007\u0006\u0002\u0002\u0090\u0091\u0007\u001b\u0002",
    "\u0002\u0091\u0092\u0007\u0004\u0002\u0002\u0092\u0094\u0005\u0010\t",
    "\u0002\u0093\u008f\u0003\u0002\u0002\u0002\u0094\u0097\u0003\u0002\u0002",
    "\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0096\u0003\u0002\u0002",
    "\u0002\u0096\u0098\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002",
    "\u0002\u0098\u0099\u0007\u0007\u0002\u0002\u0099\u0019\u0003\u0002\u0002",
    "\u0002\u009a\u009b\u0005\u000e\b\u0002\u009b\u009c\u0007\u0015\u0002",
    "\u0002\u009c\u009d\u0005\u0010\t\u0002\u009d\u009e\u0007\u0011\u0002",
    "\u0002\u009e\u001b\u0003\u0002\u0002\u0002\u009f\u00a0\u0005\u0010\t",
    "\u0002\u00a0\u00a1\u0007\u0015\u0002\u0002\u00a1\u00a2\u0007\u001c\u0002",
    "\u0002\u00a2\u00a3\u0007\u0011\u0002\u0002\u00a3\u001d\u0003\u0002\u0002",
    "\u0002\u00a4\u00a5\u0007\u0016\u0002\u0002\u00a5\u00aa\u0005\u000e\b",
    "\u0002\u00a6\u00a7\u0007\u0006\u0002\u0002\u00a7\u00a9\u0005\u000e\b",
    "\u0002\u00a8\u00a6\u0003\u0002\u0002\u0002\u00a9\u00ac\u0003\u0002\u0002",
    "\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002",
    "\u0002\u00ab\u00ad\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002",
    "\u0002\u00ad\u00ae\u0007\t\u0002\u0002\u00ae\u001f\u0003\u0002\u0002",
    "\u0002\u00af\u00b0\u0007\u001b\u0002\u0002\u00b0\u00b1\u0007\u0004\u0002",
    "\u0002\u00b1\u00b2\u0007\u0017\u0002\u0002\u00b2\u00b3\u0005\"\u0012",
    "\u0002\u00b3!\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u0016\u0002",
    "\u0002\u00b5\u00b6\u0007\u0005\u0002\u0002\u00b6\u00bb\u0005$\u0013",
    "\u0002\u00b7\u00b8\u0007\u0006\u0002\u0002\u00b8\u00ba\u0005$\u0013",
    "\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00ba\u00bd\u0003\u0002\u0002",
    "\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bb\u00bc\u0003\u0002\u0002",
    "\u0002\u00bc\u00be\u0003\u0002\u0002\u0002\u00bd\u00bb\u0003\u0002\u0002",
    "\u0002\u00be\u00bf\u0007\u0007\u0002\u0002\u00bf\u00c0\u0007\t\u0002",
    "\u0002\u00c0#\u0003\u0002\u0002\u0002\u00c1\u00c2\u0007\u001b\u0002",
    "\u0002\u00c2\u00c3\u0007\u0004\u0002\u0002\u00c3\u00c4\u0007\u0018\u0002",
    "\u0002\u00c4\u00c5\u0005\u0010\t\u0002\u00c5\u00c6\u0007\t\u0002\u0002",
    "\u00c6\u00c9\u0003\u0002\u0002\u0002\u00c7\u00c9\u0005\u0010\t\u0002",
    "\u00c8\u00c1\u0003\u0002\u0002\u0002\u00c8\u00c7\u0003\u0002\u0002\u0002",
    "\u00c9%\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u001b\u0002\u0002",
    "\u00cb\'\u0003\u0002\u0002\u0002\u00cc\u00cd\u0007\u001b\u0002\u0002",
    "\u00cd)\u0003\u0002\u0002\u0002\u001306<BHNXfjnz\u0080\u0089\u0095\u00aa",
    "\u00bb\u00c8"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'unit'", "':'", "'{'", "','", "'}'", "'public('", 
                     "')'", "'bool'", "'int128'", "'uint256'", "'decimal'", 
                     "'address'", "'bytes32'", "'bytes['", "']'", "'timestamp'", 
                     "'timedelta'", "'wei_value'", "'['", "'('", "'event'", 
                     "'indexed('" ];

var symbolicNames = [ null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, null, null, null, null, 
                      null, null, null, null, null, "StringLiteral", "DoubleQuotedStringCharacter", 
                      "Identifier", "IntegerNumber", "DecimalNumber", "WS", 
                      "LINE_COMMENT", "OR" ];

var ruleNames =  [ "sourceUnit", "contractDefinition", "customUnitDeclarations", 
                   "customUnitDeclaration", "interfaceDefinition", "stateVariableDeclaration", 
                   "type", "valueType", "unitType", "customUnitType", "referenceType", 
                   "structType", "mappingType", "listType", "tupleType", 
                   "eventDefinition", "eventParameterList", "eventParameter", 
                   "storageVarDefinition", "functionDefinition" ];

function VyperParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

VyperParser.prototype = Object.create(antlr4.Parser.prototype);
VyperParser.prototype.constructor = VyperParser;

Object.defineProperty(VyperParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

VyperParser.EOF = antlr4.Token.EOF;
VyperParser.T__0 = 1;
VyperParser.T__1 = 2;
VyperParser.T__2 = 3;
VyperParser.T__3 = 4;
VyperParser.T__4 = 5;
VyperParser.T__5 = 6;
VyperParser.T__6 = 7;
VyperParser.T__7 = 8;
VyperParser.T__8 = 9;
VyperParser.T__9 = 10;
VyperParser.T__10 = 11;
VyperParser.T__11 = 12;
VyperParser.T__12 = 13;
VyperParser.T__13 = 14;
VyperParser.T__14 = 15;
VyperParser.T__15 = 16;
VyperParser.T__16 = 17;
VyperParser.T__17 = 18;
VyperParser.T__18 = 19;
VyperParser.T__19 = 20;
VyperParser.T__20 = 21;
VyperParser.T__21 = 22;
VyperParser.StringLiteral = 23;
VyperParser.DoubleQuotedStringCharacter = 24;
VyperParser.Identifier = 25;
VyperParser.IntegerNumber = 26;
VyperParser.DecimalNumber = 27;
VyperParser.WS = 28;
VyperParser.LINE_COMMENT = 29;
VyperParser.OR = 30;

VyperParser.RULE_sourceUnit = 0;
VyperParser.RULE_contractDefinition = 1;
VyperParser.RULE_customUnitDeclarations = 2;
VyperParser.RULE_customUnitDeclaration = 3;
VyperParser.RULE_interfaceDefinition = 4;
VyperParser.RULE_stateVariableDeclaration = 5;
VyperParser.RULE_type = 6;
VyperParser.RULE_valueType = 7;
VyperParser.RULE_unitType = 8;
VyperParser.RULE_customUnitType = 9;
VyperParser.RULE_referenceType = 10;
VyperParser.RULE_structType = 11;
VyperParser.RULE_mappingType = 12;
VyperParser.RULE_listType = 13;
VyperParser.RULE_tupleType = 14;
VyperParser.RULE_eventDefinition = 15;
VyperParser.RULE_eventParameterList = 16;
VyperParser.RULE_eventParameter = 17;
VyperParser.RULE_storageVarDefinition = 18;
VyperParser.RULE_functionDefinition = 19;


function SourceUnitContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_sourceUnit;
    return this;
}

SourceUnitContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SourceUnitContext.prototype.constructor = SourceUnitContext;

SourceUnitContext.prototype.EOF = function() {
    return this.getToken(VyperParser.EOF, 0);
};

SourceUnitContext.prototype.contractDefinition = function() {
    return this.getTypedRuleContext(ContractDefinitionContext,0);
};

SourceUnitContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterSourceUnit(this);
	}
};

SourceUnitContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitSourceUnit(this);
	}
};

SourceUnitContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitSourceUnit(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.SourceUnitContext = SourceUnitContext;

VyperParser.prototype.sourceUnit = function() {

    var localctx = new SourceUnitContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, VyperParser.RULE_sourceUnit);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 40;
        this.contractDefinition();
        this.state = 41;
        this.match(VyperParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ContractDefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_contractDefinition;
    return this;
}

ContractDefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ContractDefinitionContext.prototype.constructor = ContractDefinitionContext;

ContractDefinitionContext.prototype.customUnitDeclarations = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(CustomUnitDeclarationsContext);
    } else {
        return this.getTypedRuleContext(CustomUnitDeclarationsContext,i);
    }
};

ContractDefinitionContext.prototype.interfaceDefinition = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(InterfaceDefinitionContext);
    } else {
        return this.getTypedRuleContext(InterfaceDefinitionContext,i);
    }
};

ContractDefinitionContext.prototype.stateVariableDeclaration = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StateVariableDeclarationContext);
    } else {
        return this.getTypedRuleContext(StateVariableDeclarationContext,i);
    }
};

ContractDefinitionContext.prototype.eventDefinition = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(EventDefinitionContext);
    } else {
        return this.getTypedRuleContext(EventDefinitionContext,i);
    }
};

ContractDefinitionContext.prototype.storageVarDefinition = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StorageVarDefinitionContext);
    } else {
        return this.getTypedRuleContext(StorageVarDefinitionContext,i);
    }
};

ContractDefinitionContext.prototype.functionDefinition = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(FunctionDefinitionContext);
    } else {
        return this.getTypedRuleContext(FunctionDefinitionContext,i);
    }
};

ContractDefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterContractDefinition(this);
	}
};

ContractDefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitContractDefinition(this);
	}
};

ContractDefinitionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitContractDefinition(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.ContractDefinitionContext = ContractDefinitionContext;

VyperParser.prototype.contractDefinition = function() {

    var localctx = new ContractDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, VyperParser.RULE_contractDefinition);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 46;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===VyperParser.T__0) {
            this.state = 43;
            this.customUnitDeclarations();
            this.state = 48;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 52;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,1,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 49;
                this.interfaceDefinition(); 
            }
            this.state = 54;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,1,this._ctx);
        }

        this.state = 58;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,2,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 55;
                this.stateVariableDeclaration(); 
            }
            this.state = 60;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,2,this._ctx);
        }

        this.state = 64;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,3,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 61;
                this.eventDefinition(); 
            }
            this.state = 66;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,3,this._ctx);
        }

        this.state = 70;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,4,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 67;
                this.storageVarDefinition(); 
            }
            this.state = 72;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,4,this._ctx);
        }

        this.state = 74; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 73;
            this.functionDefinition();
            this.state = 76; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while(_la===VyperParser.Identifier);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function CustomUnitDeclarationsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_customUnitDeclarations;
    return this;
}

CustomUnitDeclarationsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CustomUnitDeclarationsContext.prototype.constructor = CustomUnitDeclarationsContext;

CustomUnitDeclarationsContext.prototype.customUnitDeclaration = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(CustomUnitDeclarationContext);
    } else {
        return this.getTypedRuleContext(CustomUnitDeclarationContext,i);
    }
};

CustomUnitDeclarationsContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterCustomUnitDeclarations(this);
	}
};

CustomUnitDeclarationsContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitCustomUnitDeclarations(this);
	}
};

CustomUnitDeclarationsContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitCustomUnitDeclarations(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.CustomUnitDeclarationsContext = CustomUnitDeclarationsContext;

VyperParser.prototype.customUnitDeclarations = function() {

    var localctx = new CustomUnitDeclarationsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, VyperParser.RULE_customUnitDeclarations);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 78;
        this.match(VyperParser.T__0);
        this.state = 79;
        this.match(VyperParser.T__1);
        this.state = 80;
        this.match(VyperParser.T__2);
        this.state = 81;
        this.customUnitDeclaration();
        this.state = 86;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===VyperParser.T__3) {
            this.state = 82;
            this.match(VyperParser.T__3);
            this.state = 83;
            this.customUnitDeclaration();
            this.state = 88;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 89;
        this.match(VyperParser.T__4);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function CustomUnitDeclarationContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_customUnitDeclaration;
    return this;
}

CustomUnitDeclarationContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CustomUnitDeclarationContext.prototype.constructor = CustomUnitDeclarationContext;

CustomUnitDeclarationContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

CustomUnitDeclarationContext.prototype.StringLiteral = function() {
    return this.getToken(VyperParser.StringLiteral, 0);
};

CustomUnitDeclarationContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterCustomUnitDeclaration(this);
	}
};

CustomUnitDeclarationContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitCustomUnitDeclaration(this);
	}
};

CustomUnitDeclarationContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitCustomUnitDeclaration(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.CustomUnitDeclarationContext = CustomUnitDeclarationContext;

VyperParser.prototype.customUnitDeclaration = function() {

    var localctx = new CustomUnitDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, VyperParser.RULE_customUnitDeclaration);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 91;
        this.match(VyperParser.Identifier);
        this.state = 92;
        this.match(VyperParser.T__1);
        this.state = 93;
        this.match(VyperParser.StringLiteral);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function InterfaceDefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_interfaceDefinition;
    return this;
}

InterfaceDefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
InterfaceDefinitionContext.prototype.constructor = InterfaceDefinitionContext;

InterfaceDefinitionContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

InterfaceDefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterInterfaceDefinition(this);
	}
};

InterfaceDefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitInterfaceDefinition(this);
	}
};

InterfaceDefinitionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitInterfaceDefinition(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.InterfaceDefinitionContext = InterfaceDefinitionContext;

VyperParser.prototype.interfaceDefinition = function() {

    var localctx = new InterfaceDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, VyperParser.RULE_interfaceDefinition);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 95;
        this.match(VyperParser.Identifier);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StateVariableDeclarationContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_stateVariableDeclaration;
    return this;
}

StateVariableDeclarationContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StateVariableDeclarationContext.prototype.constructor = StateVariableDeclarationContext;

StateVariableDeclarationContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

StateVariableDeclarationContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

StateVariableDeclarationContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterStateVariableDeclaration(this);
	}
};

StateVariableDeclarationContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitStateVariableDeclaration(this);
	}
};

StateVariableDeclarationContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitStateVariableDeclaration(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.StateVariableDeclarationContext = StateVariableDeclarationContext;

VyperParser.prototype.stateVariableDeclaration = function() {

    var localctx = new StateVariableDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, VyperParser.RULE_stateVariableDeclaration);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 97;
        this.match(VyperParser.Identifier);
        this.state = 98;
        this.match(VyperParser.T__1);
        this.state = 100;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===VyperParser.T__5) {
            this.state = 99;
            this.match(VyperParser.T__5);
        }

        this.state = 102;
        this.type();
        this.state = 104;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===VyperParser.T__6) {
            this.state = 103;
            this.match(VyperParser.T__6);
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function TypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_type;
    return this;
}

TypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TypeContext.prototype.constructor = TypeContext;

TypeContext.prototype.referenceType = function() {
    return this.getTypedRuleContext(ReferenceTypeContext,0);
};

TypeContext.prototype.valueType = function() {
    return this.getTypedRuleContext(ValueTypeContext,0);
};

TypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterType(this);
	}
};

TypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitType(this);
	}
};

TypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.TypeContext = TypeContext;

VyperParser.prototype.type = function() {

    var localctx = new TypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, VyperParser.RULE_type);
    try {
        this.state = 108;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 106;
            this.referenceType();
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 107;
            this.valueType();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ValueTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_valueType;
    return this;
}

ValueTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ValueTypeContext.prototype.constructor = ValueTypeContext;

ValueTypeContext.prototype.unitType = function() {
    return this.getTypedRuleContext(UnitTypeContext,0);
};

ValueTypeContext.prototype.DecimalNumber = function() {
    return this.getToken(VyperParser.DecimalNumber, 0);
};

ValueTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterValueType(this);
	}
};

ValueTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitValueType(this);
	}
};

ValueTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitValueType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.ValueTypeContext = ValueTypeContext;

VyperParser.prototype.valueType = function() {

    var localctx = new ValueTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, VyperParser.RULE_valueType);
    try {
        this.state = 120;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case VyperParser.T__7:
            this.enterOuterAlt(localctx, 1);
            this.state = 110;
            this.match(VyperParser.T__7);
            break;
        case VyperParser.T__8:
            this.enterOuterAlt(localctx, 2);
            this.state = 111;
            this.match(VyperParser.T__8);
            break;
        case VyperParser.T__9:
            this.enterOuterAlt(localctx, 3);
            this.state = 112;
            this.match(VyperParser.T__9);
            break;
        case VyperParser.T__10:
            this.enterOuterAlt(localctx, 4);
            this.state = 113;
            this.match(VyperParser.T__10);
            break;
        case VyperParser.T__11:
            this.enterOuterAlt(localctx, 5);
            this.state = 114;
            this.match(VyperParser.T__11);
            break;
        case VyperParser.T__15:
        case VyperParser.T__16:
        case VyperParser.T__17:
        case VyperParser.Identifier:
            this.enterOuterAlt(localctx, 6);
            this.state = 115;
            this.unitType();
            break;
        case VyperParser.T__12:
            this.enterOuterAlt(localctx, 7);
            this.state = 116;
            this.match(VyperParser.T__12);
            break;
        case VyperParser.T__13:
            this.enterOuterAlt(localctx, 8);
            this.state = 117;
            this.match(VyperParser.T__13);
            this.state = 118;
            this.match(VyperParser.DecimalNumber);
            this.state = 119;
            this.match(VyperParser.T__14);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function UnitTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_unitType;
    return this;
}

UnitTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
UnitTypeContext.prototype.constructor = UnitTypeContext;

UnitTypeContext.prototype.customUnitType = function() {
    return this.getTypedRuleContext(CustomUnitTypeContext,0);
};

UnitTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterUnitType(this);
	}
};

UnitTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitUnitType(this);
	}
};

UnitTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitUnitType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.UnitTypeContext = UnitTypeContext;

VyperParser.prototype.unitType = function() {

    var localctx = new UnitTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, VyperParser.RULE_unitType);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 126;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case VyperParser.T__15:
            this.state = 122;
            this.match(VyperParser.T__15);
            break;
        case VyperParser.T__16:
            this.state = 123;
            this.match(VyperParser.T__16);
            break;
        case VyperParser.T__17:
            this.state = 124;
            this.match(VyperParser.T__17);
            break;
        case VyperParser.Identifier:
            this.state = 125;
            this.customUnitType();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function CustomUnitTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_customUnitType;
    return this;
}

CustomUnitTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CustomUnitTypeContext.prototype.constructor = CustomUnitTypeContext;

CustomUnitTypeContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

CustomUnitTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterCustomUnitType(this);
	}
};

CustomUnitTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitCustomUnitType(this);
	}
};

CustomUnitTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitCustomUnitType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.CustomUnitTypeContext = CustomUnitTypeContext;

VyperParser.prototype.customUnitType = function() {

    var localctx = new CustomUnitTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, VyperParser.RULE_customUnitType);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 128;
        this.match(VyperParser.Identifier);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ReferenceTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_referenceType;
    return this;
}

ReferenceTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ReferenceTypeContext.prototype.constructor = ReferenceTypeContext;

ReferenceTypeContext.prototype.structType = function() {
    return this.getTypedRuleContext(StructTypeContext,0);
};

ReferenceTypeContext.prototype.OR = function() {
    return this.getToken(VyperParser.OR, 0);
};

ReferenceTypeContext.prototype.listType = function() {
    return this.getTypedRuleContext(ListTypeContext,0);
};

ReferenceTypeContext.prototype.tupleType = function() {
    return this.getTypedRuleContext(TupleTypeContext,0);
};

ReferenceTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterReferenceType(this);
	}
};

ReferenceTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitReferenceType(this);
	}
};

ReferenceTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitReferenceType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.ReferenceTypeContext = ReferenceTypeContext;

VyperParser.prototype.referenceType = function() {

    var localctx = new ReferenceTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, VyperParser.RULE_referenceType);
    try {
        this.state = 135;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case VyperParser.T__2:
            this.enterOuterAlt(localctx, 1);
            this.state = 130;
            this.structType();
            break;
        case VyperParser.OR:
            this.enterOuterAlt(localctx, 2);
            this.state = 131;
            this.match(VyperParser.OR);
             mappingType 
            break;
        case VyperParser.T__7:
        case VyperParser.T__8:
        case VyperParser.T__9:
        case VyperParser.T__10:
        case VyperParser.T__11:
        case VyperParser.T__12:
        case VyperParser.T__13:
        case VyperParser.T__15:
        case VyperParser.T__16:
        case VyperParser.T__17:
        case VyperParser.Identifier:
            this.enterOuterAlt(localctx, 3);
            this.state = 133;
            this.listType();
            break;
        case VyperParser.T__19:
            this.enterOuterAlt(localctx, 4);
            this.state = 134;
            this.tupleType();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StructTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_structType;
    return this;
}

StructTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StructTypeContext.prototype.constructor = StructTypeContext;

StructTypeContext.prototype.Identifier = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(VyperParser.Identifier);
    } else {
        return this.getToken(VyperParser.Identifier, i);
    }
};


StructTypeContext.prototype.valueType = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ValueTypeContext);
    } else {
        return this.getTypedRuleContext(ValueTypeContext,i);
    }
};

StructTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterStructType(this);
	}
};

StructTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitStructType(this);
	}
};

StructTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitStructType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.StructTypeContext = StructTypeContext;

VyperParser.prototype.structType = function() {

    var localctx = new StructTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, VyperParser.RULE_structType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 137;
        this.match(VyperParser.T__2);
        this.state = 138;
        this.match(VyperParser.Identifier);
        this.state = 139;
        this.match(VyperParser.T__1);
        this.state = 140;
        this.valueType();
        this.state = 147;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===VyperParser.T__3) {
            this.state = 141;
            this.match(VyperParser.T__3);
            this.state = 142;
            this.match(VyperParser.Identifier);
            this.state = 143;
            this.match(VyperParser.T__1);
            this.state = 144;
            this.valueType();
            this.state = 149;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 150;
        this.match(VyperParser.T__4);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function MappingTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_mappingType;
    return this;
}

MappingTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
MappingTypeContext.prototype.constructor = MappingTypeContext;

MappingTypeContext.prototype.type = function() {
    return this.getTypedRuleContext(TypeContext,0);
};

MappingTypeContext.prototype.valueType = function() {
    return this.getTypedRuleContext(ValueTypeContext,0);
};

MappingTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterMappingType(this);
	}
};

MappingTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitMappingType(this);
	}
};

MappingTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitMappingType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.MappingTypeContext = MappingTypeContext;

VyperParser.prototype.mappingType = function() {

    var localctx = new MappingTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, VyperParser.RULE_mappingType);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 152;
        this.type();
        this.state = 153;
        this.match(VyperParser.T__18);
        this.state = 154;
        this.valueType();
        this.state = 155;
        this.match(VyperParser.T__14);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ListTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_listType;
    return this;
}

ListTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ListTypeContext.prototype.constructor = ListTypeContext;

ListTypeContext.prototype.valueType = function() {
    return this.getTypedRuleContext(ValueTypeContext,0);
};

ListTypeContext.prototype.IntegerNumber = function() {
    return this.getToken(VyperParser.IntegerNumber, 0);
};

ListTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterListType(this);
	}
};

ListTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitListType(this);
	}
};

ListTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitListType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.ListTypeContext = ListTypeContext;

VyperParser.prototype.listType = function() {

    var localctx = new ListTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, VyperParser.RULE_listType);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 157;
        this.valueType();
        this.state = 158;
        this.match(VyperParser.T__18);
        this.state = 159;
        this.match(VyperParser.IntegerNumber);
        this.state = 160;
        this.match(VyperParser.T__14);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function TupleTypeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_tupleType;
    return this;
}

TupleTypeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
TupleTypeContext.prototype.constructor = TupleTypeContext;

TupleTypeContext.prototype.type = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(TypeContext);
    } else {
        return this.getTypedRuleContext(TypeContext,i);
    }
};

TupleTypeContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterTupleType(this);
	}
};

TupleTypeContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitTupleType(this);
	}
};

TupleTypeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitTupleType(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.TupleTypeContext = TupleTypeContext;

VyperParser.prototype.tupleType = function() {

    var localctx = new TupleTypeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, VyperParser.RULE_tupleType);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 162;
        this.match(VyperParser.T__19);
        this.state = 163;
        this.type();
        this.state = 168;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===VyperParser.T__3) {
            this.state = 164;
            this.match(VyperParser.T__3);
            this.state = 165;
            this.type();
            this.state = 170;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 171;
        this.match(VyperParser.T__6);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function EventDefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_eventDefinition;
    return this;
}

EventDefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EventDefinitionContext.prototype.constructor = EventDefinitionContext;

EventDefinitionContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

EventDefinitionContext.prototype.eventParameterList = function() {
    return this.getTypedRuleContext(EventParameterListContext,0);
};

EventDefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterEventDefinition(this);
	}
};

EventDefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitEventDefinition(this);
	}
};

EventDefinitionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitEventDefinition(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.EventDefinitionContext = EventDefinitionContext;

VyperParser.prototype.eventDefinition = function() {

    var localctx = new EventDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, VyperParser.RULE_eventDefinition);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 173;
        this.match(VyperParser.Identifier);
        this.state = 174;
        this.match(VyperParser.T__1);
        this.state = 175;
        this.match(VyperParser.T__20);
        this.state = 176;
        this.eventParameterList();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function EventParameterListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_eventParameterList;
    return this;
}

EventParameterListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EventParameterListContext.prototype.constructor = EventParameterListContext;

EventParameterListContext.prototype.eventParameter = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(EventParameterContext);
    } else {
        return this.getTypedRuleContext(EventParameterContext,i);
    }
};

EventParameterListContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterEventParameterList(this);
	}
};

EventParameterListContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitEventParameterList(this);
	}
};

EventParameterListContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitEventParameterList(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.EventParameterListContext = EventParameterListContext;

VyperParser.prototype.eventParameterList = function() {

    var localctx = new EventParameterListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, VyperParser.RULE_eventParameterList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 178;
        this.match(VyperParser.T__19);
        this.state = 179;
        this.match(VyperParser.T__2);
        this.state = 180;
        this.eventParameter();
        this.state = 185;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===VyperParser.T__3) {
            this.state = 181;
            this.match(VyperParser.T__3);
            this.state = 182;
            this.eventParameter();
            this.state = 187;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 188;
        this.match(VyperParser.T__4);
        this.state = 189;
        this.match(VyperParser.T__6);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function EventParameterContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_eventParameter;
    return this;
}

EventParameterContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EventParameterContext.prototype.constructor = EventParameterContext;

EventParameterContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

EventParameterContext.prototype.valueType = function() {
    return this.getTypedRuleContext(ValueTypeContext,0);
};

EventParameterContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterEventParameter(this);
	}
};

EventParameterContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitEventParameter(this);
	}
};

EventParameterContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitEventParameter(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.EventParameterContext = EventParameterContext;

VyperParser.prototype.eventParameter = function() {

    var localctx = new EventParameterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, VyperParser.RULE_eventParameter);
    try {
        this.state = 198;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,16,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 191;
            this.match(VyperParser.Identifier);
            this.state = 192;
            this.match(VyperParser.T__1);

            this.state = 193;
            this.match(VyperParser.T__21);
            this.state = 194;
            this.valueType();
            this.state = 195;
            this.match(VyperParser.T__6);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 197;
            this.valueType();
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function StorageVarDefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_storageVarDefinition;
    return this;
}

StorageVarDefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StorageVarDefinitionContext.prototype.constructor = StorageVarDefinitionContext;

StorageVarDefinitionContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

StorageVarDefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterStorageVarDefinition(this);
	}
};

StorageVarDefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitStorageVarDefinition(this);
	}
};

StorageVarDefinitionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitStorageVarDefinition(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.StorageVarDefinitionContext = StorageVarDefinitionContext;

VyperParser.prototype.storageVarDefinition = function() {

    var localctx = new StorageVarDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, VyperParser.RULE_storageVarDefinition);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 200;
        this.match(VyperParser.Identifier);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function FunctionDefinitionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = VyperParser.RULE_functionDefinition;
    return this;
}

FunctionDefinitionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FunctionDefinitionContext.prototype.constructor = FunctionDefinitionContext;

FunctionDefinitionContext.prototype.Identifier = function() {
    return this.getToken(VyperParser.Identifier, 0);
};

FunctionDefinitionContext.prototype.enterRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.enterFunctionDefinition(this);
	}
};

FunctionDefinitionContext.prototype.exitRule = function(listener) {
    if(listener instanceof VyperListener ) {
        listener.exitFunctionDefinition(this);
	}
};

FunctionDefinitionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof VyperVisitor ) {
        return visitor.visitFunctionDefinition(this);
    } else {
        return visitor.visitChildren(this);
    }
};




VyperParser.FunctionDefinitionContext = FunctionDefinitionContext;

VyperParser.prototype.functionDefinition = function() {

    var localctx = new FunctionDefinitionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, VyperParser.RULE_functionDefinition);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 202;
        this.match(VyperParser.Identifier);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.VyperParser = VyperParser;
