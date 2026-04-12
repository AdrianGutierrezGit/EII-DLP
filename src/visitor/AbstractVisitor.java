package visitor;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;

public abstract class AbstractVisitor<PT, RT> implements Visitor<PT,RT>{
    @Override
    public RT visit(Variable v, PT param) {
        return null;
    }

    @Override
    public RT visit(Comparison c, PT param) {
        c.getLeft().accept(this,param);
        c.getRight().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Arithmetic a, PT param) {
        a.getLeft().accept(this,param);
        a.getRight().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Logic l, PT param) {
        l.getLeft().accept(this,param);
        l.getRight().accept(this,param);
        return null;
    }

    @Override
    public RT visit(ArrayAccess a, PT param) {
        a.getArray().accept(this,param);
        a.getIndex().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Cast c, PT param) {
        c.getCastType().accept(this,param);
        c.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(CharLiteral c, PT param) {
        return null;
    }

    @Override
    public RT visit(FieldAccess f, PT param) {
        f.getField().accept(this,param);
        return null;
    }

    @Override
    public RT visit(IntLiteral i, PT param) {
        return null;
    }

    @Override
    public RT visit(Invocation i, PT param) {
        i.getFunction().accept(this,param);
        for(Expression e:i.getArguments()){
            e.accept(this,param);
        }
        return null;
    }

    @Override
    public RT visit(NumberLiteral n, PT param) {
        return null;
    }

    @Override
    public RT visit(UnaryMinus u, PT param) {
        u.getOperand().accept(this,param);
        return null;
    }

    @Override
    public RT visit(UnaryNot u, PT param) {
        u.getOperand().accept(this,param);
        return null;
    }

    @Override
    public RT visit(FunctionDefinition f, PT param) {
        f.getType().accept(this,param);
        for(Statement s:f.getStatements()){
            s.accept(this,param);
        }
        return null;
    }

    @Override
    public RT visit(VarDefinition v, PT param) {
        v.getType().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Assignment a, PT param) {
        a.getLeft().accept(this,param);
        a.getRight().accept(this,param);
        return null;
    }

    @Override
    public RT visit(IfElse i, PT param) {
        i.getCondition().accept(this,param);
        for(Statement s: i.getIfStatements()){
            s.accept(this,param);
        }
        if (i.getElseStatements() != null) {
            for(Statement s: i.getElseStatements()){
                s.accept(this,param);
            }
        }
        return null;
    }

    @Override
    public RT visit(Input i, PT param) {
        i.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Log l, PT param) {
        l.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(Return r, PT param) {
        r.getExpression().accept(this,param);
        return null;
    }

    @Override
    public RT visit(While w, PT param) {
        w.getCondition().accept(this,param);
        for(Statement s: w.getStatements()){
            s.accept(this,param);
        }
        return null;
    }

    @Override
    public RT visit(ArrayType a, PT param) {
        a.getElementsType().accept(this,param);
        return null;
    }

    @Override
    public RT visit(CharType c, PT param) {
        return null;
    }

    @Override
    public RT visit(DoubleType d, PT param) {
        return null;
    }

    @Override
    public RT visit(ErrorType e, PT param) {
        return null;
    }

    @Override
    public RT visit(FunctionType f, PT param) {
        f.getReturnType().accept(this,param);
        for(VarDefinition v: f.getParameters()){
            v.accept(this,param);
        }
        return null;
    }

    @Override
    public RT visit(IntType i, PT param) {
        return null;
    }

    @Override
    public RT visit(RecordType r, PT param) {
        for(RecordField f : r.getFields()) {
            f.accept(this, param);
        }
        return null;
    }

    @Override
    public RT visit(VoidType v, PT param) {
        return null;
    }

    @Override
    public RT visit(Program p, PT param) {
        for(Definition d:p.getProgramDefinitions()){
            d.accept(this,param);
        }
        return null;
    }

    @Override
    public RT visit(RecordField recordField, PT param) {
        return null;
    }
}
