package ast.expressions.binaryOperations;

import ast.expressions.BinaryOp;
import ast.expressions.Expression;
import visitor.Visitor;

public class Arithmetic extends BinaryOp {
    public Arithmetic(int line, int column, Expression left, String operator, Expression right) {
        super(line, column, left, operator, right);
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

}
