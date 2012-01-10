package mjc.gc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collection;


/**
 * Permet de définir la déclaration d'une classe.
 * @author poupine
 *
 */
public class Clazz extends DTYPE {
	private static final Collection<MethodList> emptyList = new ArrayList<>();

	// Le nom de la classe définie.
	private String name;
	
	// Vérifie si on est en présence d'un interface ou d'une classe
	private boolean interfaze;

	// Contient la liste des attributs définis et leur type
	private HashMap<String, DTYPE> attributes;

	// Contient la liste des méthodes définies
	private HashMap<String, MethodList> methods;
	
	private MethodList constructors;

	// Spécifie respectivement la classe implémentée et l'interface étendue.
	private Clazz implemented, extended;

	/**
	 * Creates a new class element in the compiler
	 * 
	 * @param name the name of the class
	 * @param interfaze if it is an interface
	 */
	public Clazz(String name, boolean interfaze) {
		super(name, 0);
		this.interfaze = interfaze;
		attributes = new HashMap<>();
		methods = new HashMap<>();
		constructors = new MethodList(name, null);
	}
	
	/**
	 * Tests the interface state of the class. If false, it is a concrete class.
	 * 
	 * @return whether it is an interface or not
	 */
	public boolean isInterfaze() {
		return interfaze;
	}

	/**
	 * Tests the presence of an attribute in the class
	 * 
	 * @param attrName the searched attribute 
	 * @return if the attribute is known in this class
	 */
	public boolean hasAttribute(String attrName) {
		return attributes.containsKey(attrName)||extended.hasAttribute(attrName);
	}

	/**
	 * Gets an attribute if defined in the class
	 * 
	 * @param attrName the searched attribute
	 * @return the attribute DTYPE, null if the attribute is undefined in this class
	 */
	public DTYPE getAttribute(String attrName) {
		return attributes.get(attrName);
	}

	/**
	 * Adds an attribute
	 * 
	 * @param attributeName the name of the attribute
	 * @param type the DTYPE of the attribute
	 */
	public void addAttribute(String attributeName, DTYPE type) {
		attributes.put(attributeName, type);
		taille += type.getTaille();
	}
	
	/**
	 * Adds a method. Return true if it could be added.
	 * 
	 * @param methodName the name of the method
	 * @param returnType the return type of the method
	 * @param s the signature of the method
	 * @return false if the method signature already existed
	 */
	public boolean addMethod(String methodName, DTYPE returnType, Signature s) {
		MethodList ml;
		if (methods.containsKey(methodName)) {
			ml = methods.get(methodName);
		} else {
			ml = new MethodList(methodName, returnType);
			methods.put(methodName, ml);
		}
		return ml.addSignature(s);
	}
	
	/**
	 * Adds a constructor. Return true if it was really added.
	 * 
	 * @param signature the signature of the constructor
	 * @return false if the signature already existed
	 */
	public boolean addConstructor(Signature signature) {
		return constructors.addSignature(signature);
	}

	/**
	 * Test if the given class can be extended by this one
	 * 
	 * @param other the class to extend
	 * @return true if they are both concrete or both interface
	 */
	public boolean canExtend(Clazz other) {
		return other.interfaze == interfaze;
	}

	/**
	 * Test if the given class can be implemented by this one
	 * 
	 * @param other the class to implement
	 * @return true if the given class is an interface and this one is a concrete one.
	 */
	public boolean canImplement(Clazz other) {
		return (!interfaze && other.interfaze);
	}
	
	/**
	 * Sets the implemented class (there is only one)
	 * 
	 * @param other the implemented class to set
	 */
	public void setImplemented(Clazz other) {
		implemented = other;
	}

	/**
	 * Sets the extended class (there is only one)
	 * 
	 * @param other the class to be extended
	 */
	public void setExtended(Clazz other) {
		extended = other;
		taille += other.getTaille();
	}
	
	/**
	 * @return false if there is an incompatibility in the pairs return type/name
	 */
	public boolean testExtendImplementCompatible() {
		if (extended==null||implemented==null) {
			return true;
		}
		Collection<MethodList> list = implemented.getToImplement();
		Collection<MethodList> listConcrete = extended.getConcreteMethods();
		// Comparaison des method list return types et names
		boolean stop = false;
		for (MethodList methodList : listConcrete) {
			for (MethodList methodList2 : list) {
				if (methodList.getName().equals(methodList2.getName())) {
					stop = !methodList.getReturnType().equals(methodList2.getReturnType());
				}
				if (stop) {
					continue;
				}
			}
			if (stop) {
				continue;
			}
		}
		return !stop;
	}

	/**
	 * @return The implemented class
	 */
	public Clazz getImplemented() {
		return implemented;
	}

	/**
	 * @return the extended class
	 */
	public Clazz getExtended() {
		return extended;
	}
	
	/**
	 * @return return the set of the signatures of constructors of this class
	 */
	public MethodList getConstructors() {
		return constructors;
	}
	
	/**
	 * Returns a set of signature that posses the given name.
	 * 
	 * @param methodName the name of the method
	 * @return the set of method signatures with that name
	 */
	public MethodList getMethodList(String methodName) {
		MethodList ret = (MethodList) methods.get(methodName).clone();
		if (extended != null) {
			ret.merge(extended.getMethodList(methodName));			
		}
		return ret;
	}

	/**
	 * Test if the name is valid for a method. Only the constructor shall use the name of the class as name.
	 * 
	 * @param methodName the name of the method to add
	 * @return false if it is the name of the class
	 */
	public boolean validMethodName(String methodName) {
		return !methodName.equals(this.name);
	}
	
	/**
	 * Tests the compatibility between the name and the type for the method
	 * 
	 * @param methodName the method name
	 * @param type the method type
	 * @return true if the type can be the return of a method with the given name
	 */
	public boolean validMethodType(String methodName, DTYPE type) {
		if (getReturnTypeOfMethod(methodName)==null) {
			return true;
		}
		return type.equals(getReturnTypeOfMethod(methodName));
	}

	/**
	 * @param methodName The method name
	 * @return the type of return of the method, if ever defined in the inheritance tree
	 */
	private DTYPE getReturnTypeOfMethod(String methodName) {
		if (methods.containsKey(methodName)) {
			return methods.get(methodName).getReturnType();
		}
		DTYPE type = null;
		if (implemented != null) {
			type = implemented.getReturnTypeOfMethod(methodName);
		}
		if (type != null) {
			return type;
		}
		if (extended != null) {
			return extended.getReturnTypeOfMethod(methodName);
		}
		return null;
	}


	/**
	 * @return true if all the methods to implement are implemented
	 */
	public boolean checkImplements() {
		if (implemented == null) {
			return true;
		}
		Collection<MethodList> list = implemented.getToImplement();
		return implement(new ArrayList<>(list));
	}
	
	/**
	 * @return The list of the methods to implement to comply with this <strong>interface</strong>
	 */
	private Collection<MethodList> getToImplement() {
		if (interfaze) {
			Collection<MethodList> tempList = methods.values();
			ArrayList<MethodList> list = new ArrayList<>();
			
			for (MethodList methodList : tempList) {
				list.add((MethodList) methodList.clone());
			}
			if (extended != null) {
				Collection<MethodList> list2 = extended.getToImplement();
				for (MethodList methodList : list2) {
					if (list.contains(methodList)) {
						list.get(list.indexOf(methodList)).merge(methodList);
					} else {
						list.add(methodList);
					}
				}
			}
			return list;
		}
		return emptyList;
	}
	
	/**
	 * @return the concretes methods for this class
	 */
	private Collection<MethodList> getConcreteMethods() {
		Collection<MethodList> tempList = methods.values();
		ArrayList<MethodList> list = new ArrayList<>();
		
		for (MethodList methodList : tempList) {
			list.add((MethodList) methodList.clone());
		}
		if (extended != null) {
			Collection<MethodList> list2 = extended.getConcreteMethods();
			for (MethodList methodList : list2) {
				if (list.contains(methodList)) {
					list.get(list.indexOf(methodList)).merge(methodList);
				} else {
					list.add(methodList);
				}
			}
		}
		return list;
	}

	/**
	 * @param methodsToImplement list of the methods to implement
	 * @return true if every method is implemented by this class or the ones it extends
	 */
	private boolean implement(ArrayList<MethodList> methodsToImplement) {
		Collection<MethodList> self = this.methods.values();
		
		for (MethodList methodList : self) {
			if (methodsToImplement.contains(methodList)) {
				MethodList other = methodsToImplement.get(methodsToImplement.indexOf(methodList)); 
				other.removeSignatures(methodList.getSignatureList());
				if (other.isEmpty()) {
					methodsToImplement.remove(other);
				}
			}
		}
		if (methodsToImplement.isEmpty()) {
			return true;
		}
		if (extended == null) {
			return false;
		}
		return extended.implement(methodsToImplement);
	}

	/**
	 * Test if this class extends the given one (even through other classes
	 * 
	 * @param other the class to be extended
	 * @return true if this class extends (directly or indirectly) the given one
	 */
	public boolean isClazz(Clazz other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (other.name == this.name) {
			return true;
		}
		boolean inherit = false;
		if (implemented != null) {
			inherit = implemented.isClazz(other);
		}
		if (extended != null) {
			inherit |= extended.isClazz(other);
		}
		return inherit;
	}
	
}