grammar TSmm;

@header{
import ast.expressions.*;
import ast.expressions.binaryOperations.*;
import ast.types.*;
import ast.definitions.*;
import ast.types.*;
import ast.statements.*;
import ast.*;
}
program returns [Program ast] locals [List<Definition> defs = new ArrayList<>()]:
        (definition {$defs.addAll($definition.ast);})* m=main  {$defs.add($m.ast);$ast = new Program($defs);} EOF
       ;

expression returns [Expression ast] locals [List<Expression> functionInvocationExps = new ArrayList<>()]:
            '(' expression ')' {$ast = $expression.ast;}
          | ID '(' ((e1=expression ',' {$functionInvocationExps.add($e1.ast);})* e2=expression {$functionInvocationExps.add($e2.ast);})?')' {$ast = new Invocation($ID.getLine(),$ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text),$functionInvocationExps);}
          | '[' expression ']' {$ast = $expression.ast;}
          | e1=expression '[' e2=expression ']' {$ast = new ArrayAccess($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$e2.ast);}
          | e1=expression '.' ID {$ast = new FieldAccess($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast, $ID.text);}
          | '-' expression {$ast = new UnaryMinus($expression.ast.getLine(),$expression.ast.getColumn(), $expression.ast);}
          | '!' expression {$ast = new UnaryNot($expression.ast.getLine(), $expression.ast.getColumn(),$expression.ast);}
          | '(' expression 'as' simpleType ')' {$ast = new Cast($expression.ast.getLine(),$expression.ast.getColumn(),$simpleType.ast,$expression.ast);}
          | e1=expression OP=('*'|'/' | '%') e2=expression {$ast = new Arithmetic($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$OP.text,$e2.ast);}
          | e1=expression OP=('+'|'-') e2=expression {$ast = new Arithmetic($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$OP.text,$e2.ast);}
          | e1=expression OP=('>' | '>=' | '<' | '<=' | '==' | '!=') e2=expression {$ast = new Comparison($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$OP.text,$e2.ast);}
          | e1=expression OP=('&&' | '||') e2=expression {$ast = new Logic($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast,$OP.text,$e2.ast);}
          | ID {$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
          | INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt($INT_CONSTANT.text));}
          | REAL_CONSTANT {$ast = new NumberLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
          | CHAR_CONSTANT {$ast = new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1, LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
          ;

statement returns [List<Statement> ast = new ArrayList<>()] locals [List<Statement> else = new ArrayList<>(),
                    List<Expression> functionInvocationExps = new ArrayList<>()]:
          e1=expression '=' e2=expression ';' {$ast.add(new Assignment($e1.ast.getLine(),$e2.ast.getColumn(),$e1.ast,$e2.ast));}
         | 'while' '(' expression ')' body {$ast.add(new While($expression.ast.getLine(),$expression.ast.getColumn(),$expression.ast,$body.ast));}
         | 'if' '(' expression ')' b1=body ('else' b2=body {$else = $b2.ast;})? {$ast.add(new IfElse($expression.ast.getLine(),$expression.ast.getColumn(),$expression.ast,$b1.ast,$else));}
         | 'input' ((e1=expression ',' {$ast.add(new Input($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast));})* e2=expression {$ast.add(new Input($e2.ast.getLine(),$e2.ast.getColumn(),$e2.ast));})? ';'
         | 'log' ((e1=expression ',' {$ast.add(new Log($e1.ast.getLine(),$e1.ast.getColumn(),$e1.ast));})* e2=expression {$ast.add(new Log($e2.ast.getLine(),$e2.ast.getColumn(),$e2.ast));})? ';'
         | 'return' expression ';' {$ast.add(new Return($expression.ast.getLine(),$expression.ast.getColumn(),$expression.ast));}
         | ID '(' ((e1=expression ',' {$functionInvocationExps.add($e1.ast);})* e2=expression {$functionInvocationExps.add($e2.ast);})?')' ';' {$ast.add(new Invocation($ID.getLine(),$ID.getCharPositionInLine()+1,new Variable($ID.getLine(), $ID.getCharPositionInLine()+1,$ID.text),$functionInvocationExps));}
         ;

definition returns [List<Definition> ast = new ArrayList<>()]:
            varDefinition {$ast.addAll($varDefinition.ast);}
          | functionDefinition {$ast.add($functionDefinition.ast);}
          ;

varDefinition returns [List<VarDefinition> ast = new ArrayList<>()] locals [List<Token> ids = new ArrayList<>()]:
            'let' ((ID1=ID {$ids.add($ID1);} ',')* ID2=ID {$ids.add($ID2);}) ':' type ';' {for(Token id: $ids){$ast.add(new VarDefinition(id.getLine(),id.getCharPositionInLine()+1,id.getText(),$type.ast));}}
            ;


functionDefinition returns [FunctionDefinition ast] locals [List<Statement> functionBody = new ArrayList<>(),
                                                            List<VarDefinition> parameters = new ArrayList<>()]:
                'function' ID1=ID '('(((ID2=ID ':' t1=type) ',' {$parameters.add(new VarDefinition($ID2.getLine(),$ID2.getCharPositionInLine()+1,$ID2.text,$t1.ast));})* ((ID3=ID ':' t2=type){$parameters.add(new VarDefinition($ID3.getLine(),$ID3.getCharPositionInLine()+1,$ID3.text,$t2.ast));}))? ')' ':' t3=returnFunctionType '{' (varDefinition{$functionBody.addAll($varDefinition.ast);})* (statement{$functionBody.addAll($statement.ast);})* '}'
                {$ast = new FunctionDefinition($ID1.getLine(),$ID1.getCharPositionInLine()+1,$ID1.text, new FunctionType($parameters,$t3.ast),$functionBody);}
                ;

main returns [FunctionDefinition ast] locals [List<Statement> mainBody = new ArrayList<>()]:
    F='function' 'main' '('')' ':' 'void' '{' (varDefinition {$mainBody.addAll($varDefinition.ast);})* (statement {$mainBody.addAll($statement.ast);})* '}'
                    {$ast = new FunctionDefinition($F.getLine(),$F.getCharPositionInLine()+1,"main",VoidType.getInstance(),$mainBody);}
    ;

body returns [List<Statement> ast = new ArrayList<>()]:
     statement {$ast.addAll($statement.ast);}
    | '{' (statement {$ast.addAll($statement.ast);})* '}'
    ;

type returns [Type ast] locals [List<VarDefinition> tempFields = new ArrayList<>(),
                                List<RecordField> finalFields = new ArrayList<>(),
                                List<String> fieldsNames = new ArrayList<>()]:
    simpleType {$ast = $simpleType.ast;}
    | '['INT_CONSTANT']' type {$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text),$type.ast);}
    | '[' (varDefinition {$tempFields.addAll($varDefinition.ast);})* ']' {
        for(VarDefinition varDef : $tempFields){
            if($fieldsNames.contains(varDef.getName())){
                new ErrorType("Declarados dos campos con el mismo nombre", varDef);
            } else {
                $finalFields.add(new RecordField(varDef.getLine(), varDef.getColumn(), varDef.getName(), varDef.getType()));
            }
                $fieldsNames.add(varDef.getName());
            }
        $ast = new RecordType($finalFields);
    }
;

simpleType returns [Type ast]:
            'int' {$ast = IntType.getInstance();}
        | 'char' {$ast = CharType.getInstance();}
        | 'number' {$ast = DoubleType.getInstance();}
        ;

returnFunctionType returns [Type ast]:
                   simpleType {$ast = $simpleType.ast;}
                 | 'void' {$ast = VoidType.getInstance();}
                 ;
//-------------------------------------------

WHITES: [ \n\t\r]+ -> skip
;

LINE_COMMENT:'//' .*? ('\n' | EOF) -> skip
;

BLOCK_COMMENT: '/*' .*? '*/' -> skip
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
