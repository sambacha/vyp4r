// Copyright 2016-2017 Federico Bond <federicobond@gmail.com>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

grammar Vyper;

//https://github.com/ethereum/vyper/blob/54b8dc06f258eb0e1815ea222eb5f875aae443f2/vyper/parser/parser.py#L326

// each file is a contract, even an empty file. BUt antlr does not support emptiness very well.
sourceUnit
  : ( contractDefinition ) EOF ;

contractDefinition
  // vyper enforces the order of these sections. Although it's possible in vyper to have any empty file,
  // antlr doesn't support it well. Thus we require atleast a functionDefinition
  : customUnitDeclarations *
  interfaceDefinition *
  stateVariableDeclaration *
  eventDefinition *
  storageVarDefinition *
  functionDefinition +
  ;

/* sourceUnit:interfaceDefinition */
customUnitDeclarations
  : 'unit' ':' '{'
    customUnitDeclaration
    (',' customUnitDeclaration) *
  '}'
  ;

customUnitDeclaration
  : Identifier ':' StringLiteral
  ;

/* sourceUnit:interfaceDefinition */
interfaceDefinition
  : Identifier ;


/* sourceUnit:stateVariableDeclaration */
stateVariableDeclaration
  : Identifier ':' 'public('? type ')'? ;

type
  : referenceType
  | valueType
  ;

// https://vyper.readthedocs.io/en/latest/types.html
valueType
  : 'bool' 
  | 'int128' 
  | 'uint256' 
  | 'decimal' 
  | 'address' 
  | unitType 
  | 'bytes32' 
  | 'bytes[' DecimalNumber ']'
  ;

unitType
  :  (  'timestamp' | 'timedelta' | 'wei_value' | customUnitType )  
  ;

customUnitType
  // QUESTION: Should a grammer requre that the unit is defined above? 
  : Identifier 
  ;


referenceType
  : structType
  | mappingType
  | listType
  | tupleType
  ;


structType
  : '{' Identifier ':' valueType (',' Identifier ':' valueType)* '}'
  ;

mappingType
  : type '[' valueType ']' // mapping
  ;

listType
  : valueType '[' IntegerNumber ']'
  ;

tupleType
  : '(' type (',' type)* ')'
  ;


/* sourceUnit:eventDefinition */
eventDefinition
  : Identifier ':' 'event' eventParameterList
  ;

eventParameterList
  : '(' '{' eventParameter (',' eventParameter)* '}' ')'
  ;

eventParameter
  : Identifier ':' ('indexed(' valueType ')' ) | valueType
  ;

/* sourceUnit:storageVarDefinition */
storageVarDefinition
  : Identifier ;

/* sourceUnit:functionDefinition */
functionDefinition
  : Identifier ;


/* Terminal Tokens */
StringLiteral
  : '"' DoubleQuotedStringCharacter* '"'
  ;

DoubleQuotedStringCharacter
  : ~["\r\n\\] | ('\\' .) ;

Identifier
  : IdentifierStart IdentifierPart* ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

IntegerNumber
  : [1-9][0-9]+
  ;

DecimalNumber
  : [0-9]+ ( '.' [0-9]* )? ( [eE] [0-9]+ )? ;

/* Whitespace */
// This will need to be enhanced to handle pythonic indentation blocks.
// good example: https://github.com/antlr/grammars-v4/blob/master/python2/Python2.g4#L376
WS
  : ([\t\r\n\u000C] | ' ' )+ -> skip ;

LINE_COMMENT
  : '#' ~[\r\n]* -> channel(HIDDEN) ;