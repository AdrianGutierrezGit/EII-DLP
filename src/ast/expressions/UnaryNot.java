package ast.expressions;

import visitor.Visitor;

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
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "UnaryNot{" +
                "operand=" + operand +
                '}';
    }
}