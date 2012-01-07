package mjc.gc;

import java.util.ArrayList;

public class Method {
    // Le nom de la méthode
    private String name;

    // La valeur de retour de la méthode
    private DTYPE returnType;

    // Liste des types de paramètres 
    private ArrayList<DTYPE> params;

    public Method(String name, DTYPE returnType) {
	this.name = name;
	this.returnType = returnType;
	params = new ArrayList<DTYPE>();
    }

    public void addParam(DTYPE paramType) {
	params.add(paramType);
    }

    
    
    @Override
    public boolean equals(Object other) {
    	return false;
    }
}