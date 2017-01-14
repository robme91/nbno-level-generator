// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator\LevelGrammar.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LevelGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Linebreak=3, Alphabet=4, Char=5, LowerCase=6, UpperCase=7, 
		Digits=8, Digit=9, ObjectBeginn=10, ObjectEnd=11, AttributeSeparator=12, 
		LevelNameId=13, LevelNameValue=14, ConfigsId=15, LevelTimeId=16, LevelTimeValue=17, 
		PlayerId=18, Speed=19, SpeedId=20, SpeedValue=21, DrinkSpeed=22, DrinkSpeedId=23, 
		DrinkSpeedValue=24, EnemyAttribute=25, AttributeName=26, MapRepresentation=27, 
		MapRepresentationValue=28, AttributeAttackTarget=29, AttackTargetValue=30, 
		AttributeAttackValue=31, MapSetUp=32, Row=33, MapValue=34, Character=35, 
		Building=36, Spaeti=37, Street=38;
	public static final int
		RULE_file = 0, RULE_levelName = 1, RULE_levelConfigs = 2, RULE_configs = 3, 
		RULE_player = 4, RULE_playerAttributes = 5, RULE_enemies = 6, RULE_map = 7;
	public static final String[] ruleNames = {
		"file", "levelName", "levelConfigs", "configs", "player", "playerAttributes", 
		"enemies", "map"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'enemies {'", "'map {'", null, null, null, null, null, null, null, 
		"' {'", "'}'", "','", "'levelName:'", null, "'levelConfiguration'", "'levelTime:'", 
		null, "'player'", null, "'speed:'", null, null, "'drinkSpeed:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Linebreak", "Alphabet", "Char", "LowerCase", "UpperCase", 
		"Digits", "Digit", "ObjectBeginn", "ObjectEnd", "AttributeSeparator", 
		"LevelNameId", "LevelNameValue", "ConfigsId", "LevelTimeId", "LevelTimeValue", 
		"PlayerId", "Speed", "SpeedId", "SpeedValue", "DrinkSpeed", "DrinkSpeedId", 
		"DrinkSpeedValue", "EnemyAttribute", "AttributeName", "MapRepresentation", 
		"MapRepresentationValue", "AttributeAttackTarget", "AttackTargetValue", 
		"AttributeAttackValue", "MapSetUp", "Row", "MapValue", "Character", "Building", 
		"Spaeti", "Street"
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

	@Override
	public String getGrammarFileName() { return "LevelGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LevelGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public LevelNameContext levelName() {
			return getRuleContext(LevelNameContext.class,0);
		}
		public List<TerminalNode> Linebreak() { return getTokens(LevelGrammarParser.Linebreak); }
		public TerminalNode Linebreak(int i) {
			return getToken(LevelGrammarParser.Linebreak, i);
		}
		public LevelConfigsContext levelConfigs() {
			return getRuleContext(LevelConfigsContext.class,0);
		}
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public EnemiesContext enemies() {
			return getRuleContext(EnemiesContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LevelGrammarParser.EOF, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			levelName();
			setState(17);
			match(Linebreak);
			setState(18);
			levelConfigs();
			setState(19);
			match(Linebreak);
			setState(20);
			player();
			setState(21);
			match(Linebreak);
			setState(22);
			enemies();
			setState(23);
			match(Linebreak);
			setState(24);
			map();
			setState(25);
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

	public static class LevelNameContext extends ParserRuleContext {
		public TerminalNode LevelNameId() { return getToken(LevelGrammarParser.LevelNameId, 0); }
		public TerminalNode LevelNameValue() { return getToken(LevelGrammarParser.LevelNameValue, 0); }
		public LevelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterLevelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitLevelName(this);
		}
	}

	public final LevelNameContext levelName() throws RecognitionException {
		LevelNameContext _localctx = new LevelNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_levelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(LevelNameId);
			setState(28);
			match(LevelNameValue);
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

	public static class LevelConfigsContext extends ParserRuleContext {
		public TerminalNode ConfigsId() { return getToken(LevelGrammarParser.ConfigsId, 0); }
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public ConfigsContext configs() {
			return getRuleContext(ConfigsContext.class,0);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
		public LevelConfigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelConfigs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterLevelConfigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitLevelConfigs(this);
		}
	}

	public final LevelConfigsContext levelConfigs() throws RecognitionException {
		LevelConfigsContext _localctx = new LevelConfigsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_levelConfigs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(ConfigsId);
			setState(31);
			match(ObjectBeginn);
			setState(32);
			configs();
			setState(33);
			match(ObjectEnd);
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

	public static class ConfigsContext extends ParserRuleContext {
		public TerminalNode LevelTimeId() { return getToken(LevelGrammarParser.LevelTimeId, 0); }
		public TerminalNode LevelTimeValue() { return getToken(LevelGrammarParser.LevelTimeValue, 0); }
		public ConfigsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterConfigs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitConfigs(this);
		}
	}

	public final ConfigsContext configs() throws RecognitionException {
		ConfigsContext _localctx = new ConfigsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_configs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LevelTimeId);
			setState(36);
			match(LevelTimeValue);
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

	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode PlayerId() { return getToken(LevelGrammarParser.PlayerId, 0); }
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public PlayerAttributesContext playerAttributes() {
			return getRuleContext(PlayerAttributesContext.class,0);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitPlayer(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(PlayerId);
			setState(39);
			match(ObjectBeginn);
			setState(40);
			playerAttributes();
			setState(41);
			match(ObjectEnd);
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

	public static class PlayerAttributesContext extends ParserRuleContext {
		public TerminalNode Speed() { return getToken(LevelGrammarParser.Speed, 0); }
		public TerminalNode AttributeSeparator() { return getToken(LevelGrammarParser.AttributeSeparator, 0); }
		public TerminalNode DrinkSpeed() { return getToken(LevelGrammarParser.DrinkSpeed, 0); }
		public PlayerAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterPlayerAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitPlayerAttributes(this);
		}
	}

	public final PlayerAttributesContext playerAttributes() throws RecognitionException {
		PlayerAttributesContext _localctx = new PlayerAttributesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_playerAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(Speed);
			setState(44);
			match(AttributeSeparator);
			setState(45);
			match(DrinkSpeed);
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

	public static class EnemiesContext extends ParserRuleContext {
		public TerminalNode EnemyAttribute() { return getToken(LevelGrammarParser.EnemyAttribute, 0); }
		public EnemiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterEnemies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitEnemies(this);
		}
	}

	public final EnemiesContext enemies() throws RecognitionException {
		EnemiesContext _localctx = new EnemiesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enemies);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(EnemyAttribute);
			setState(49);
			match(ObjectEnd);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode MapSetUp() { return getToken(LevelGrammarParser.MapSetUp, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__1);
			setState(52);
			match(MapSetUp);
			setState(53);
			match(ObjectEnd);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(:\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\2\61\2\22\3\2\2\2\4\35\3\2\2\2\6 \3\2\2\2\b%"+
		"\3\2\2\2\n(\3\2\2\2\f-\3\2\2\2\16\61\3\2\2\2\20\65\3\2\2\2\22\23\5\4\3"+
		"\2\23\24\7\5\2\2\24\25\5\6\4\2\25\26\7\5\2\2\26\27\5\n\6\2\27\30\7\5\2"+
		"\2\30\31\5\16\b\2\31\32\7\5\2\2\32\33\5\20\t\2\33\34\7\2\2\3\34\3\3\2"+
		"\2\2\35\36\7\17\2\2\36\37\7\20\2\2\37\5\3\2\2\2 !\7\21\2\2!\"\7\f\2\2"+
		"\"#\5\b\5\2#$\7\r\2\2$\7\3\2\2\2%&\7\22\2\2&\'\7\23\2\2\'\t\3\2\2\2()"+
		"\7\24\2\2)*\7\f\2\2*+\5\f\7\2+,\7\r\2\2,\13\3\2\2\2-.\7\25\2\2./\7\16"+
		"\2\2/\60\7\30\2\2\60\r\3\2\2\2\61\62\7\3\2\2\62\63\7\33\2\2\63\64\7\r"+
		"\2\2\64\17\3\2\2\2\65\66\7\4\2\2\66\67\7\"\2\2\678\7\r\2\28\21\3\2\2\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}