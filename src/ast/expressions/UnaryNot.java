package ast.expressions;

public class UnaryNot extends AbstractExpression {

    private Expression operand;

    public UnaryNot(int line, int column, Expression operand) {
        super(line, column);
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public String toString() {
        return "UnaryNot{" +
                "operand=" + operand +
                '}';
    }
}