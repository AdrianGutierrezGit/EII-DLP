package visitor;

import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;

import java.util.ArrayList;
import java.util.List;

public class TypeCheckingVisitor extends AbstractVisitor<Type,Void>{
    @Override
    public Void visit(Variable v, Type param) {
        super.visit(v,param);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Comparison c, Type param) {
        super.visit(c,param);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(),c));
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Type param) {
        super.visit(a,param);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(),a));
        return null;
    }

    @Override
    public Void visit(Logic l, Type param) {
        super.visit(l,param);
        l.setType(l.getLeft().getType().logical(l.getRight().getType(),l));
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Type param) {
        super.visit(a,param);
        a.setType(a.getArray().getType().squareBrackets(a.getIndex().getType(),a));
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Type param) {
        c.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(Cast c, Type param) {
        super.visit(c,param);
        c.getExpression().getType().canBeCast(c.getCastType(),c);
        c.setType(c.getCastType());
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Type param) {
        super.visit(f,param);
        f.setType(f.getField().getType().dot(f.getFieldName(),f));
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Type param) {
        i.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Invocation i, Type param) {
        super.visit(i,param);
        List<Type> argumentsTypes = new ArrayList<>();
        for(Expression e:i.getArguments()){
            argumentsTypes.add(e.getType());
        }
        i.setType(i.getFunction().getType().parenthesis(argumentsTypes,i));
        return null;
    }

    @Override
    public Void visit(NumberLiteral n, Type param) {
        n.setType(DoubleType.getInstance());
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Type param) {
        super.visit(u,param);
        u.setType(u.getOperand().getType().arithmetic(u));
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Type param) {
        super.visit(u,param);
        u.getOperand().getType().mustBeLogical(u);
        u.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(Assignment a, Type param) {
        super.visit(a,param);
        a.getRight().getType().mustPromotes(a.getLeft().getType(),a);
        return null;
    }

    @Override
    public Void visit(While w, Type param) {
        super.visit(w,param);
        w.getCondition().getType().mustBeLogical(w);
        return null;
    }

    @Override
    public Void visit(IfElse i, Type param) {
        super.visit(i,param);
        i.getCondition().getType().mustBeLogical(i);
        return null;
    }

    @Override
    public Void visit(Input i, Type param) {
        super.visit(i,param);
        i.getExpression().getType().mustBeBuildIn(i);
        return null;
    }

    @Override
    public Void visit(Log l, Type param) {
        super.visit(l,param);
        l.getExpression().getType().mustBeBuildIn(l);
        return null;
    }

    @Override
    public Void visit(Return r, Type param) {
        super.visit(r,param);
        Type returnType = r.getExpression().getType();
        returnType.mustPromotes(param, r);
        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Type param) {
        f.getType().accept(this, param);
        Type returnType = null;
        if (f.getType() instanceof FunctionType functionType) {
            returnType = functionType.getReturnType();
        }
        for (Statement statement : f.getStatements()) {
            statement.accept(this, returnType);
        }
        return null;
    }
}
