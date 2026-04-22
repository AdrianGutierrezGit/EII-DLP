package generator;

import ast.definitions.VarDefinition;
import ast.expressions.Variable;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void>{
    private CodeGenerator cg;
    private ValueCGVisitor value;
    public AddressCGVisitor(CodeGenerator cg) {
        this.cg = cg;
    }

    public void setValue(ValueCGVisitor v){
        this.value = v;
    }

    @Override
    public Void visit(Variable v, Void param) {
        if (v.getDefinition() instanceof VarDefinition) {
            VarDefinition def = (VarDefinition) v.getDefinition();
            if (def.getScope() == 0) {
                cg.pusha(def.getOffset());
            } else {
                cg.pushbp();
                cg.pushi(def.getOffset());
                cg.addi();
            }
        }
        return null;
    }


}
