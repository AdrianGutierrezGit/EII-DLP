package visitor;

import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.statements.*;
import ast.types.*;

public class LValueVisitor extends AbstractVisitor<Void,Void>{

    @Override
    public Void visit(Variable v, Void param) {
        v.setLValue(true);
        return param;
    }

    @Override
    public Void visit(Comparison c, Void param) {
        super.visit(c,param);
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        super.visit(a,param);
        a.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Logic l, Void param) {
        super.visit(l,param);
        l.setLValue(false);
        return param;
    }

    @Override
    public Void visit(ArrayAccess a, Void param) {
        super.visit(a,param);
        a.setLValue(true);
        return param;
    }

    @Override
    public Void visit(Cast c, Void param) {
        super.visit(c,param);
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        c.setLValue(false);
        return param;
    }

    @Override
    public Void visit(FieldAccess f, Void param) {
        super.visit(f,param);
        f.setLValue(true);
        return param;
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        i.setLValue(false);
        return param;
    }

    @Override
    public Void visit(Invocation i, Void param) {
        super.visit(i,param);
        i.setLValue(false);
        return param;
    }

    @Override
    public Void visit(NumberLiteral n, Void param) {
        n.setLValue(false);
        return param;
    }

    @Override
    public Void visit(UnaryMinus u, Void param) {
        super.visit(u,param);
        u.setLValue(false);
        return param;
    }

    @Override
    public Void visit(UnaryNot u, Void param) {
        super.visit(u,param);
        u.setLValue(false);
        return param;
    }


    @Override
    public Void visit(Assignment a, Void param) {
        super.visit(a,param);
        if(!a.getLeft().isLValue()){
            new ErrorType("La asignación no es válida",a);
        }
        return param;
    }

    @Override
    public Void visit(Input i, Void param) {
        super.visit(i,param);
        if(!i.getExpression().isLValue()){
            new ErrorType("La expresión del input no es correcta",i);
        }
        return param;
    }


}
