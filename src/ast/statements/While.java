package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class While extends AbstractStatement{
    private Expression condition;
    private List<Statement> statements;

    public While(int line, int column, Expression condition, List<Statement> statements) {
        super(line, column);
        this.condition = condition;
        this.statements = statements;
    }

    public Expression getCondition() {
        return condition;
    }
    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }


    @Override
    public String toString() {
        return "While{" +
                "condition=" + condition +
                ", statements=" + statements +
                '}';
    }
}
