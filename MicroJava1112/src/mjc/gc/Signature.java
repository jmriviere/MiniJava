package mjc.gc;

import java.util.ArrayList;
import java.util.Iterator;

public class Signature {
	
	private String name;

	private DTYPE returnType;
	
	ArrayList<DTYPE> params;
	
	public Signature(String name, DTYPE returnType) {
		this.name = name;
		this.returnType = returnType;
		params = new ArrayList<DTYPE>();
	}
	
	public String getName() {
		return name;
	}
	
	public DTYPE getReturnType() {
		return returnType;
	}
	
	public ArrayList<DTYPE> getParams() {
		return params;
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
    	Iterator<DTYPE> otherI = ((Signature)other).params.iterator();
    	// Vérification de la concordance du type de chaque paramètre
    	if (this.params.size() == ((Signature)other).params.size()) {
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
    	returnType = this.returnType.compareTo(((Signature)other).returnType);
    	
    	// Vérification de la concordance des noms
    	name = (this.name.equals(((Signature)other).name));
    	
    	return (params && returnType && name);
    }
}
