package ast;

import ast.definitions.Definition;

import java.util.List;

public class Program implements ASTNode{
    private List<Definition> program;

    public Program(List<Definition> program){
        this.program = program;
    }

    public List<Definition> getProgramDefinitions(){
        return program;
    }

}
