grammar LevelGrammar;

file : levelName Linebreak levelConfigs Linebreak player Linebreak enemies Linebreak map EOF;

//TODO alle Values klein schreiben, und alle Ids groß, damit entsprechend im listener die Methoden vorhanden sind
// eine kleingeschriebene Definition erzeugt eine Methode im BaseListener, eine Große nicht

// helper definitions
Linebreak: '\r'?'\n' | '\r' ;
Alphabet: Char (Char)*;
Char: LowerCase | UpperCase | Digit;
LowerCase: 'a'..'z';
UpperCase: 'A'..'Z';
Digits: Digit (Digit)*;
Digit: [0-9];
ObjectBeginn: ' {';
ObjectEnd: '}';
AttributeSeparator: ',';


//name of the generating level
levelName: LevelNameId LevelNameValue;
LevelNameId: 'levelName:';
LevelNameValue: Alphabet;

//the level configuration like playing time or music etc.
levelConfigs: ConfigsId ObjectBeginn configs ObjectEnd ;
ConfigsId: 'levelConfiguration';
configs:  LevelTimeId LevelTimeValue;
LevelTimeId:'levelTime:';
LevelTimeValue: Digits;

//the player and its attributes
player: PlayerId ObjectBeginn playerAttributes ObjectEnd ;
PlayerId: 'player';
playerAttributes:  speed AttributeSeparator DrinkSpeed;
speed: SpeedId speedValue;
SpeedId: 'speed:';
speedValue: Digits;
DrinkSpeed: DrinkSpeedId DrinkSpeedValue;
DrinkSpeedId: 'drinkSpeed:';
DrinkSpeedValue: Digits;


//enemies and their attributes
enemies:'enemies {' EnemyAttribute '}';
EnemyAttribute: AttributeName AttributeSeparator [Linebreak] Speed AttributeSeparator [Linebreak]
                 AttributeAttackTarget AttributeSeparator [Linebreak] AttributeAttackValue;
AttributeName:'name:' Char (Char)*;
MapRepresentation: 'mapRepresentation:' MapRepresentationValue;
MapRepresentationValue: [1-9];
AttributeAttackTarget: 'attack-target:' AttackTargetValue;
AttackTargetValue:'drink' | 'time' | 'playerSpeed';
AttributeAttackValue: 'attackValue:' Digit Digit;

//the map of the level includes the map objects play and enemy start positions
// check when parsing that maps have always the same size (800*640 px) while each mapValue is a 32*32px block.
// so there must be 20 rows and each row got 25 mapvalues
map: 'map {' MapSetUp '}';
MapSetUp: Row (Row)*;
Row: MapValue* Linebreak;
MapValue: Street | Building | Character;
Character: 'X' | MapRepresentation;
Building: 'H' | Spaeti;   //H is for House
Spaeti: '<' | '>' | '^' | 'V'; // symbols in which direction the spaeti opens
Street: 'S' | 'P'; //S is for street and p is for park