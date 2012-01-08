package mjc.gc;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Permet de définir la déclaration d'une classe.
 * @author poupine
 *
 */

public class Clazz extends DTYPE {
	// Le nom de la classe définie.
	private String name;
	
	// Vérifie si on est en présence d'un interface ou d'une classe
	private boolean interfaze;

	// Contient la liste des attributs définis et leur type
	private HashMap<String, DTYPE> attributes;

	// Contient la liste des méthodes définies
	private ArrayList<Method> methods;

	// Spécifie respectivement la classe implémentée et l'interface étendue.
	private Clazz implemented, extended;

	public Clazz(String name, boolean interfaze) {
		super(name, 0);
		this.interfaze = interfaze;
		attributes = new HashMap<String, DTYPE>();
		methods = new ArrayList<Method>();
	}
	
	public boolean isInterfaze() {
		return interfaze;
	}

	public boolean hasAttribute(String attrName) {
		return attributes.containsKey(attrName);
	}

	public DTYPE getAttribute(String attrName) {
		return attributes.get(attrName);
	}

	public void addAttribute(String name, DTYPE type) {
		attributes.put(name, type);
	}

	public void setImplemented(Clazz other) {
		implemented = other;
	}

	public void setExtended(Clazz other) {
		extended = other;
	}

	/**
	 * *
	 * @param taille
	 * Permet de spécifier la taille mémoire occupée par une instance de la classe
	 * créée une fois qu'on l'a calculée. En effet, ce calcul ne se fait pas à
	 * l'instanciation de l'objet Clazz correspondant.
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public Clazz getImplemented() {
		return implemented;
	}

	public Clazz getExtended() {
		return extended;
	}

	public boolean canExtend(Clazz other) {
		return other.interfaze == interfaze;
	}

	public boolean canImplement(Clazz other) {
		return (!interfaze && other.interfaze);
	}
	
	public boolean addableMethod(Method m) {
		// TODO: Définir les règles d'ajout d'une méthode.
		return true;
	}
	
	public boolean addableConstructor(Method m) {
		return m.getName() == name;
	}
	
}