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

// each file is a contract, even an empty file. 
sourceUnit
  : ( contractDefinition )* EOF ;

contractDefinition
  : ( stateVariableDeclaration ) ;
//  | interfaceDefinition ) * 
//  | unitTypeDeclaration 
//  | eventDefinition 
//  | storageVarDefinition 
//  | functionDefinition )* ;

stateVariableDeclaration
  : ( valueTypeDeclaration | referenceTypeDeclaration ) ;

valueTypeDeclaration
    : Identifier ':' 'public('? valueTypeName ')'? ;

// https://vyper.readthedocs.io/en/latest/types.html
valueTypeName
  : 'bool' 
  | 'int128' 
  | 'uint256' 
  | 'decimal' 
  | 'address' 
  | unitType 
  | 'bytes32' 
  | 'bytes[' DecimalNumber ']'
  ;

referenceTypeDeclaration
  : valueTypeName '[' valueTypeName ']' // mapping
  ;

unitType
  :  (  'timestamp' | 'timedelta' | 'wei_value' | customUnitType )  
  ;

customUnitType
  : Identifier
  ;


Identifier
  : IdentifierStart IdentifierPart* ;

fragment
IdentifierStart
  : [a-zA-Z$_] ;

fragment
IdentifierPart
  : [a-zA-Z0-9$_] ;

DecimalNumber
  : [0-9]+ ( '.' [0-9]* )? ( [eE] [0-9]+ )? ;