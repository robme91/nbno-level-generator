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
		Linebreak=1, Alphabet=2, Char=3, LowerCase=4, UpperCase=5, Digits=6, Digit=7, 
		ObjectBeginn=8, ObjectEnd=9, AttributeSeparator=10, LevelNameId=11, ConfigsId=12, 
		LevelTimeId=13, PlayerId=14, SpeedId=15, DrinkSpeedId=16, EnemiesId=17, 
		NameId=18, MapRepresentationId=19, AttackTargetId=20, AttackTargetValue=21, 
		AttackValueId=22, MapId=23, Character=24, Building=25, Spaeti=26, Street=27;
	public static final int
		RULE_file = 0, RULE_levelName = 1, RULE_nameValue = 2, RULE_levelConfigs = 3, 
		RULE_configs = 4, RULE_levelTimeValue = 5, RULE_player = 6, RULE_playerAttributes = 7, 
		RULE_speed = 8, RULE_speedValue = 9, RULE_drinkSpeed = 10, RULE_drinkSpeedValue = 11, 
		RULE_enemies = 12, RULE_enemyAttribute = 13, RULE_enemyName = 14, RULE_mapRepresentation = 15, 
		RULE_mapRepresentationValue = 16, RULE_attackTarget = 17, RULE_attackValue = 18, 
		RULE_attackValueValue = 19, RULE_map = 20, RULE_mapSetUp = 21, RULE_row = 22, 
		RULE_mapValue = 23;
	public static final String[] ruleNames = {
		"file", "levelName", "nameValue", "levelConfigs", "configs", "levelTimeValue", 
		"player", "playerAttributes", "speed", "speedValue", "drinkSpeed", "drinkSpeedValue", 
		"enemies", "enemyAttribute", "enemyName", "mapRepresentation", "mapRepresentationValue", 
		"attackTarget", "attackValue", "attackValueValue", "map", "mapSetUp", 
		"row", "mapValue"
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
			setState(48);
			levelName();
			setState(49);
			match(Linebreak);
			setState(50);
			levelConfigs();
			setState(51);
			match(Linebreak);
			setState(52);
			player();
			setState(53);
			match(Linebreak);
			setState(54);
			enemies();
			setState(55);
			match(Linebreak);
			setState(56);
			map();
			setState(57);
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
	}

	public final LevelNameContext levelName() throws RecognitionException {
		LevelNameContext _localctx = new LevelNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_levelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LevelNameId);
			setState(60);
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
		public TerminalNode Alphabet() { return getToken(LevelGrammarParser.Alphabet, 0); }
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
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Alphabet);
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
		enterRule(_localctx, 6, RULE_levelConfigs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ConfigsId);
			setState(65);
			match(ObjectBeginn);
			setState(66);
			configs();
			setState(67);
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
		public LevelTimeValueContext levelTimeValue() {
			return getRuleContext(LevelTimeValueContext.class,0);
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
	}

	public final ConfigsContext configs() throws RecognitionException {
		ConfigsContext _localctx = new ConfigsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_configs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LevelTimeId);
			setState(70);
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
		public TerminalNode Digits() { return getToken(LevelGrammarParser.Digits, 0); }
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
	}

	public final LevelTimeValueContext levelTimeValue() throws RecognitionException {
		LevelTimeValueContext _localctx = new LevelTimeValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_levelTimeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(Digits);
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
		enterRule(_localctx, 12, RULE_player);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PlayerId);
			setState(75);
			match(ObjectBeginn);
			setState(76);
			playerAttributes();
			setState(77);
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
		public TerminalNode AttributeSeparator() { return getToken(LevelGrammarParser.AttributeSeparator, 0); }
		public DrinkSpeedContext drinkSpeed() {
			return getRuleContext(DrinkSpeedContext.class,0);
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
	}

	public final PlayerAttributesContext playerAttributes() throws RecognitionException {
		PlayerAttributesContext _localctx = new PlayerAttributesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_playerAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			speed();
			setState(80);
			match(AttributeSeparator);
			setState(81);
			drinkSpeed();
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
		public TerminalNode SpeedId() { return getToken(LevelGrammarParser.SpeedId, 0); }
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
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SpeedId);
			setState(84);
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
		public TerminalNode Digits() { return getToken(LevelGrammarParser.Digits, 0); }
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
	}

	public final SpeedValueContext speedValue() throws RecognitionException {
		SpeedValueContext _localctx = new SpeedValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_speedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Digits);
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
		public TerminalNode DrinkSpeedId() { return getToken(LevelGrammarParser.DrinkSpeedId, 0); }
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
	}

	public final DrinkSpeedContext drinkSpeed() throws RecognitionException {
		DrinkSpeedContext _localctx = new DrinkSpeedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_drinkSpeed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DrinkSpeedId);
			setState(89);
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
		public TerminalNode Digits() { return getToken(LevelGrammarParser.Digits, 0); }
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
	}

	public final DrinkSpeedValueContext drinkSpeedValue() throws RecognitionException {
		DrinkSpeedValueContext _localctx = new DrinkSpeedValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drinkSpeedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(Digits);
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
		public TerminalNode EnemiesId() { return getToken(LevelGrammarParser.EnemiesId, 0); }
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public EnemyAttributeContext enemyAttribute() {
			return getRuleContext(EnemyAttributeContext.class,0);
		}
		public TerminalNode ObjectEnd() { return getToken(LevelGrammarParser.ObjectEnd, 0); }
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
		enterRule(_localctx, 24, RULE_enemies);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(EnemiesId);
			setState(94);
			match(ObjectBeginn);
			setState(95);
			enemyAttribute();
			setState(96);
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

	public static class EnemyAttributeContext extends ParserRuleContext {
		public EnemyNameContext enemyName() {
			return getRuleContext(EnemyNameContext.class,0);
		}
		public List<TerminalNode> AttributeSeparator() { return getTokens(LevelGrammarParser.AttributeSeparator); }
		public TerminalNode AttributeSeparator(int i) {
			return getToken(LevelGrammarParser.AttributeSeparator, i);
		}
		public MapRepresentationContext mapRepresentation() {
			return getRuleContext(MapRepresentationContext.class,0);
		}
		public SpeedContext speed() {
			return getRuleContext(SpeedContext.class,0);
		}
		public AttackTargetContext attackTarget() {
			return getRuleContext(AttackTargetContext.class,0);
		}
		public AttackValueContext attackValue() {
			return getRuleContext(AttackValueContext.class,0);
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
	}

	public final EnemyAttributeContext enemyAttribute() throws RecognitionException {
		EnemyAttributeContext _localctx = new EnemyAttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enemyAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			enemyName();
			setState(99);
			match(AttributeSeparator);
			setState(100);
			mapRepresentation();
			setState(101);
			match(AttributeSeparator);
			setState(102);
			speed();
			setState(103);
			match(AttributeSeparator);
			setState(104);
			attackTarget();
			setState(105);
			match(AttributeSeparator);
			setState(106);
			attackValue();
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
		public TerminalNode NameId() { return getToken(LevelGrammarParser.NameId, 0); }
		public NameValueContext nameValue() {
			return getRuleContext(NameValueContext.class,0);
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
	}

	public final EnemyNameContext enemyName() throws RecognitionException {
		EnemyNameContext _localctx = new EnemyNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enemyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NameId);
			setState(109);
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

	public static class MapRepresentationContext extends ParserRuleContext {
		public TerminalNode MapRepresentationId() { return getToken(LevelGrammarParser.MapRepresentationId, 0); }
		public MapRepresentationValueContext mapRepresentationValue() {
			return getRuleContext(MapRepresentationValueContext.class,0);
		}
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
	}

	public final MapRepresentationContext mapRepresentation() throws RecognitionException {
		MapRepresentationContext _localctx = new MapRepresentationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mapRepresentation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(MapRepresentationId);
			setState(112);
			mapRepresentationValue();
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

	public static class MapRepresentationValueContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(LevelGrammarParser.Digit, 0); }
		public MapRepresentationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapRepresentationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterMapRepresentationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitMapRepresentationValue(this);
		}
	}

	public final MapRepresentationValueContext mapRepresentationValue() throws RecognitionException {
		MapRepresentationValueContext _localctx = new MapRepresentationValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mapRepresentationValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Digit);
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
		public TerminalNode AttackTargetId() { return getToken(LevelGrammarParser.AttackTargetId, 0); }
		public TerminalNode AttackTargetValue() { return getToken(LevelGrammarParser.AttackTargetValue, 0); }
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
	}

	public final AttackTargetContext attackTarget() throws RecognitionException {
		AttackTargetContext _localctx = new AttackTargetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attackTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(AttackTargetId);
			setState(117);
			match(AttackTargetValue);
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

	public static class AttackValueContext extends ParserRuleContext {
		public TerminalNode AttackValueId() { return getToken(LevelGrammarParser.AttackValueId, 0); }
		public AttackValueValueContext attackValueValue() {
			return getRuleContext(AttackValueValueContext.class,0);
		}
		public AttackValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterAttackValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitAttackValue(this);
		}
	}

	public final AttackValueContext attackValue() throws RecognitionException {
		AttackValueContext _localctx = new AttackValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attackValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(AttackValueId);
			setState(120);
			attackValueValue();
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

	public static class AttackValueValueContext extends ParserRuleContext {
		public TerminalNode Digits() { return getToken(LevelGrammarParser.Digits, 0); }
		public AttackValueValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackValueValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterAttackValueValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitAttackValueValue(this);
		}
	}

	public final AttackValueValueContext attackValueValue() throws RecognitionException {
		AttackValueValueContext _localctx = new AttackValueValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attackValueValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(Digits);
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
		public TerminalNode MapId() { return getToken(LevelGrammarParser.MapId, 0); }
		public TerminalNode ObjectBeginn() { return getToken(LevelGrammarParser.ObjectBeginn, 0); }
		public MapSetUpContext mapSetUp() {
			return getRuleContext(MapSetUpContext.class,0);
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
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(MapId);
			setState(125);
			match(ObjectBeginn);
			setState(126);
			mapSetUp();
			setState(127);
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

	public static class MapSetUpContext extends ParserRuleContext {
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public MapSetUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSetUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).enterMapSetUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LevelGrammarListener ) ((LevelGrammarListener)listener).exitMapSetUp(this);
		}
	}

	public final MapSetUpContext mapSetUp() throws RecognitionException {
		MapSetUpContext _localctx = new MapSetUpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapSetUp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			row();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Character) | (1L << Building) | (1L << Street))) != 0)) {
				{
				{
				setState(130);
				row();
				}
				}
				setState(135);
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
		public List<MapValueContext> mapValue() {
			return getRuleContexts(MapValueContext.class);
		}
		public MapValueContext mapValue(int i) {
			return getRuleContext(MapValueContext.class,i);
		}
		public TerminalNode Linebreak() { return getToken(LevelGrammarParser.Linebreak, 0); }
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
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			mapValue();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Character) | (1L << Building) | (1L << Street))) != 0)) {
				{
				{
				setState(137);
				mapValue();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(Linebreak);
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
		public TerminalNode Street() { return getToken(LevelGrammarParser.Street, 0); }
		public TerminalNode Building() { return getToken(LevelGrammarParser.Building, 0); }
		public TerminalNode Character() { return getToken(LevelGrammarParser.Character, 0); }
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
	}

	public final MapValueContext mapValue() throws RecognitionException {
		MapValueContext _localctx = new MapValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mapValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Character) | (1L << Building) | (1L << Street))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\7\27\u0086\n\27\f\27\16\27\u0089\13\27\3\30\3"+
		"\30\7\30\u008d\n\30\f\30\16\30\u0090\13\30\3\30\3\30\3\31\3\31\3\31\2"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\4\2\32\33"+
		"\35\35\177\2\62\3\2\2\2\4=\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nG\3\2\2\2\f"+
		"J\3\2\2\2\16L\3\2\2\2\20Q\3\2\2\2\22U\3\2\2\2\24X\3\2\2\2\26Z\3\2\2\2"+
		"\30]\3\2\2\2\32_\3\2\2\2\34d\3\2\2\2\36n\3\2\2\2 q\3\2\2\2\"t\3\2\2\2"+
		"$v\3\2\2\2&y\3\2\2\2(|\3\2\2\2*~\3\2\2\2,\u0083\3\2\2\2.\u008a\3\2\2\2"+
		"\60\u0093\3\2\2\2\62\63\5\4\3\2\63\64\7\3\2\2\64\65\5\b\5\2\65\66\7\3"+
		"\2\2\66\67\5\16\b\2\678\7\3\2\289\5\32\16\29:\7\3\2\2:;\5*\26\2;<\7\2"+
		"\2\3<\3\3\2\2\2=>\7\r\2\2>?\5\6\4\2?\5\3\2\2\2@A\7\4\2\2A\7\3\2\2\2BC"+
		"\7\16\2\2CD\7\n\2\2DE\5\n\6\2EF\7\13\2\2F\t\3\2\2\2GH\7\17\2\2HI\5\f\7"+
		"\2I\13\3\2\2\2JK\7\b\2\2K\r\3\2\2\2LM\7\20\2\2MN\7\n\2\2NO\5\20\t\2OP"+
		"\7\13\2\2P\17\3\2\2\2QR\5\22\n\2RS\7\f\2\2ST\5\26\f\2T\21\3\2\2\2UV\7"+
		"\21\2\2VW\5\24\13\2W\23\3\2\2\2XY\7\b\2\2Y\25\3\2\2\2Z[\7\22\2\2[\\\5"+
		"\30\r\2\\\27\3\2\2\2]^\7\b\2\2^\31\3\2\2\2_`\7\23\2\2`a\7\n\2\2ab\5\34"+
		"\17\2bc\7\13\2\2c\33\3\2\2\2de\5\36\20\2ef\7\f\2\2fg\5 \21\2gh\7\f\2\2"+
		"hi\5\22\n\2ij\7\f\2\2jk\5$\23\2kl\7\f\2\2lm\5&\24\2m\35\3\2\2\2no\7\24"+
		"\2\2op\5\6\4\2p\37\3\2\2\2qr\7\25\2\2rs\5\"\22\2s!\3\2\2\2tu\7\t\2\2u"+
		"#\3\2\2\2vw\7\26\2\2wx\7\27\2\2x%\3\2\2\2yz\7\30\2\2z{\5(\25\2{\'\3\2"+
		"\2\2|}\7\b\2\2})\3\2\2\2~\177\7\31\2\2\177\u0080\7\n\2\2\u0080\u0081\5"+
		",\27\2\u0081\u0082\7\13\2\2\u0082+\3\2\2\2\u0083\u0087\5.\30\2\u0084\u0086"+
		"\5.\30\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088-\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008e\5\60\31"+
		"\2\u008b\u008d\5\60\31\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\7\3\2\2\u0092/\3\2\2\2\u0093\u0094\t\2\2\2\u0094\61\3"+
		"\2\2\2\4\u0087\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}