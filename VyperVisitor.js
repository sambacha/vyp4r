// Generated from Vyper.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by VyperParser.

function VyperVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

VyperVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
VyperVisitor.prototype.constructor = VyperVisitor;

// Visit a parse tree produced by VyperParser#sourceUnit.
VyperVisitor.prototype.visitSourceUnit = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#contractDefinition.
VyperVisitor.prototype.visitContractDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#customUnitDeclarations.
VyperVisitor.prototype.visitCustomUnitDeclarations = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#customUnitDeclaration.
VyperVisitor.prototype.visitCustomUnitDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#interfaceDefinition.
VyperVisitor.prototype.visitInterfaceDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#stateVariableDeclaration.
VyperVisitor.prototype.visitStateVariableDeclaration = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#type.
VyperVisitor.prototype.visitType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#valueType.
VyperVisitor.prototype.visitValueType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#unitType.
VyperVisitor.prototype.visitUnitType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#customUnitType.
VyperVisitor.prototype.visitCustomUnitType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#referenceType.
VyperVisitor.prototype.visitReferenceType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#structType.
VyperVisitor.prototype.visitStructType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#mappingType.
VyperVisitor.prototype.visitMappingType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#listType.
VyperVisitor.prototype.visitListType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#tupleType.
VyperVisitor.prototype.visitTupleType = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#eventDefinition.
VyperVisitor.prototype.visitEventDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#eventParameterList.
VyperVisitor.prototype.visitEventParameterList = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#eventParameter.
VyperVisitor.prototype.visitEventParameter = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#storageVarDefinition.
VyperVisitor.prototype.visitStorageVarDefinition = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by VyperParser#functionDefinition.
VyperVisitor.prototype.visitFunctionDefinition = function(ctx) {
  return this.visitChildren(ctx);
};



exports.VyperVisitor = VyperVisitor;