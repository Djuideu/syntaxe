lexer grammar EMJLexer;
// Words
ZERO:'0';
UN: '1';
AFFECT: 'affect';
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
FININSTRU:';';
PARENTHESE1:'{';
PARENTHESE2:'}';
SPEAKER_HIGH_VOLUME: '\\u{1F50A}';
SPEAKER_LOW: '\\u{1F508}';
LOUDSPEAKER: '\\u{1F4E2}';
UP_ARROW:'\\u{2B06}';
CROHET1: '\'' ;
CROHET2: '"';
CROCHETS1:'[';
CROCHETS2:']';
EGALE: '=';

PATH1: LPAR INTEGER COMMA INTEGER RPAR;
PATH2: LPAR BOOLEAN COMMA BOOLEAN RPAR;
PATH3: LPAR STRING  COMMA STRING RPAR;
PATH4: LPAR CHAR COMMA CHAR RPAR;

DOWN_ARROW: '\\u{2B07}';

RIGHT_ARROW: '\\u{27A1}';

LEFT_ARROW: '\\u{2B05}';
CARTES: '\\u{1F5FA}';
POLICE: '\\u{1F694}';
MOTORWAY:'\\u{1F6E3}';
CONSTRUCTION: '\\u{1F6A7}';
HOUSE: '\\u{1F3E0}';
TRACTOR: '\\u{1F69C}';
VOLCANO: '\\u{1F30B}';
WAVES: '\\u{1F30A}';
VILLAIN: '\\u{1F9B9}';




ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (DIGIT)+;

fragment LETTER: 'A'..'Z' | 'a'..'z';
fragment DIGIT: '0'..'9' ;

SIGNE: MINUS;

LIGNE:'\n';


COMMENTAIRE_UNE_LIGNE: LOUDSPEAKER (~'\n')*;
COMMENTAIRE_PLUS_LIGNE: SPEAKER_HIGH_VOLUME .*?  SPEAKER_LOW;
STRING: CROHET2 (ID | NUMBER | ' ')* CROHET2;
CHAR: CROHET1(ID | NUMBER | ' ') CROHET1;
INTEGER:  ( SIGNE NUMBER) |NUMBER;
BOOLEAN: '\\u{2714}' | '\\u{274C}';
NOMBRE_EMO: '\\u{1F522}';
INFORMATION:'\\u{2139}';
CHAINE_INFO: '\\u{1F524}';
BOOLEAN_INFO: '\\u{1F521}';
MULTIPILICATION:'*';
DIVISION: '/';

EMOJIE: '\\u{1F642}' | '\\u{1F697}' | '\\u{1F46E}' | '\\u{1F60D}' | '\\u{1F44F}' | '\\u{1F605}';


INFERIEUR:'<';
SUPERIEUR:'>';
EGALITES:'==';
EGAL_SUP: '>=';
EGAL_INF: '<=';
DIFF: '!=';
ET_LOGIQUE:'&&';
OU_LOGIQUE: '||';
NON: '!';

UPLET_EMO: '\\u{1F465}';
NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;

THINKINGFACE: '\\u{1F914}';
RAISEDFACE:'\\u{1F928}';
POINTDOWN: '\\u{1F447}';
REPEATBOUTON: '\\u{1F501}';
INFINIE: '\\u{267E}';
POLICELITH:'\\u{1F6A8}';
RAISEDHAND:'\\u{270B}';
RADIO:'\\u{1F4FB}';

CYCLONE: '\\u{1F300}';
RIGTHARROWROND: '\\u{21A9}';


