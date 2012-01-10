package mjc.gc;

public class DTYPE {
	
	protected int taille;

	public int getTaille() {
		return taille;
	}

	protected String nom;

	public String getName() {
		return nom;
	}

	public DTYPE(String n, int t) {
		nom = n;
		taille = t;
	}

	public boolean compareTo(DTYPE autre) {
		return nom.equals(autre.nom);
	}

	public String toString() {
		return nom + "(" + taille + ")";
	}


	public boolean isType(DTYPE dtype) {
		if (nom.equals("Null")) {
			if (dtype instanceof Pointer) {
				return true;
			}
		}
		return compareTo(dtype);
	}
}

