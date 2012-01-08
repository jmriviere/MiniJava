package mjc.gc;

import java.util.ArrayList;
import java.util.Iterator;

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

    public String getName() {
    	return name;
    }
    
    public void addParam(DTYPE paramType) {
    	params.add(paramType);
    }
    
    public void addArgument(DTYPE paramType) {
    	params.add(paramType);
    }

    @Override
    public boolean equals(Object other) {
    	// Les méthodes ont-elles la même liste de paramètres, le même type de retour et le même nom?
    	boolean params = true;
    	boolean returnType = true;
    	boolean name = true;

    	
    	Iterator<DTYPE> selfI = this.params.iterator();
    	Iterator<DTYPE> otherI = ((Method)other).params.iterator();
    	// Vérification de la concordance du type de chaque paramètre
    	if (this.params.size() == ((Method)other).params.size()) {
    		while (selfI.hasNext() && otherI.hasNext()) {
    			String selfName = ((DTYPE)selfI.next()).getName();
    			String otherName = ((DTYPE)otherI.next()).getName();
    			if (!selfName.equals(otherName)) {
    				params = false;
    			}
    		}
    	}
    	else {
    		params = false;
    	}
    	// Vérification de la concordance des types de retour
    	returnType = this.returnType.getName().equals(((Method)other).returnType.getName());
    	
    	// Vérification de la concordance des noms
    	name = (this.name.equals(((Method)other).name));
    	
    	return (params && returnType && name);
    }
}