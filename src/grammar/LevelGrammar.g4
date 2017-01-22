grammar LevelGrammar;

file : levelName levelConfigs player enemies map EOF;

// helper definitions
ALPHABET: ('a'..'z' | 'A'..'Z')+;
DIGITS : [0-9]+;
ObjectBeginn:'{';
ObjectEnd: '}';
Separator: ',';
//WS :  ( ' ' | '\t' | '\r' | '\n') -> channel(HIDDEN) ; //hide witepsaces tabs and linebreaks
WS : [ \t\n\r]+ -> skip ; // skip witepsaces tabs and linebreaks

//name of the generating level
levelName: 'levelName:' levelNameValue;
levelNameValue: ALPHABET;

//the level configuration like playing time or music etc.
levelConfigs: 'levelConfiguration' ObjectBeginn configs ObjectEnd ;
configs: levelTime;
levelTime: 'levelTime:' levelTimeValue;
levelTimeValue: DIGITS ;

//the player and its attributes
player: 'player' ObjectBeginn playerAttributes ObjectEnd ;
playerAttributes:  speed Separator drinkSpeed Separator beerLevel;
speed: 'speed:' speedValue;
speedValue: DIGITS;
drinkSpeed: 'drinkSpeed:' drinkSpeedValue;
drinkSpeedValue: DIGITS;
beerLevel: 'beerLevel:' beerLevelValue;
beerLevelValue: DIGITS;


//enemies and their attributes
enemies:'enemies' ObjectBeginn enemy (Separator enemy)* ObjectEnd;
enemy: mapRepresentation ObjectBeginn enemyAttribute ObjectEnd;
mapRepresentation: DIGITS;
enemyAttribute: enemyName Separator speed Separator attackTarget Separator damage
                Separator ki;

enemyName: 'name:' enemyNameValue;
enemyNameValue: ALPHABET;
attackTarget: 'attackTarget:' attackTargetValue;
attackTargetValue:'DRINK' | 'PLAYER_SPEED';
damage: 'damage:' damageValue;
damageValue: DIGITS;
ki: 'ki:' kiValue;
kiValue: '(' visualRange '|' intelligence ')';
visualRange: DIGITS;
intelligence: DIGITS;

//the map of the level includes the map objects play and enemy start positions
// check when parsing that maps have always the same size (800*640 px) while each mapValue is a 32*32px block.
// so there must be 20 rows and each row got 25 mapvalues
map: 'map' ObjectBeginn mapValue ObjectEnd;
mapValue: row (row)*;
row: block (Separator block)*;
block: building | character ;
building:'H' | '<' | '>' | '^' | 'V' | 'S' | 'P'; // H- House, arrow- Spaeti incl direction, S- Street, P-park
character: 'X' | DIGITS; // X- player spawn, digits - enemy of appropriate enemyclass