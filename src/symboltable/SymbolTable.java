package symboltable;

import ast.definitions.Definition;

import java.util.*;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
		this.table = new ArrayList<>();
		this.table.add(new HashMap<>());
	}

	public void set() {
		this.scope++;
		this.table.add(new HashMap<>());
	}
	
	public void reset() {
		this.table.remove(scope);
		this.scope--;
	}
	
	public boolean insert(Definition definition) {
		if(!findInCurrentScope(definition.getName())){
			definition.setScope(scope);
			table.get(scope).put(definition.getName(),definition);
			return true;
		}
		return false;
	}
	
	public Definition find(String id) {
		for(int i = scope; i >= 0; i--){
			if(table.get(i).get(id) != null){
				return table.get(i).get(id);
			}
		}
		return null;
	}
	//package-protected for testing pourposes
	boolean findInCurrentScope(String id) {
        return table.get(scope).get(id) != null;
    }
}
