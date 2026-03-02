package ast.expressions;

import ast.statements.Statement;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {

    private Variable function;
    private List<Expression> arguments;

    public Invocation(int line, int column, Variable function, List<Expression> arguments) {
        super(line, column);
        this.function = function;
        this.arguments = arguments;
    }

    public Variable getFunction() {
        return function;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    @Override
    public String toString() {
        return "Invocation{" +
                "function=" + function +
                ", arguments=" + arguments +
                '}';
    }
}