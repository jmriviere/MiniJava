package mjc.gc;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Clazz {
	// Vérifie si on est en présence d'un interface ou d'une classe
	private boolean interfaze;

	// Contient la liste des attributs définis et leur type
	private HashMap<String, DTYPE> attributes;

	// Contient la liste des méthodes définies
	private ArrayList<Method> methods;

	private Clazz implemented, extended;

	public Clazz(boolean interfaze) {
		this.interfaze = interfaze;
		attributes = new HashMap<String, DTYPE>();
		methods = new ArrayList<Method>();
	}

	public boolean isInterface() {
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
}