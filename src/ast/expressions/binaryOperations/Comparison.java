package ast.expressions.binaryOperations;

import ast.expressions.BinaryOp;
import ast.expressions.Expression;

public class Comparison extends BinaryOp {
    public Comparison(int line, int column, Expression left, String operator, Expression right) {
        super(line, column, left, operator, right);
    }
}
