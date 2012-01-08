package mjc.gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


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
	
	private ArrayList<Method> constructors;

	// Spécifie respectivement la classe implémentée et l'interface étendue.
	private Clazz implemented, extended;

	public Clazz(String name, boolean interfaze) {
		super(name, 0);
		this.interfaze = interfaze;
		attributes = new HashMap<String, DTYPE>();
		methods = new ArrayList<Method>();
		constructors = new ArrayList<Method>();
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
		taille += type.getTaille();
	}
	
	public void addMethod(Method m) {
		methods.add(m);
	}
	
	public void addConstructor(Method m) {
		constructors.add(m);
	}

	public void setImplemented(Clazz other) {
		implemented = other;
	}

	public void setExtended(Clazz other) {
		extended = other;
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
		boolean valid = true;
		Method m_list;
		for (Iterator<Method> i = methods.iterator(); i.hasNext();) {
			m_list = i.next();
			if (m.equals(m_list)) {
				valid = false;
			}
		}
		return valid;
	}
	
	public boolean addableConstructor(Method m) {
		boolean valid = true;
		Method m_list;
		for (Iterator<Method> i = constructors.iterator(); i.hasNext();) {
			m_list = i.next();
			if (m.equals(m_list)) {
				valid = false;
			}
		}
		return valid;
	}
	
}