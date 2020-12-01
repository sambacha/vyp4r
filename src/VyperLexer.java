// Generated from /Users/sbacha/solidity-antlr4/Vyper.g4 by ANTLR 4.8
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
		Identifier=25, IntegerNumber=26, DecimalNumber=27, WS=28, LINE_COMMENT=29, 
		ReservedKeyword=30;
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
			"WS", "LINE_COMMENT", "ReservedKeyword"
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
			"WS", "LINE_COMMENT", "ReservedKeyword"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u015f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\7\30\u00c3\n\30\f\30\16\30\u00c6\13\30\3"+
		"\30\3\30\3\31\3\31\3\31\5\31\u00cd\n\31\3\32\3\32\7\32\u00d1\n\32\f\32"+
		"\16\32\u00d4\13\32\3\33\3\33\3\34\3\34\3\35\3\35\6\35\u00dc\n\35\r\35"+
		"\16\35\u00dd\3\36\6\36\u00e1\n\36\r\36\16\36\u00e2\3\36\3\36\7\36\u00e7"+
		"\n\36\f\36\16\36\u00ea\13\36\5\36\u00ec\n\36\3\36\3\36\6\36\u00f0\n\36"+
		"\r\36\16\36\u00f1\5\36\u00f4\n\36\3\37\6\37\u00f7\n\37\r\37\16\37\u00f8"+
		"\3\37\3\37\3 \3 \7 \u00ff\n \f \16 \u0102\13 \3 \3 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u015e\n!\2\2\"\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\2\67\29\34;\35=\36?\37A \3\2"+
		"\n\6\2\f\f\17\17$$^^\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2\63;\3\2\62;\4\2"+
		"GGgg\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0177\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2"+
		"\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17X\3\2\2\2\21"+
		"Z\3\2\2\2\23_\3\2\2\2\25f\3\2\2\2\27n\3\2\2\2\31v\3\2\2\2\33~\3\2\2\2"+
		"\35\u0086\3\2\2\2\37\u008d\3\2\2\2!\u008f\3\2\2\2#\u0099\3\2\2\2%\u00a3"+
		"\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1\3\2\2\2-\u00b7\3\2\2\2"+
		"/\u00c0\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d5\3\2\2\2\67"+
		"\u00d7\3\2\2\29\u00d9\3\2\2\2;\u00e0\3\2\2\2=\u00f6\3\2\2\2?\u00fc\3\2"+
		"\2\2A\u015d\3\2\2\2CD\7w\2\2DE\7p\2\2EF\7k\2\2FG\7v\2\2G\4\3\2\2\2HI\7"+
		"<\2\2I\6\3\2\2\2JK\7}\2\2K\b\3\2\2\2LM\7.\2\2M\n\3\2\2\2NO\7\177\2\2O"+
		"\f\3\2\2\2PQ\7r\2\2QR\7w\2\2RS\7d\2\2ST\7n\2\2TU\7k\2\2UV\7e\2\2VW\7*"+
		"\2\2W\16\3\2\2\2XY\7+\2\2Y\20\3\2\2\2Z[\7d\2\2[\\\7q\2\2\\]\7q\2\2]^\7"+
		"n\2\2^\22\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2bc\7\63\2\2cd\7\64\2\2de\7"+
		":\2\2e\24\3\2\2\2fg\7w\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2jk\7\64\2\2kl\7\67"+
		"\2\2lm\78\2\2m\26\3\2\2\2no\7f\2\2op\7g\2\2pq\7e\2\2qr\7k\2\2rs\7o\2\2"+
		"st\7c\2\2tu\7n\2\2u\30\3\2\2\2vw\7c\2\2wx\7f\2\2xy\7f\2\2yz\7t\2\2z{\7"+
		"g\2\2{|\7u\2\2|}\7u\2\2}\32\3\2\2\2~\177\7d\2\2\177\u0080\7{\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083\u0084\7\65\2"+
		"\2\u0084\u0085\7\64\2\2\u0085\34\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088"+
		"\7{\2\2\u0088\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7]\2\2\u008c\36\3\2\2\2\u008d\u008e\7_\2\2\u008e \3\2\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092\u0093\7g\2\2"+
		"\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7o\2\2\u0097\u0098\7r\2\2\u0098\"\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7k\2\2\u009b\u009c\7o\2\2\u009c\u009d\7g\2\2\u009d\u009e\7f\2\2\u009e"+
		"\u009f\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7c\2\2"+
		"\u00a2$\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7k\2"+
		"\2\u00a6\u00a7\7a\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa"+
		"\7n\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7g\2\2\u00ac&\3\2\2\2\u00ad\u00ae"+
		"\7]\2\2\u00ae(\3\2\2\2\u00af\u00b0\7*\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7"+
		"g\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba"+
		"\7f\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7z\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7f\2\2\u00be\u00bf\7*\2\2\u00bf.\3\2\2\2\u00c0\u00c4\7$\2\2\u00c1"+
		"\u00c3\5\61\31\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c8\7$\2\2\u00c8\60\3\2\2\2\u00c9\u00cd\n\2\2\2\u00ca\u00cb\7^\2\2"+
		"\u00cb\u00cd\13\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\62"+
		"\3\2\2\2\u00ce\u00d2\5\65\33\2\u00cf\u00d1\5\67\34\2\u00d0\u00cf\3\2\2"+
		"\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\64"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\t\3\2\2\u00d6\66\3\2\2\2\u00d7"+
		"\u00d8\t\4\2\2\u00d88\3\2\2\2\u00d9\u00db\t\5\2\2\u00da\u00dc\t\6\2\2"+
		"\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de:\3\2\2\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00eb\3\2"+
		"\2\2\u00e4\u00e8\7\60\2\2\u00e5\u00e7\t\6\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00f3\3\2\2\2\u00ed\u00ef\t\7\2\2\u00ee\u00f0\t\6\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f4\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4<\3\2\2\2"+
		"\u00f5\u00f7\t\b\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\37\2\2"+
		"\u00fb>\3\2\2\2\u00fc\u0100\7%\2\2\u00fd\u00ff\n\t\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\b \3\2\u0104@\3\2\2\2\u0105"+
		"\u0106\7c\2\2\u0106\u0107\7d\2\2\u0107\u0108\7u\2\2\u0108\u0109\7v\2\2"+
		"\u0109\u010a\7t\2\2\u010a\u010b\7c\2\2\u010b\u010c\7e\2\2\u010c\u015e"+
		"\7v\2\2\u010d\u010e\7c\2\2\u010e\u010f\7h\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u015e\7t\2\2\u0112\u0113\7e\2\2\u0113\u0114\7c\2\2"+
		"\u0114\u0115\7u\2\2\u0115\u015e\7g\2\2\u0116\u0117\7e\2\2\u0117\u0118"+
		"\7c\2\2\u0118\u0119\7v\2\2\u0119\u011a\7e\2\2\u011a\u015e\7j\2\2\u011b"+
		"\u011c\7f\2\2\u011c\u011d\7g\2\2\u011d\u011e\7h\2\2\u011e\u011f\7c\2\2"+
		"\u011f\u0120\7w\2\2\u0120\u0121\7n\2\2\u0121\u015e\7v\2\2\u0122\u0123"+
		"\7h\2\2\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u015e\7n\2\2\u0127\u0128\7k\2\2\u0128\u015e\7p\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7p\2\2\u012b\u012c\7n\2\2\u012c\u012d\7k\2\2\u012d\u012e"+
		"\7p\2\2\u012e\u015e\7g\2\2\u012f\u0130\7n\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u015e\7v\2\2\u0132\u0133\7o\2\2\u0133\u0134\7c\2\2\u0134\u0135\7v\2\2"+
		"\u0135\u0136\7e\2\2\u0136\u015e\7j\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7w\2\2\u0139\u013a\7n\2\2\u013a\u015e\7n\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u015e\7h\2\2\u013d\u013e\7t\2\2\u013e\u013f\7g\2\2\u013f\u0140\7n\2\2"+
		"\u0140\u0141\7q\2\2\u0141\u0142\7e\2\2\u0142\u0143\7c\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7c\2\2\u0145\u0146\7d\2\2\u0146\u0147\7n\2\2\u0147"+
		"\u015e\7g\2\2\u0148\u0149\7u\2\2\u0149\u014a\7v\2\2\u014a\u014b\7c\2\2"+
		"\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u015e\7e\2\2\u014e\u014f"+
		"\7u\2\2\u014f\u0150\7y\2\2\u0150\u0151\7k\2\2\u0151\u0152\7v\2\2\u0152"+
		"\u0153\7e\2\2\u0153\u015e\7j\2\2\u0154\u0155\7v\2\2\u0155\u0156\7t\2\2"+
		"\u0156\u015e\7{\2\2\u0157\u0158\7v\2\2\u0158\u0159\7{\2\2\u0159\u015a"+
		"\7r\2\2\u015a\u015b\7g\2\2\u015b\u015c\7q\2\2\u015c\u015e\7h\2\2\u015d"+
		"\u0105\3\2\2\2\u015d\u010d\3\2\2\2\u015d\u0112\3\2\2\2\u015d\u0116\3\2"+
		"\2\2\u015d\u011b\3\2\2\2\u015d\u0122\3\2\2\2\u015d\u0127\3\2\2\2\u015d"+
		"\u0129\3\2\2\2\u015d\u012f\3\2\2\2\u015d\u0132\3\2\2\2\u015d\u0137\3\2"+
		"\2\2\u015d\u013b\3\2\2\2\u015d\u013d\3\2\2\2\u015d\u0148\3\2\2\2\u015d"+
		"\u014e\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0157\3\2\2\2\u015eB\3\2\2\2"+
		"\20\2\u00c4\u00cc\u00d2\u00dd\u00e2\u00e8\u00eb\u00f1\u00f3\u00f6\u00f8"+
		"\u0100\u015d\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}