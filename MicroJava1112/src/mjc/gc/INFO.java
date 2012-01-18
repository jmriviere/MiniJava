//--------------------------------------------------
//INFO la classe representant une info de TDS
//--------------------------------------------------
package mjc.gc;

public class INFO {
	// le type
	protected DTYPE type;
	
	// Le déplacement courant
	protected int dep;

	public DTYPE getType() {
		return type;
	}

	// constructeur
	public INFO(DTYPE t, int dep) {
		type = t;
		this.dep = dep;
	}
	
	public int getDep() {
		return dep;
	}
	
	//
	// affichage
	public String toString() {
		return "; INFO : " + "type=" + type ;
	}
}

