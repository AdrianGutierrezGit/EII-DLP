grammar TSmm;	

program: definition* main EOF
       ;

expression: '(' expression ')'
          | '[' expression ']'
          | expression '.' ID
          | '-' expression
          | '!' expression
          | '(' expression 'as' simpleType ')'
          | expression ('*'|'/' | '%') expression
          | expression ('+'|'-') expression
          | expression ('>' | '>=' | '<' | '<=' | '==' | '!=') expression
          | expression ('&&' | '||') expression
          | expression '[' expression ']'
          | ID '(' ((expression ',')* expression)?')'
          | ID
          | INT_CONSTANT
          | REAL_CONSTANT
          | CHAR_CONSTANT
          ;

statement: expression '=' expression ';'
         | 'while' '(' expression ')' body
         | 'if' '(' expression ')' body
         | 'if' '(' expression ')' body ('else' body)?
         | ('input' | 'log') ((expression ',')* expression)? ';'
         | 'return' expression ';'
         | ID '(' ((expression ',')* expression)?')' ';'
         ;

definition: varDefinition
          | functionDefinition
          ;

varDefinition: 'let' ((ID ',')* ID) ':' type ';'
            ;
functionDefinition: 'function' ID '('(((ID ':' type) ',')* (ID ':' type))? ')' ':' type '{' varDefinition* statement* '}'
         ;

main: 'function' 'main' '('')' ':' 'void' '{' varDefinition* statement* '}'
    ;

body: statement
    | '{' statement* '}'
    ;

type: simpleType
    | '['INT_CONSTANT']' type
    | '[' varDefinition* ']'
    | 'void'
;

simpleType: 'int'
        | 'char'
        | 'number'
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

REAL_CONSTANT: MANTISSA EXP?
            ;

CHAR_CONSTANT:'\'' . '\''
             | '\'\\t' '\''
             | '\'\\n' '\''
             | '\'\\' INT_CONSTANT '\''
            ;

ID: [_a-zA-Z][_a-zA-Z0-9]*
;

