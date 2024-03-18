grammar EMJParser;

import EMJLexer;

root: intexp;

comment :COMMENTAIRE_UNE_LIGNE | COMMENTAIRE_PLUS_LIGNE;

orientation: UP_ARROW | LEFT_ARROW |RIGHT_ARROW | DOWN_ARROW ;
first_instruction : CARTES NUMBER NUMBER orientation;
element_cartes: POLICE | MOTORWAY  | CONSTRUCTION  | HOUSE  | TRACTOR | VOLCANO | WAVES | VILLAIN ;
map: (comment LIGNE)* (first_instruction)LIGNE (((element_cartes)*)LIGNE)*;
instruction: AFFECT LPAR ID COMMA expression RPAR   #affectInstr
           ;

expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | expression op=(PLUS|MINUS) expression   #plusMinusExpr
          ;



tuple: PATH1 |  PATH2 |  PATH3 |  PATH4;



eMOJIES: (EMOJIE)* | EMOJIE;
id_emogie: CROCHETS1 eMOJIES CROCHETS2;
emogie_type: NOMBRE_EMO | INFORMATION | CHAINE_INFO | BOOLEAN_INFO;
type: emogie_type | UPLET_EMO LPAR emogie_type RPAR;
basicvalue : (INTEGER | NUMBER) |  BOOLEAN |STRING | CHAR;
varvalue :basicvalue | tuple;

leftexp: id_emogie | id_emogie CROCHETS1 ZERO CROCHETS1 | id_emogie CROCHETS1 UN CROCHETS2;
vardecl: type id_emogie EGALE varvalue | type id_emogie;
intexp: (INTEGER | NUMBER) (OPERATOR intexp)? | MINUS (INTEGER | NUMBER) | leftexp;
rightexp: intexp | intermediate | boolexp;
boolexp: (intermediate COMPARATOR intermediate) | (intermediate CONNECTOR intermediate) | NON intermediate | BOOLEAN;
callfunc: id_emogie LPAR callfuncargs RPAR;
callfuncargs: (callfuncarg (COMMA callfuncarg)*)?;
callfuncarg: rightexp | leftexp;

intermediate: callfunc | CHAR | STRING | tuple;




