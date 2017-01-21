// Generated from C:/Users/Robin/beuth/master/se/semester_projekt/repo/nbno-level-generator/src/grammar\LevelGrammar.g4 by ANTLR 4.5.3
package grammar;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ALPHABET=27, DIGITS=28, ObjectBeginn=29, ObjectEnd=30, 
		Separator=31, WS=32;
	public static final int
		RULE_file = 0, RULE_levelName = 1, RULE_nameValue = 2, RULE_levelConfigs = 3, 
		RULE_configs = 4, RULE_levelTime = 5, RULE_levelTimeValue = 6, RULE_player = 7, 
		RULE_playerAttributes = 8, RULE_speed = 9, RULE_speedValue = 10, RULE_drinkSpeed = 11, 
		RULE_drinkSpeedValue = 12, RULE_beerLevel = 13, RULE_beerLevelValue = 14, 
		RULE_enemies = 15, RULE_enemy = 16, RULE_mapRepresentation = 17, RULE_enemyAttribute = 18, 
		RULE_enemyName = 19, RULE_enemyNameValue = 20, RULE_attackTarget = 21, 
		RULE_attackTargetValue = 22, RULE_damage = 23, RULE_damageValue = 24, 
		RULE_ki = 25, RULE_kiValue = 26, RULE_visualRange = 27, RULE_intelligence = 28, 
		RULE_map = 29, RULE_mapValue = 30, RULE_row = 31, RULE_block = 32, RULE_building = 33, 
		RULE_character = 34;
	public static final String[] ruleNames = {
		"file", "levelName", "nameValue", "levelConfigs", "configs", "levelTime", 
		"levelTimeValue", "player", "playerAttributes", "speed", "speedValue", 
		"drinkSpeed", "drinkSpeedValue", "beerLevel", "beerLevelValue", "enemies", 
		"enemy", "mapRepresentation", "enemyAttribute", "enemyName", "enemyNameValue", 
		"attackTarget", "attackTargetValue", "damage", "damageValue", "ki", "kiValue", 
		"visualRange", "intelligence", "map", "mapValue", "row", "block", "building", 
		"character"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'levelName:'", "'levelConfiguration'", "'levelTime:'", "'player'", 
		"'speed:'", "'drinkSpeed:'", "'beerLevel:'", "'enemies'", "'name:'", "'attackTarget:'", 
		"'drink'", "'playerSpeed'", "'damage:'", "'ki:'", "'('", "'|'", "')'", 
		"'map'", "'H'", "'<'", "'>'", "'^'", "'V'", "'S'", "'P'", "'X'", null, 
		null, "'{'", "'}'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ALPHABET", "DIGITS", "ObjectBeginn", "ObjectEnd", "Separator", 
		"WS"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			levelName();
			setState(71);
			levelConfigs();
			setState(72);
			player();
			setState(73);
			enemies();
			setState(74);
			map();
			setState(75);
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
		public NameValueContext nameValue() {
			return getRuleContext(NameValueContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitLevelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelNameContext levelName() throws RecognitionException {
		LevelNameContext _localctx = new LevelNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_levelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			nameValue();
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

	public static class NameValueContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(LevelGrammarParser.ALPHABET, 0); }
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ALPHABET);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitLevelConfigs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelConfigsContext levelConfigs() throws RecognitionException {
		LevelConfigsContext _localctx = new LevelConfigsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_levelConfigs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__1);
			setState(83);
			match(ObjectBeginn);
			setState(84);
			configs();
			setState(85);
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
		public LevelTimeContext levelTime() {
			return getRuleContext(LevelTimeContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitConfigs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigsContext configs() throws RecognitionException {
		ConfigsContext _localctx = new ConfigsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_configs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			levelTime();
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

	public static class LevelTimeContext extends ParserRuleContext {
		public LevelTimeValueContext levelTimeValue() {
			return getRuleContext(LevelTimeValueContext.class,0);
		}
		public LevelTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterLevelTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitLevelTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitLevelTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelTimeContext levelTime() throws RecognitionException {
		LevelTimeContext _localctx = new LevelTimeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_levelTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			setState(90);
			levelTimeValue();
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

	public static class LevelTimeValueContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public LevelTimeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelTimeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterLevelTimeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitLevelTimeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitLevelTimeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelTimeValueContext levelTimeValue() throws RecognitionException {
		LevelTimeValueContext _localctx = new LevelTimeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_levelTimeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DIGITS);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__3);
			setState(95);
			match(ObjectBeginn);
			setState(96);
			playerAttributes();
			setState(97);
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
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(LevelGrammarParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(LevelGrammarParser.Separator, i);
		}
		public DrinkSpeedContext drinkSpeed() {
			return getRuleContext(DrinkSpeedContext.class,0);
		}
		public BeerLevelContext beerLevel() {
			return getRuleContext(BeerLevelContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitPlayerAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerAttributesContext playerAttributes() throws RecognitionException {
		PlayerAttributesContext _localctx = new PlayerAttributesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_playerAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			speed();
			setState(100);
			match(Separator);
			setState(101);
			drinkSpeed();
			setState(102);
			match(Separator);
			setState(103);
			beerLevel();
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

	public static class SpeedContext extends ParserRuleContext {
		public SpeedValueContext speedValue() {
			return getRuleContext(SpeedValueContext.class,0);
		}
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
			setState(106);
			speedValue();
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

	public static class SpeedValueContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public SpeedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterSpeedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitSpeedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitSpeedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedValueContext speedValue() throws RecognitionException {
		SpeedValueContext _localctx = new SpeedValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_speedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(DIGITS);
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

	public static class DrinkSpeedContext extends ParserRuleContext {
		public DrinkSpeedValueContext drinkSpeedValue() {
			return getRuleContext(DrinkSpeedValueContext.class,0);
		}
		public DrinkSpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drinkSpeed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterDrinkSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitDrinkSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitDrinkSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrinkSpeedContext drinkSpeed() throws RecognitionException {
		DrinkSpeedContext _localctx = new DrinkSpeedContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drinkSpeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__5);
			setState(111);
			drinkSpeedValue();
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

	public static class DrinkSpeedValueContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public DrinkSpeedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drinkSpeedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterDrinkSpeedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitDrinkSpeedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitDrinkSpeedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrinkSpeedValueContext drinkSpeedValue() throws RecognitionException {
		DrinkSpeedValueContext _localctx = new DrinkSpeedValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drinkSpeedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(DIGITS);
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

	public static class BeerLevelContext extends ParserRuleContext {
		public BeerLevelValueContext beerLevelValue() {
			return getRuleContext(BeerLevelValueContext.class,0);
		}
		public BeerLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beerLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterBeerLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitBeerLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitBeerLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeerLevelContext beerLevel() throws RecognitionException {
		BeerLevelContext _localctx = new BeerLevelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_beerLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__6);
			setState(116);
			beerLevelValue();
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

	public static class BeerLevelValueContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public BeerLevelValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beerLevelValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterBeerLevelValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitBeerLevelValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitBeerLevelValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeerLevelValueContext beerLevelValue() throws RecognitionException {
		BeerLevelValueContext _localctx = new BeerLevelValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_beerLevelValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(DIGITS);
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
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public List<EnemyContext> enemy() {
			return getRuleContexts(EnemyContext.class);
		}
		public EnemyContext enemy(int i) {
			return getRuleContext(EnemyContext.class,i);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
		public List<TerminalNode> Separator() { return getTokens(LevelGrammarParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(LevelGrammarParser.Separator, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitEnemies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemiesContext enemies() throws RecognitionException {
		EnemiesContext _localctx = new EnemiesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enemies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__7);
			setState(121);
			match(ObjectBeginn);
			setState(122);
			enemy();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(123);
				match(Separator);
				setState(124);
				enemy();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
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

	public static class EnemyContext extends ParserRuleContext {
		public MapRepresentationContext mapRepresentation() {
			return getRuleContext(MapRepresentationContext.class,0);
		}
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public EnemyAttributeContext enemyAttribute() {
			return getRuleContext(EnemyAttributeContext.class,0);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
		public EnemyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterEnemy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitEnemy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitEnemy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyContext enemy() throws RecognitionException {
		EnemyContext _localctx = new EnemyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enemy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			mapRepresentation();
			setState(133);
			match(ObjectBeginn);
			setState(134);
			enemyAttribute();
			setState(135);
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

	public static class MapRepresentationContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public MapRepresentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapRepresentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterMapRepresentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitMapRepresentation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitMapRepresentation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapRepresentationContext mapRepresentation() throws RecognitionException {
		MapRepresentationContext _localctx = new MapRepresentationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mapRepresentation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DIGITS);
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

	public static class EnemyAttributeContext extends ParserRuleContext {
		public EnemyNameContext enemyName() {
			return getRuleContext(EnemyNameContext.class,0);
		}
		public List<TerminalNode> Separator() { return getTokens(LevelGrammarParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(LevelGrammarParser.Separator, i);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public AttackTargetContext attackTarget() {
			return getRuleContext(AttackTargetContext.class,0);
		}
		public DamageContext damage() {
			return getRuleContext(DamageContext.class,0);
		}
		public KiContext ki() {
			return getRuleContext(KiContext.class,0);
		}
		public EnemyAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemyAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterEnemyAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitEnemyAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitEnemyAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyAttributeContext enemyAttribute() throws RecognitionException {
		EnemyAttributeContext _localctx = new EnemyAttributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enemyAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			enemyName();
			setState(140);
			match(Separator);
			setState(141);
			speed();
			setState(142);
			match(Separator);
			setState(143);
			attackTarget();
			setState(144);
			match(Separator);
			setState(145);
			damage();
			setState(146);
			match(Separator);
			setState(147);
			ki();
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

	public static class EnemyNameContext extends ParserRuleContext {
		public EnemyNameValueContext enemyNameValue() {
			return getRuleContext(EnemyNameValueContext.class,0);
		}
		public EnemyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterEnemyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitEnemyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitEnemyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyNameContext enemyName() throws RecognitionException {
		EnemyNameContext _localctx = new EnemyNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_enemyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__8);
			setState(150);
			enemyNameValue();
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

	public static class EnemyNameValueContext extends ParserRuleContext {
		public TerminalNode ALPHABET() { return getToken(LevelGrammarParser.ALPHABET, 0); }
		public EnemyNameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enemyNameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterEnemyNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitEnemyNameValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitEnemyNameValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnemyNameValueContext enemyNameValue() throws RecognitionException {
		EnemyNameValueContext _localctx = new EnemyNameValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enemyNameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ALPHABET);
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

	public static class AttackTargetContext extends ParserRuleContext {
		public AttackTargetValueContext attackTargetValue() {
			return getRuleContext(AttackTargetValueContext.class,0);
		}
		public AttackTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterAttackTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitAttackTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitAttackTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackTargetContext attackTarget() throws RecognitionException {
		AttackTargetContext _localctx = new AttackTargetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attackTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__9);
			setState(155);
			attackTargetValue();
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

	public static class AttackTargetValueContext extends ParserRuleContext {
		public AttackTargetValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackTargetValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterAttackTargetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitAttackTargetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitAttackTargetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackTargetValueContext attackTargetValue() throws RecognitionException {
		AttackTargetValueContext _localctx = new AttackTargetValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attackTargetValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class DamageContext extends ParserRuleContext {
		public DamageValueContext damageValue() {
			return getRuleContext(DamageValueContext.class,0);
		}
		public DamageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterDamage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitDamage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitDamage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DamageContext damage() throws RecognitionException {
		DamageContext _localctx = new DamageContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_damage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__12);
			setState(160);
			damageValue();
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

	public static class DamageValueContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public DamageValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_damageValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterDamageValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitDamageValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitDamageValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DamageValueContext damageValue() throws RecognitionException {
		DamageValueContext _localctx = new DamageValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_damageValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(DIGITS);
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

	public static class KiContext extends ParserRuleContext {
		public KiValueContext kiValue() {
			return getRuleContext(KiValueContext.class,0);
		}
		public KiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterKi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitKi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitKi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KiContext ki() throws RecognitionException {
		KiContext _localctx = new KiContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			setState(165);
			kiValue();
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

	public static class KiValueContext extends ParserRuleContext {
		public VisualRangeContext visualRange() {
			return getRuleContext(VisualRangeContext.class,0);
		}
		public IntelligenceContext intelligence() {
			return getRuleContext(IntelligenceContext.class,0);
		}
		public KiValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kiValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterKiValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitKiValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitKiValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KiValueContext kiValue() throws RecognitionException {
		KiValueContext _localctx = new KiValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_kiValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__14);
			setState(168);
			visualRange();
			setState(169);
			match(T__15);
			setState(170);
			intelligence();
			setState(171);
			match(T__16);
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

	public static class VisualRangeContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public VisualRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visualRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterVisualRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitVisualRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitVisualRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisualRangeContext visualRange() throws RecognitionException {
		VisualRangeContext _localctx = new VisualRangeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_visualRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(DIGITS);
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

	public static class IntelligenceContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public IntelligenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intelligence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterIntelligence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitIntelligence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitIntelligence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntelligenceContext intelligence() throws RecognitionException {
		IntelligenceContext _localctx = new IntelligenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_intelligence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(DIGITS);
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
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__17);
			setState(178);
			match(ObjectBeginn);
			setState(179);
			mapValue();
			setState(180);
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

	public static class MapValueContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public MapValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterMapValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitMapValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitMapValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapValueContext mapValue() throws RecognitionException {
		MapValueContext _localctx = new MapValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mapValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			row();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << DIGITS))) != 0)) {
				{
				{
				setState(183);
				row();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class RowContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Separator() { return getTokens(LevelGrammarParser.Separator); }
		public TerminalNode Separator(int i) {
			return getToken(LevelGrammarParser.Separator, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitRow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitRow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			block();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Separator) {
				{
				{
				setState(190);
				match(Separator);
				setState(191);
				block();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BlockContext extends ParserRuleContext {
		public BuildingContext building() {
			return getRuleContext(BuildingContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_block);
		try {
			setState(199);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				building();
				}
				break;
			case T__25:
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				character();
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

	public static class BuildingContext extends ParserRuleContext {
		public BuildingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_building; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterBuilding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitBuilding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitBuilding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildingContext building() throws RecognitionException {
		BuildingContext _localctx = new BuildingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_building);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(LevelGrammarParser.DIGITS, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LevelGrammarVisitor ) return ((LevelGrammarVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==DIGITS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u0080\n\21\f\21"+
		"\16\21\u0083\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \7 \u00bb\n \f \16 \u00be\13 \3!\3!\3!\7!\u00c3\n!\f!\16!\u00c6\13"+
		"!\3\"\3\"\5\"\u00ca\n\"\3#\3#\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\5\3\2\r\16\3\2\25\33\4\2\34"+
		"\34\36\36\u00b0\2H\3\2\2\2\4O\3\2\2\2\6R\3\2\2\2\bT\3\2\2\2\nY\3\2\2\2"+
		"\f[\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22e\3\2\2\2\24k\3\2\2\2\26n\3\2\2"+
		"\2\30p\3\2\2\2\32s\3\2\2\2\34u\3\2\2\2\36x\3\2\2\2 z\3\2\2\2\"\u0086\3"+
		"\2\2\2$\u008b\3\2\2\2&\u008d\3\2\2\2(\u0097\3\2\2\2*\u009a\3\2\2\2,\u009c"+
		"\3\2\2\2.\u009f\3\2\2\2\60\u00a1\3\2\2\2\62\u00a4\3\2\2\2\64\u00a6\3\2"+
		"\2\2\66\u00a9\3\2\2\28\u00af\3\2\2\2:\u00b1\3\2\2\2<\u00b3\3\2\2\2>\u00b8"+
		"\3\2\2\2@\u00bf\3\2\2\2B\u00c9\3\2\2\2D\u00cb\3\2\2\2F\u00cd\3\2\2\2H"+
		"I\5\4\3\2IJ\5\b\5\2JK\5\20\t\2KL\5 \21\2LM\5<\37\2MN\7\2\2\3N\3\3\2\2"+
		"\2OP\7\3\2\2PQ\5\6\4\2Q\5\3\2\2\2RS\7\35\2\2S\7\3\2\2\2TU\7\4\2\2UV\7"+
		"\37\2\2VW\5\n\6\2WX\7 \2\2X\t\3\2\2\2YZ\5\f\7\2Z\13\3\2\2\2[\\\7\5\2\2"+
		"\\]\5\16\b\2]\r\3\2\2\2^_\7\36\2\2_\17\3\2\2\2`a\7\6\2\2ab\7\37\2\2bc"+
		"\5\22\n\2cd\7 \2\2d\21\3\2\2\2ef\5\24\13\2fg\7!\2\2gh\5\30\r\2hi\7!\2"+
		"\2ij\5\34\17\2j\23\3\2\2\2kl\7\7\2\2lm\5\26\f\2m\25\3\2\2\2no\7\36\2\2"+
		"o\27\3\2\2\2pq\7\b\2\2qr\5\32\16\2r\31\3\2\2\2st\7\36\2\2t\33\3\2\2\2"+
		"uv\7\t\2\2vw\5\36\20\2w\35\3\2\2\2xy\7\36\2\2y\37\3\2\2\2z{\7\n\2\2{|"+
		"\7\37\2\2|\u0081\5\"\22\2}~\7!\2\2~\u0080\5\"\22\2\177}\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0085\7 \2\2\u0085!\3\2\2\2\u0086\u0087\5"+
		"$\23\2\u0087\u0088\7\37\2\2\u0088\u0089\5&\24\2\u0089\u008a\7 \2\2\u008a"+
		"#\3\2\2\2\u008b\u008c\7\36\2\2\u008c%\3\2\2\2\u008d\u008e\5(\25\2\u008e"+
		"\u008f\7!\2\2\u008f\u0090\5\24\13\2\u0090\u0091\7!\2\2\u0091\u0092\5,"+
		"\27\2\u0092\u0093\7!\2\2\u0093\u0094\5\60\31\2\u0094\u0095\7!\2\2\u0095"+
		"\u0096\5\64\33\2\u0096\'\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\5*\26"+
		"\2\u0099)\3\2\2\2\u009a\u009b\7\35\2\2\u009b+\3\2\2\2\u009c\u009d\7\f"+
		"\2\2\u009d\u009e\5.\30\2\u009e-\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0/\3\2"+
		"\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\62\32\2\u00a3\61\3\2\2\2\u00a4"+
		"\u00a5\7\36\2\2\u00a5\63\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5\66"+
		"\34\2\u00a8\65\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\58\35\2\u00ab"+
		"\u00ac\7\22\2\2\u00ac\u00ad\5:\36\2\u00ad\u00ae\7\23\2\2\u00ae\67\3\2"+
		"\2\2\u00af\u00b0\7\36\2\2\u00b09\3\2\2\2\u00b1\u00b2\7\36\2\2\u00b2;\3"+
		"\2\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\7\37\2\2\u00b5\u00b6\5> \2\u00b6"+
		"\u00b7\7 \2\2\u00b7=\3\2\2\2\u00b8\u00bc\5@!\2\u00b9\u00bb\5@!\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd?\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c4\5B\"\2\u00c0\u00c1"+
		"\7!\2\2\u00c1\u00c3\5B\"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5A\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c7\u00ca\5D#\2\u00c8\u00ca\5F$\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3"+
		"\2\2\2\u00caC\3\2\2\2\u00cb\u00cc\t\3\2\2\u00ccE\3\2\2\2\u00cd\u00ce\t"+
		"\4\2\2\u00ceG\3\2\2\2\6\u0081\u00bc\u00c4\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}