package ast.expressions;

public abstract class BinaryOp extends AbstractExpression {

    private String operator;
    private Expression left;
    private Expression right;

    public BinaryOp(int line, int column, Expression left, String operator, Expression right) {
        super(line, column);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public String getOperator() {
        return operator;
    }
    public Expression getLeft() {
        return left;
    }
    public Expression getRight() {
        return right;
    }

}