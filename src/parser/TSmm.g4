grammar TSmm;	

program: CHAR_CONSTANT
       ;
//-------------------------------------------

WHITES: [ \n\t\r]+ -> skip
;

LINE_COMMENT:'//' .*? ('\n' | EOF) -> skip
;

BLOCK_COMMENT: '/* ' .*? ' */' -> skip
;


INT_CONSTANT: [1-9][0-9]*
            |  '0'
            ;

fragment MANTISSA: INT_CONSTANT? '.' [0-9]+
                  | INT_CONSTANT '.'?
                  ;

fragment EXP: [Ee][+-]? INT_CONSTANT
            ;

REAL_CONSTANT: MANTISSA EXP?;

CHAR_CONSTANT:'\'' . '\''
             | '\'\\t' '\''
             | '\'\\n' '\''
             | '\'\\' INT_CONSTANT '\''
;

ID: [_a-zA-Z][_a-zA-Z0-9]*
;