package ast.expressions;

import visitor.Visitor;

public class UnaryMinus extends AbstractExpression{

    private Expression operand;

    public UnaryMinus(int line, int column, Expression operand) {
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
        return "UnaryMinus{" +
                "operand=" + operand +
                '}';
    }
}
