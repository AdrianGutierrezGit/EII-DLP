package ast.expressions.binaryOperations;

import ast.expressions.BinaryOp;
import ast.expressions.Expression;

public class Arithmetic extends BinaryOp {
    public Arithmetic(int line, int column, Expression left, String operator, Expression right) {
        super(line, column, left, operator, right);
    }


}
