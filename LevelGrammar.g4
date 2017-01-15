grammar LevelGrammar;

file : levelName Linebreak levelConfigs Linebreak player Linebreak enemies Linebreak map EOF;

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
levelName: LevelNameId nameValue;
LevelNameId: 'levelName:';
nameValue: Alphabet;

//the level configuration like playing time or music etc.
levelConfigs: ConfigsId ObjectBeginn configs ObjectEnd ;
ConfigsId: 'levelConfiguration';
configs:  LevelTimeId levelTimeValue;
LevelTimeId:'levelTime:';
levelTimeValue: Digits;

//the player and its attributes
player: PlayerId ObjectBeginn playerAttributes ObjectEnd ;
PlayerId: 'player';
playerAttributes:  speed AttributeSeparator drinkSpeed;
speed: SpeedId speedValue;
SpeedId: 'speed:';
speedValue: Digits;
drinkSpeed: DrinkSpeedId drinkSpeedValue;
DrinkSpeedId: 'drinkSpeed:';
drinkSpeedValue: Digits;


//enemies and their attributes
enemies:EnemiesId ObjectBeginn enemyAttribute ObjectEnd;
EnemiesId: 'enemies';
enemyAttribute: enemyName AttributeSeparator mapRepresentation AttributeSeparator speed AttributeSeparator
                 attackTarget AttributeSeparator attackValue;
enemyName: NameId nameValue;
NameId: 'name:';
mapRepresentation: MapRepresentationId mapRepresentationValue;
MapRepresentationId: 'mapRepresentation:';
mapRepresentationValue: Digit;
attackTarget: AttackTargetId AttackTargetValue;
AttackTargetId: 'attack-target:' ;
AttackTargetValue:'drink' | 'time' | 'playerSpeed';
attackValue: AttackValueId attackValueValue;
AttackValueId:'attackValue:';
attackValueValue: Digits;

//the map of the level includes the map objects play and enemy start positions
// check when parsing that maps have always the same size (800*640 px) while each mapValue is a 32*32px block.
// so there must be 20 rows and each row got 25 mapvalues
map: MapId ObjectBeginn mapSetUp ObjectEnd;
MapId: 'map';
mapSetUp: row (row)*;
row: mapValue (mapValue)* Linebreak;
mapValue: Street | Building | Character;
Character: 'X' | Digit; // X is player spawn, the digit is for the enemy class
Building: 'H' | Spaeti;   //H is for House
Spaeti: '<' | '>' | '^' | 'V'; // symbols in which direction the spaeti opens
Street: 'S' | 'P'; //S is for street and p is for park