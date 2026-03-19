package ast.expressions;

import visitor.Visitor;

public class NumberLiteral extends AbstractExpression{
    private double value;

    public NumberLiteral(int line, int column, double value) {
        super(line, column);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "NumberLiteral{" +
                "value=" + value +
                '}';
    }
}
