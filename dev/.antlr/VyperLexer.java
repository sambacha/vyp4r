// Generated from /Users/sbacha/vyp4r/dev/Vyper.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VyperLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, StringLiteral=23, DoubleQuotedStringCharacter=24, 
		Identifier=25, IntegerNumber=26, DecimalNumber=27, WS=28, LINE_COMMENT=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "StringLiteral", "DoubleQuotedStringCharacter", 
			"Identifier", "IdentifierStart", "IdentifierPart", "IntegerNumber", "DecimalNumber", 
			"WS", "LINE_COMMENT"
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
			"WS", "LINE_COMMENT"
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


	public VyperLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vyper.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0103\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\7\30\u00c1\n\30\f\30\16\30\u00c4\13\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00cb\n\31\3\32\3\32\7\32\u00cf\n\32\f\32\16"+
		"\32\u00d2\13\32\3\33\3\33\3\34\3\34\3\35\3\35\6\35\u00da\n\35\r\35\16"+
		"\35\u00db\3\36\6\36\u00df\n\36\r\36\16\36\u00e0\3\36\3\36\7\36\u00e5\n"+
		"\36\f\36\16\36\u00e8\13\36\5\36\u00ea\n\36\3\36\3\36\6\36\u00ee\n\36\r"+
		"\36\16\36\u00ef\5\36\u00f2\n\36\3\37\6\37\u00f5\n\37\r\37\16\37\u00f6"+
		"\3\37\3\37\3 \3 \7 \u00fd\n \f \16 \u0100\13 \3 \3 \2\2!\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\34;\35=\36?\37\3\2\n"+
		"\6\2\f\f\17\17$$^^\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\63;\3\2\62;\4\2G"+
		"Ggg\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5F\3\2\2\2\7"+
		"H\3\2\2\2\tJ\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23"+
		"]\3\2\2\2\25d\3\2\2\2\27l\3\2\2\2\31t\3\2\2\2\33|\3\2\2\2\35\u0084\3\2"+
		"\2\2\37\u008b\3\2\2\2!\u008d\3\2\2\2#\u0097\3\2\2\2%\u00a1\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00af\3\2\2\2-\u00b5\3\2\2\2/\u00be\3\2\2\2\61"+
		"\u00ca\3\2\2\2\63\u00cc\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7"+
		"\3\2\2\2;\u00de\3\2\2\2=\u00f4\3\2\2\2?\u00fa\3\2\2\2AB\7w\2\2BC\7p\2"+
		"\2CD\7k\2\2DE\7v\2\2E\4\3\2\2\2FG\7<\2\2G\6\3\2\2\2HI\7}\2\2I\b\3\2\2"+
		"\2JK\7.\2\2K\n\3\2\2\2LM\7\177\2\2M\f\3\2\2\2NO\7r\2\2OP\7w\2\2PQ\7d\2"+
		"\2QR\7n\2\2RS\7k\2\2ST\7e\2\2TU\7*\2\2U\16\3\2\2\2VW\7+\2\2W\20\3\2\2"+
		"\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\\22\3\2\2\2]^\7k\2\2^_\7p\2\2"+
		"_`\7v\2\2`a\7\63\2\2ab\7\64\2\2bc\7:\2\2c\24\3\2\2\2de\7w\2\2ef\7k\2\2"+
		"fg\7p\2\2gh\7v\2\2hi\7\64\2\2ij\7\67\2\2jk\78\2\2k\26\3\2\2\2lm\7f\2\2"+
		"mn\7g\2\2no\7e\2\2op\7k\2\2pq\7o\2\2qr\7c\2\2rs\7n\2\2s\30\3\2\2\2tu\7"+
		"c\2\2uv\7f\2\2vw\7f\2\2wx\7t\2\2xy\7g\2\2yz\7u\2\2z{\7u\2\2{\32\3\2\2"+
		"\2|}\7d\2\2}~\7{\2\2~\177\7v\2\2\177\u0080\7g\2\2\u0080\u0081\7u\2\2\u0081"+
		"\u0082\7\65\2\2\u0082\u0083\7\64\2\2\u0083\34\3\2\2\2\u0084\u0085\7d\2"+
		"\2\u0085\u0086\7{\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7u\2\2\u0089\u008a\7]\2\2\u008a\36\3\2\2\2\u008b\u008c\7_\2\2\u008c "+
		"\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7o\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092\u0093\7v\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0095\7o\2\2\u0095\u0096\7r\2\2\u0096\"\3\2\2\2\u0097\u0098\7v"+
		"\2\2\u0098\u0099\7k\2\2\u0099\u009a\7o\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7f\2\2\u009c\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7c\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7a\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7c\2\2"+
		"\u00a7\u00a8\7n\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7g\2\2\u00aa&\3\2\2"+
		"\2\u00ab\u00ac\7]\2\2\u00ac(\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae*\3\2\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7v\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7z\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7*\2\2\u00bd.\3\2\2\2\u00be"+
		"\u00c2\7$\2\2\u00bf\u00c1\5\61\31\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7$\2\2\u00c6\60\3\2\2\2\u00c7\u00cb\n\2\2\2"+
		"\u00c8\u00c9\7^\2\2\u00c9\u00cb\13\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\62\3\2\2\2\u00cc\u00d0\5\65\33\2\u00cd\u00cf\5\67\34\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\64\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4"+
		"\66\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d68\3\2\2\2\u00d7\u00d9\t\5\2\2\u00d8"+
		"\u00da\t\6\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc:\3\2\2\2\u00dd\u00df\t\6\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e9\3\2\2\2\u00e2\u00e6\7\60\2\2\u00e3\u00e5\t\6\2\2\u00e4\u00e3\3"+
		"\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00e2\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00f1\3\2\2\2\u00eb\u00ed\t\7\2\2\u00ec\u00ee\t\6\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"<\3\2\2\2\u00f3\u00f5\t\b\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9"+
		"\b\37\2\2\u00f9>\3\2\2\2\u00fa\u00fe\7%\2\2\u00fb\u00fd\n\t\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b \3\2\u0102"+
		"@\3\2\2\2\17\2\u00c2\u00ca\u00d0\u00db\u00e0\u00e6\u00e9\u00ef\u00f1\u00f4"+
		"\u00f6\u00fe\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}