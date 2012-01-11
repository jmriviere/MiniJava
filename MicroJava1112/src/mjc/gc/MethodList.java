package mjc.gc;

import java.util.ArrayList;

/**
 * A set of signatures that matches a given name and return type
 * 
 * @author (comments) emmanuel
 */
public class MethodList implements Cloneable {
	// Nom de la methode regroupee
	private String name;

	// Type de retour de la methode regroupee
	private DTYPE returnType;
	
    // Liste des types de paramètres 
    private ArrayList<Signature> signatures;

    /**
     * Creates a MethodList
     * 
     * @param name the name of the method
     * @param returnType the returnType of the method
     */
    public MethodList(String name, DTYPE returnType) {
    	this.name = name;
    	this.returnType = returnType;
    	signatures = new ArrayList<Signature>();
    }
    
	/**
	 * @return the common name for these methods
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the common return type of these methods
	 */
	public DTYPE getReturnType() {
		return returnType;
	}
	
    /**
     * @param s the signature to add
     * @return false if the signature wasn't added
     * </br>That normally happens only when the signature is already there
     */
    public boolean addSignature(Signature s) {
    	if (signatures.contains(s)) {
			return false;
		}
    	return signatures.add(s);
    }
    
    /**
     * @return returns all the signatures in this MethodList
     */
    public ArrayList<Signature> getSignatureList() {
    	return signatures;
    }
    
    /**
     * Test a signature for a call to this method
     * 
     * @param signature the signature to test
     * @return true if this signature is accepted by one of the definitions of this method
     */
    public boolean doAccept(Signature signature) {
    	for (Signature sign : signatures) {
			if (sign.size()==signature.size()) {
				boolean ok = true;
				for (int i = 0; i < signature.size(); i++) {
					if (!signature.get(i).isType(sign.get(i))) {
						ok = false;
						continue;
					}
				}
				if (ok) {
					return true;
				}
			}
		}
		return false;
	}

    /**
     * @param signatureList the list of signatures to remove from that one
     */
    public void removeSignatures(ArrayList<Signature> signatureList) {
		signatures.removeAll(signatureList);
	}

	/**
	 * @return true si la list ne possede plus de signature
	 */
	public boolean isEmpty() {
		return signatures.isEmpty();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected Object clone() {
		MethodList clone = new MethodList(name, returnType);
		clone.signatures = (ArrayList<Signature>) signatures.clone();
		return clone;
	}

	/**
	 * Merges a MethodList in this one
	 * 
	 * @param methodList the method list to merge into this one
	 */
	public void merge(MethodList methodList) {
		for (Signature signature : methodList.signatures) {
			if (!signatures.contains(signature)) {
				signatures.add(signature);
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((returnType == null) ? 0 : returnType.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MethodList other = (MethodList) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (returnType == null) {
			if (other.returnType != null)
				return false;
		} else if (!returnType.compareTo(other.returnType))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String ret = "";
		for (Signature signature : signatures) {
			ret += "+"+name+"("+signature+")";
			if (returnType!=null) {
				if (returnType.nom.equals("Null")) {
					ret += ":void\n";
				} else {
					ret += ":" + returnType + "\n";
				}
			} else {
				ret += "\n";
			}
		}
		return ret;
	}
}