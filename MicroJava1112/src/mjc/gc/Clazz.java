package mjc.gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;


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
	private HashMap<String, MethodList> methods;
	
	private HashMap<String, MethodList> constructors;

	// Spécifie respectivement la classe implémentée et l'interface étendue.
	private Clazz implemented, extended;

	public Clazz(String name, boolean interfaze) {
		super(name, 0);
		this.interfaze = interfaze;
		attributes = new HashMap<String, DTYPE>();
		methods = new HashMap<String, MethodList>();
		constructors = new HashMap<String, MethodList>();
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
	
	public void addMethod(String name, Signature s) {
		if (methods.containsKey(name)) {
			MethodList ml = methods.get(name);
			ml.addSignature(s);
		}
		else {
			MethodList ml = new MethodList();
			ml.addSignature(s);
			methods.put(name, ml);
		}
	}
	
	public void addConstructor(String name, Signature s) {
		if (constructors.containsKey(name)) {
			MethodList ml = constructors.get(name);
			ml.addSignature(s);
		}
		else {
			MethodList ml = new MethodList();
			ml.addSignature(s);
			constructors.put(name, ml);
		}
	}

	public void setImplemented(Clazz other) {
		implemented = other;
	}

	public void setExtended(Clazz other) {
		extended = other;
		taille += other.getTaille();
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
	
	public boolean addableMethod(Signature s) {
		boolean valid = true;
		if (methods.containsKey(s.getName())) {
			ArrayList<Signature> signatures = ((MethodList)methods.get(s.getName())).getSignatureList();
			for(Signature si : signatures) {
				if (si.equals(s)) {
					valid = false;
					break;
				}
			}
			
		}
		return valid;
	}
	
	public boolean addableConstructor(Signature s) {
		boolean valid = true;
		if (constructors.containsKey(s.getName())) {
			// Accès à la liste des constructeurs.
			MethodList constList = constructors.get(s.getName());
			// La liste des signatures correspodant au constructeur
			
			ArrayList<Signature> signatures = constList.getSignatureList();
			for(Signature si : signatures) {
				if (si.equals(s)) {
					valid = false;
					break;
				}
			}
		}
		return valid;
	}
	
	/* Vérifie, dans le cas d'une implémentation, qu'on définit bien 
	 * toutes les méthodes de l'interface.
	 * précondition: La classe doit implémenter une interface.
	 */
/*	public boolean checkImplements(Clazz implemented) {
		boolean valid = true;
		
		if (implemented == null) {
			return true;
		}
		
		ArrayList<Method> interface_list = (ArrayList<Method>)implemented.methods.clone();
		ArrayList<Method> self_list = (ArrayList<Method>)methods.clone();
		
		if (extended != null) {
			self_list.addAll(extended.methods);
		}
		
		for (Method mOther : interface_list) {
				for (Method mSelf : self_list) {
					if (mOther.equals(mSelf)) {
						interface_list.remove(mOther);
						self_list.remove(mSelf);
						continue;
					}
				}
		}
		
		if (!interface_list.isEmpty()) {
			if (extended != null && extended.extended != null) {
				extended.checkImplements(implemented);
			}
			else {
				valid = false;
			}
		}
		return valid;
	}*/
	
}