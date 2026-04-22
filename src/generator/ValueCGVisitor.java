package generator;

import ast.expressions.*;
import ast.expressions.binaryOperations.Arithmetic;
import ast.expressions.binaryOperations.Comparison;
import ast.expressions.binaryOperations.Logic;
import ast.types.Type;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private AddressCGVisitor address;
    public ValueCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setAddress(AddressCGVisitor address){
        this.address = address;
    }

    @Override
    public Void visit(Variable v, Void param) {
        // Pedimos la dirección al AddressVisitor y luego cargamos el valor
        v.accept(address, param);
        cg.load(v.getType());
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Void param) {
        cg.pushi(i.getValue());
        return null;
    }

    @Override
    public Void visit(NumberLiteral d, Void param) {
        cg.pushf(d.getValue());
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Void param) {
        cg.pushb(c.getValue());
        return null;
    }

    @Override
    public Void visit(Cast c, Void param) {
        c.getExpression().accept(this, param);
        cg.convertTo(c.getExpression().getType(), c.getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Void param) {
        a.getLeft().accept(this, param);
        cg.convertTo(a.getLeft().getType(), a.getType());

        a.getRight().accept(this, param);
        cg.convertTo(a.getRight().getType(), a.getType());

        switch (a.getOperator()) {
            case "+": cg.add(a.getType()); break;
            case "-": cg.sub(a.getType()); break;
            case "*": cg.mul(a.getType()); break;
            case "/": cg.div(a.getType()); break;
            case "%": cg.mod(a.getType()); break;
        }
        return null;
    }

    @Override
    public Void visit(Comparison c, Void param) {
        Type finalType = cg.promotedType(c.getLeft().getType(), c.getRight().getType());

        c.getLeft().accept(this, param);
        cg.convertTo(c.getLeft().getType(), finalType);

        c.getRight().accept(this, param);
        cg.convertTo(c.getRight().getType(), finalType);

        switch (c.getOperator()) {
            case ">":  cg.gt(finalType); break;
            case "<":  cg.lt(finalType); break;
            case ">=": cg.ge(finalType); break;
            case "<=": cg.le(finalType); break;
            case "==": cg.eq(finalType); break;
            case "!=": cg.ne(finalType); break;
        }
        return null;
    }

    @Override
    public Void visit(Logic l, Void param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);

        switch (l.getOperator()) {
            case "&&": cg.and(); break;
            case "||": cg.or(); break;
        }
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Void param) {
        u.getOperand().accept(this, param);
        cg.not();
        return null;
    }

}
