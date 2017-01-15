// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator\LevelGrammar.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LevelGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Linebreak=1, Alphabet=2, Char=3, LowerCase=4, UpperCase=5, Digits=6, Digit=7, 
		ObjectBeginn=8, ObjectEnd=9, AttributeSeparator=10, LevelNameId=11, ConfigsId=12, 
		LevelTimeId=13, PlayerId=14, SpeedId=15, DrinkSpeedId=16, EnemiesId=17, 
		NameId=18, MapRepresentationId=19, AttackTargetId=20, AttackTargetValue=21, 
		AttackValueId=22, MapId=23, Character=24, Building=25, Spaeti=26, Street=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Linebreak", "Alphabet", "Char", "LowerCase", "UpperCase", "Digits", "Digit", 
		"ObjectBeginn", "ObjectEnd", "AttributeSeparator", "LevelNameId", "ConfigsId", 
		"LevelTimeId", "PlayerId", "SpeedId", "DrinkSpeedId", "EnemiesId", "NameId", 
		"MapRepresentationId", "AttackTargetId", "AttackTargetValue", "AttackValueId", 
		"MapId", "Character", "Building", "Spaeti", "Street"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, "' {'", "'}'", "','", 
		"'levelName:'", "'levelConfiguration'", "'levelTime:'", "'player'", "'speed:'", 
		"'drinkSpeed:'", "'enemies'", "'name:'", "'mapRepresentation:'", "'attack-target:'", 
		null, "'attackValue:'", "'map'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Linebreak", "Alphabet", "Char", "LowerCase", "UpperCase", "Digits", 
		"Digit", "ObjectBeginn", "ObjectEnd", "AttributeSeparator", "LevelNameId", 
		"ConfigsId", "LevelTimeId", "PlayerId", "SpeedId", "DrinkSpeedId", "EnemiesId", 
		"NameId", "MapRepresentationId", "AttackTargetId", "AttackTargetValue", 
		"AttackValueId", "MapId", "Character", "Building", "Spaeti", "Street"
	};
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


	public LevelGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LevelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0106\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2;\n\2\3\2\3\2\5\2?\n\2\3\3"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\7\7S\n\7\f\7\16\7V\13\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00e8\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00fd\n\31\3\32"+
		"\3\32\5\32\u0101\n\32\3\33\3\33\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\5\3\2\62;\6\2>>@@XX``\4\2"+
		"RRUU\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\3>\3\2"+
		"\2\2\5@\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17W\3\2\2"+
		"\2\21Y\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31k\3\2\2\2\33~\3"+
		"\2\2\2\35\u0089\3\2\2\2\37\u0090\3\2\2\2!\u0097\3\2\2\2#\u00a3\3\2\2\2"+
		"%\u00ab\3\2\2\2\'\u00b1\3\2\2\2)\u00c4\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3"+
		"\2\2\2/\u00f6\3\2\2\2\61\u00fc\3\2\2\2\63\u0100\3\2\2\2\65\u0102\3\2\2"+
		"\2\67\u0104\3\2\2\29;\7\17\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<?\7\f\2\2"+
		"=?\7\17\2\2>:\3\2\2\2>=\3\2\2\2?\4\3\2\2\2@D\5\7\4\2AC\5\7\4\2BA\3\2\2"+
		"\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\6\3\2\2\2FD\3\2\2\2GK\5\t\5\2HK\5\13"+
		"\6\2IK\5\17\b\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\b\3\2\2\2LM\4c|\2M\n\3"+
		"\2\2\2NO\4C\\\2O\f\3\2\2\2PT\5\17\b\2QS\5\17\b\2RQ\3\2\2\2SV\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2U\16\3\2\2\2VT\3\2\2\2WX\t\2\2\2X\20\3\2\2\2YZ\7\""+
		"\2\2Z[\7}\2\2[\22\3\2\2\2\\]\7\177\2\2]\24\3\2\2\2^_\7.\2\2_\26\3\2\2"+
		"\2`a\7n\2\2ab\7g\2\2bc\7x\2\2cd\7g\2\2de\7n\2\2ef\7P\2\2fg\7c\2\2gh\7"+
		"o\2\2hi\7g\2\2ij\7<\2\2j\30\3\2\2\2kl\7n\2\2lm\7g\2\2mn\7x\2\2no\7g\2"+
		"\2op\7n\2\2pq\7E\2\2qr\7q\2\2rs\7p\2\2st\7h\2\2tu\7k\2\2uv\7i\2\2vw\7"+
		"w\2\2wx\7t\2\2xy\7c\2\2yz\7v\2\2z{\7k\2\2{|\7q\2\2|}\7p\2\2}\32\3\2\2"+
		"\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\u0081\7x\2\2\u0081\u0082\7g\2\2"+
		"\u0082\u0083\7n\2\2\u0083\u0084\7V\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088\7<\2\2\u0088\34\3\2\2\2\u0089\u008a"+
		"\7r\2\2\u008a\u008b\7n\2\2\u008b\u008c\7c\2\2\u008c\u008d\7{\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7t\2\2\u008f\36\3\2\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7r\2\2\u0092\u0093\7g\2\2\u0093\u0094\7g\2\2\u0094\u0095\7f\2\2"+
		"\u0095\u0096\7<\2\2\u0096 \3\2\2\2\u0097\u0098\7f\2\2\u0098\u0099\7t\2"+
		"\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7m\2\2\u009c\u009d"+
		"\7U\2\2\u009d\u009e\7r\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7f\2\2\u00a1\u00a2\7<\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00a9\7g\2\2\u00a9\u00aa\7u\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7p\2"+
		"\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7g\2\2\u00af\u00b0"+
		"\7<\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4"+
		"\7r\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7r\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2"+
		"\u00bb\u00bc\7p\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7<\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7m\2\2"+
		"\u00ca\u00cb\7/\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7i\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7<\2\2\u00d2*\3\2\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7p\2\2\u00d7\u00e8\7m\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7k\2\2\u00da\u00db\7o\2\2\u00db\u00e8\7g\2\2\u00dc\u00dd"+
		"\7r\2\2\u00dd\u00de\7n\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7{\2\2\u00e0"+
		"\u00e1\7g\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7r\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e8\7f\2\2\u00e7\u00d3"+
		"\3\2\2\2\u00e7\u00d8\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e8,\3\2\2\2\u00e9"+
		"\u00ea\7c\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7c\2\2"+
		"\u00ed\u00ee\7e\2\2\u00ee\u00ef\7m\2\2\u00ef\u00f0\7X\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7<\2\2\u00f5.\3\2\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7r\2\2\u00f9\60\3\2\2\2\u00fa\u00fd\7Z\2\2\u00fb\u00fd\5\17\b\2"+
		"\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\62\3\2\2\2\u00fe\u0101"+
		"\7J\2\2\u00ff\u0101\5\65\33\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2"+
		"\u0101\64\3\2\2\2\u0102\u0103\t\3\2\2\u0103\66\3\2\2\2\u0104\u0105\t\4"+
		"\2\2\u01058\3\2\2\2\13\2:>DJT\u00e7\u00fc\u0100\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}