package mjc.gc;

import java.util.ArrayList;

public class MethodList {
    // Liste des types de paramètres 
    private ArrayList<Signature> signatures;

    public MethodList() {
    	signatures = new ArrayList<Signature>();
    }
    
    public void addSignature(Signature s) {
    	signatures.add(s);
    }
    
    public ArrayList<Signature> getSignatureList() {
    	return signatures;
    }

    @Override
    public boolean equals(Object other) {
    	return true;
 /*   	// Les méthodes ont-elles la même liste de paramètres, le même type de retour et le même nom?
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
    	returnType = this.returnType.compareTo(((Method)other).returnType);
    	
    	// Vérification de la concordance des noms
    	name = (this.name.equals(((Method)other).name));
    	
    	return (params && returnType && name);*/
    }
}