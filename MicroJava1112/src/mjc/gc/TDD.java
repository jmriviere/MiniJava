package mjc.gc;

import java.util.HashMap;

/**
* Définition de la table contenant les déclarations
* de classes et d'interfaces. </br>
* Cette classe a été créée, car EGG ne semble pas gérer
* la généricité. </br>
*/

public class TDD extends HashMap<String, Clazz> {

    private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = "";
		for (Clazz clazz : values()) {
			str += "---------------\n" + clazz +"---------------\n\n";
		}
		return str;
	}

    
}