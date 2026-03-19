package ast;

import ast.definitions.Definition;
import visitor.Visitor;

import java.util.List;

public class Program implements ASTNode{
    private List<Definition> program;

    public Program(List<Definition> program){
        this.program = program;
    }

    public List<Definition> getProgramDefinitions(){
        return program;
    }

    @Override
    public <PT,RT> RT accept(Visitor<PT,RT> v, PT param){
        return v.visit(this,param);
    }

    @Override
    public String toString() {
        return "Program{" +
                "program=" + program +
                '}';
    }
}
