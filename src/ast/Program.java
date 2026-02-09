package ast;

import ast.definitions.Definition;

import java.util.List;

public class Program extends AbstractLocatable{
    private List<Definition> program;

    public Program(int line, int column, List<Definition> program){
        super(line,column);
        this.program = program;
    }

    public List<Definition> getProgramDefinitions(){
        return program;
    }

}
