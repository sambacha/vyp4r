// Generated from /Users/sbacha/vyp4r/dev/Vyper.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VyperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, StringLiteral=23, DoubleQuotedStringCharacter=24, 
		Identifier=25, IntegerNumber=26, DecimalNumber=27, WS=28, LINE_COMMENT=29, 
		OR=30;
	public static final int
		RULE_sourceUnit = 0, RULE_contractDefinition = 1, RULE_customUnitDeclarations = 2, 
		RULE_customUnitDeclaration = 3, RULE_interfaceDefinition = 4, RULE_stateVariableDeclaration = 5, 
		RULE_type = 6, RULE_valueType = 7, RULE_unitType = 8, RULE_customUnitType = 9, 
		RULE_referenceType = 10, RULE_structType = 11, RULE_mappingType = 12, 
		RULE_listType = 13, RULE_tupleType = 14, RULE_eventDefinition = 15, RULE_eventParameterList = 16, 
		RULE_eventParameter = 17, RULE_storageVarDefinition = 18, RULE_functionDefinition = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "contractDefinition", "customUnitDeclarations", "customUnitDeclaration", 
			"interfaceDefinition", "stateVariableDeclaration", "type", "valueType", 
			"unitType", "customUnitType", "referenceType", "structType", "mappingType", 
			"listType", "tupleType", "eventDefinition", "eventParameterList", "eventParameter", 
			"storageVarDefinition", "functionDefinition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'unit'", "':'", "'{'", "','", "'}'", "'public('", "')'", "'bool'", 
			"'int128'", "'uint256'", "'decimal'", "'address'", "'bytes32'", "'bytes['", 
			"']'", "'timestamp'", "'timedelta'", "'wei_value'", "'['", "'('", "'event'", 
			"'indexed('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "StringLiteral", 
			"DoubleQuotedStringCharacter", "Identifier", "IntegerNumber", "DecimalNumber", 
			"WS", "LINE_COMMENT", "OR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Vyper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VyperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VyperParser.EOF, 0); }
		public ContractDefinitionContext contractDefinition() {
			return getRuleContext(ContractDefinitionContext.class,0);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(40);
			contractDefinition();
			}
			setState(41);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractDefinitionContext extends ParserRuleContext {
		public List<CustomUnitDeclarationsContext> customUnitDeclarations() {
			return getRuleContexts(CustomUnitDeclarationsContext.class);
		}
		public CustomUnitDeclarationsContext customUnitDeclarations(int i) {
			return getRuleContext(CustomUnitDeclarationsContext.class,i);
		}
		public List<InterfaceDefinitionContext> interfaceDefinition() {
			return getRuleContexts(InterfaceDefinitionContext.class);
		}
		public InterfaceDefinitionContext interfaceDefinition(int i) {
			return getRuleContext(InterfaceDefinitionContext.class,i);
		}
		public List<StateVariableDeclarationContext> stateVariableDeclaration() {
			return getRuleContexts(StateVariableDeclarationContext.class);
		}
		public StateVariableDeclarationContext stateVariableDeclaration(int i) {
			return getRuleContext(StateVariableDeclarationContext.class,i);
		}
		public List<EventDefinitionContext> eventDefinition() {
			return getRuleContexts(EventDefinitionContext.class);
		}
		public EventDefinitionContext eventDefinition(int i) {
			return getRuleContext(EventDefinitionContext.class,i);
		}
		public List<StorageVarDefinitionContext> storageVarDefinition() {
			return getRuleContexts(StorageVarDefinitionContext.class);
		}
		public StorageVarDefinitionContext storageVarDefinition(int i) {
			return getRuleContext(StorageVarDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contractDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(43);
				customUnitDeclarations();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					interfaceDefinition();
					}
					} 
				}
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					stateVariableDeclaration();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					eventDefinition();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					storageVarDefinition();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				functionDefinition();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomUnitDeclarationsContext extends ParserRuleContext {
		public List<CustomUnitDeclarationContext> customUnitDeclaration() {
			return getRuleContexts(CustomUnitDeclarationContext.class);
		}
		public CustomUnitDeclarationContext customUnitDeclaration(int i) {
			return getRuleContext(CustomUnitDeclarationContext.class,i);
		}
		public CustomUnitDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitDeclarations; }
	}

	public final CustomUnitDeclarationsContext customUnitDeclarations() throws RecognitionException {
		CustomUnitDeclarationsContext _localctx = new CustomUnitDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_customUnitDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(T__1);
			setState(80);
			match(T__2);
			setState(81);
			customUnitDeclaration();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(82);
				match(T__3);
				setState(83);
				customUnitDeclaration();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomUnitDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(VyperParser.StringLiteral, 0); }
		public CustomUnitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitDeclaration; }
	}

	public final CustomUnitDeclarationContext customUnitDeclaration() throws RecognitionException {
		CustomUnitDeclarationContext _localctx = new CustomUnitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_customUnitDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(Identifier);
			setState(92);
			match(T__1);
			setState(93);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public InterfaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDefinition; }
	}

	public final InterfaceDefinitionContext interfaceDefinition() throws RecognitionException {
		InterfaceDefinitionContext _localctx = new InterfaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interfaceDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(Identifier);
			setState(98);
			match(T__1);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(99);
				match(T__5);
				}
			}

			setState(102);
			type();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(103);
				match(T__6);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				referenceType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				valueType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueTypeContext extends ParserRuleContext {
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TerminalNode DecimalNumber() { return getToken(VyperParser.DecimalNumber, 0); }
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueType);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(T__11);
				}
				break;
			case T__15:
			case T__16:
			case T__17:
			case Identifier:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				unitType();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(T__13);
				setState(118);
				match(DecimalNumber);
				setState(119);
				match(T__14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitTypeContext extends ParserRuleContext {
		public CustomUnitTypeContext customUnitType() {
			return getRuleContext(CustomUnitTypeContext.class,0);
		}
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				{
				setState(122);
				match(T__15);
				}
				break;
			case T__16:
				{
				setState(123);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(124);
				match(T__17);
				}
				break;
			case Identifier:
				{
				setState(125);
				customUnitType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomUnitTypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public CustomUnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customUnitType; }
	}

	public final CustomUnitTypeContext customUnitType() throws RecognitionException {
		CustomUnitTypeContext _localctx = new CustomUnitTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_customUnitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(VyperParser.OR, 0); }
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_referenceType);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				structType();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(OR);
				 mappingType 
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				listType();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				tupleType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(VyperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(VyperParser.Identifier, i);
		}
		public List<ValueTypeContext> valueType() {
			return getRuleContexts(ValueTypeContext.class);
		}
		public ValueTypeContext valueType(int i) {
			return getRuleContext(ValueTypeContext.class,i);
		}
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__2);
			setState(138);
			match(Identifier);
			setState(139);
			match(T__1);
			setState(140);
			valueType();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(141);
				match(T__3);
				setState(142);
				match(Identifier);
				setState(143);
				match(T__1);
				setState(144);
				valueType();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public MappingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingType; }
	}

	public final MappingTypeContext mappingType() throws RecognitionException {
		MappingTypeContext _localctx = new MappingTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mappingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			type();
			setState(153);
			match(T__18);
			setState(154);
			valueType();
			setState(155);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode IntegerNumber() { return getToken(VyperParser.IntegerNumber, 0); }
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			valueType();
			setState(158);
			match(T__18);
			setState(159);
			match(IntegerNumber);
			setState(160);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__19);
			setState(163);
			type();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(164);
				match(T__3);
				setState(165);
				type();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eventDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Identifier);
			setState(174);
			match(T__1);
			setState(175);
			match(T__20);
			setState(176);
			eventParameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__19);
			setState(179);
			match(T__2);
			setState(180);
			eventParameter();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(181);
				match(T__3);
				setState(182);
				eventParameter();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__4);
			setState(189);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eventParameter);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(Identifier);
				setState(192);
				match(T__1);
				{
				setState(193);
				match(T__21);
				setState(194);
				valueType();
				setState(195);
				match(T__6);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				valueType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageVarDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public StorageVarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageVarDefinition; }
	}

	public final StorageVarDefinitionContext storageVarDefinition() throws RecognitionException {
		StorageVarDefinitionContext _localctx = new StorageVarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_storageVarDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(VyperParser.Identifier, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\7\3A"+
		"\n\3\f\3\16\3D\13\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\6\3M\n\3\r\3\16\3"+
		"N\3\4\3\4\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\5\7g\n\7\3\7\3\7\5\7k\n\7\3\b\3\b\5\bo\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n\3\n\5\n\u0081"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097\13\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00a9\n\20"+
		"\f\20\16\20\u00ac\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u00ba\n\22\f\22\16\22\u00bd\13\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u00d5"+
		"\2*\3\2\2\2\4\60\3\2\2\2\6P\3\2\2\2\b]\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16"+
		"n\3\2\2\2\20z\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3\2\2\2\26\u0089\3\2\2"+
		"\2\30\u008b\3\2\2\2\32\u009a\3\2\2\2\34\u009f\3\2\2\2\36\u00a4\3\2\2\2"+
		" \u00af\3\2\2\2\"\u00b4\3\2\2\2$\u00c8\3\2\2\2&\u00ca\3\2\2\2(\u00cc\3"+
		"\2\2\2*+\5\4\3\2+,\7\2\2\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2"+
		"\60.\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\65\5\n\6\2\64"+
		"\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67<\3\2\2\28\66\3"+
		"\2\2\29;\5\f\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3"+
		"\2\2\2?A\5 \21\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3"+
		"\2\2\2EG\5&\24\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3"+
		"\2\2\2KM\5(\25\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PQ"+
		"\7\3\2\2QR\7\4\2\2RS\7\5\2\2SX\5\b\5\2TU\7\6\2\2UW\5\b\5\2VT\3\2\2\2W"+
		"Z\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\7\2\2\\\7\3\2\2"+
		"\2]^\7\33\2\2^_\7\4\2\2_`\7\31\2\2`\t\3\2\2\2ab\7\33\2\2b\13\3\2\2\2c"+
		"d\7\33\2\2df\7\4\2\2eg\7\b\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\5\16\b"+
		"\2ik\7\t\2\2ji\3\2\2\2jk\3\2\2\2k\r\3\2\2\2lo\5\26\f\2mo\5\20\t\2nl\3"+
		"\2\2\2nm\3\2\2\2o\17\3\2\2\2p{\7\n\2\2q{\7\13\2\2r{\7\f\2\2s{\7\r\2\2"+
		"t{\7\16\2\2u{\5\22\n\2v{\7\17\2\2wx\7\20\2\2xy\7\35\2\2y{\7\21\2\2zp\3"+
		"\2\2\2zq\3\2\2\2zr\3\2\2\2zs\3\2\2\2zt\3\2\2\2zu\3\2\2\2zv\3\2\2\2zw\3"+
		"\2\2\2{\21\3\2\2\2|\u0081\7\22\2\2}\u0081\7\23\2\2~\u0081\7\24\2\2\177"+
		"\u0081\5\24\13\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177"+
		"\3\2\2\2\u0081\23\3\2\2\2\u0082\u0083\7\33\2\2\u0083\25\3\2\2\2\u0084"+
		"\u008a\5\30\r\2\u0085\u0086\7 \2\2\u0086\u008a\b\f\1\2\u0087\u008a\5\34"+
		"\17\2\u0088\u008a\5\36\20\2\u0089\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\27\3\2\2\2\u008b\u008c\7\5\2"+
		"\2\u008c\u008d\7\33\2\2\u008d\u008e\7\4\2\2\u008e\u0095\5\20\t\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0091\7\33\2\2\u0091\u0092\7\4\2\2\u0092\u0094\5"+
		"\20\t\2\u0093\u008f\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\7"+
		"\2\2\u0099\31\3\2\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\25\2\2\u009c"+
		"\u009d\5\20\t\2\u009d\u009e\7\21\2\2\u009e\33\3\2\2\2\u009f\u00a0\5\20"+
		"\t\2\u00a0\u00a1\7\25\2\2\u00a1\u00a2\7\34\2\2\u00a2\u00a3\7\21\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00aa\5\16\b\2\u00a6\u00a7\7\6"+
		"\2\2\u00a7\u00a9\5\16\b\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7\t\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b1"+
		"\7\4\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00b3\5\"\22\2\u00b3!\3\2\2\2\u00b4"+
		"\u00b5\7\26\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00bb\5$\23\2\u00b7\u00b8\7"+
		"\6\2\2\u00b8\u00ba\5$\23\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c0\7\t\2\2\u00c0#\3\2\2\2\u00c1\u00c2"+
		"\7\33\2\2\u00c2\u00c3\7\4\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\5\20\t"+
		"\2\u00c5\u00c6\7\t\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c9\5\20\t\2\u00c8"+
		"\u00c1\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\33\2\2"+
		"\u00cb\'\3\2\2\2\u00cc\u00cd\7\33\2\2\u00cd)\3\2\2\2\23\60\66<BHNXfjn"+
		"z\u0080\u0089\u0095\u00aa\u00bb\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}