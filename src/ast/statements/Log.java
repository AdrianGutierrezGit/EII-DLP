package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

public class Log extends AbstractStatement {

    private Expression expression;

    public Log(int line, int column, Expression expression) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Log{" +
                "expression=" + expression +
                '}';
    }
}