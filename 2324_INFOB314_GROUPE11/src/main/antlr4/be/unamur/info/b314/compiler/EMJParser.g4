parser grammar EMJParser;
    options { tokenVocab = EMJLexer; }


root:instruction ;

comment :COMMENTAIRE_UNE_LIGNE | COMMENTAIRE_PLUS_LIGNE;

orientation: UP_ARROW | LEFT_ARROW |RIGHT_ARROW | DOWN_ARROW ;
first_instruction : CARTES NUMBER NUMBER orientation;
element_cartes: POLICE | MOTORWAY  | CONSTRUCTION  | HOUSE  | TRACTOR | VOLCANO | WAVES | VILLAIN ;
map: (comment LIGNE)* (first_instruction)LIGNE (((element_cartes)*)LIGNE)*;


tuple: PATH1 |  PATH2 |  PATH3 |  PATH4;
operator: MINUS | PLUS | MULTIPILICATION| DIVISION;
comparator: INFERIEUR | SUPERIEUR | EGALITES | EGAL_INF | EGAL_SUP | DIFF;
connector :ET_LOGIQUE | OU_LOGIQUE;



eMOJIES: (EMOJIE)* | EMOJIE;
id_emogie: CROCHETS1 eMOJIES CROCHETS2;
emogie_type: NOMBRE_EMO | INFORMATION | CHAINE_INFO | BOOLEAN_INFO;
type: emogie_type | UPLET_EMO LPAR emogie_type RPAR;
basicvalue : (INTEGER | NUMBER) |  BOOLEAN |STRING | CHAR;
varvalue :basicvalue | tuple;

leftexp: id_emogie | id_emogie CROCHETS1 ZERO CROCHETS1 | id_emogie CROCHETS1 UN CROCHETS2;
vardecl: type id_emogie EGALE varvalue | type id_emogie;
intexp: (INTEGER | NUMBER) (operator intexp)? | MINUS (INTEGER | NUMBER) | leftexp | LPAR intexp RPAR;
rightexp: intexp | intermediate | boolexp;
boolexp: (intermediate comparator intermediate) | (intermediate connector intermediate) | NON intermediate | BOOLEAN;
callfunc: id_emogie LPAR callfuncargs RPAR;
callfuncargs: (callfuncarg (COMMA callfuncarg)*)?;
callfuncarg: rightexp | leftexp;

intermediate: callfunc | CHAR | STRING | tuple;
affectinstr: leftexp EGALE rightexp;
prefunc: UP_ARROW LPAR intexp RPAR | DOWN_ARROW  LPAR intexp RPAR | RIGHT_ARROW  LPAR intexp RPAR | LEFT_ARROW LPAR intexp RPAR | POLICELITH LPAR RPAR |
RADIO LPAR RPAR | RAISEDHAND LPAR RPAR;
ifinstr: THINKINGFACE LPAR boolexp RPAR PARENTHESE1 instruction PARENTHESE2 RAISEDFACE PARENTHESE1 elseinstr PARENTHESE1;
elseinstr : instruction | POINTDOWN;
// Boucle '
loopinstr: INFINIE LPAR boolexp RPAR PARENTHESE1 instruction PARENTHESE2 | REPEATBOUTON LPAR intexp RPAR PARENTHESE1 instruction PARENTHESE2;

instruction: ifinstr | loopinstr | callfunc FININSTRU |prefunc FININSTRU | affectinstr FININSTRU ;


funcdecl: functype id_emogie LPAR funcparams LPAR PARENTHESE1 instructions funcreturn FININSTRU PARENTHESE2;
functype : type |CYCLONE;
funcparams: funcparamsnotempty | ;
funcparamsnotempty: type id_emogie COMMA funcparamsnotempty | type id_emogie;
instructions: vardecl instructions | instruction FININSTRU instructions | ;
funcreturn: rightexp | CYCLONE;
