/**
 * 
 */
package mjc.gc;

/**
 * A class figuring the domains of the operators
 * 
 * @author emmanuel
 */
public class Domain {

	private DTYPE[] types;
	private DTYPE returnType;

	/**
	 * @param returnType the return type for this domain
	 * @param types the types of entry of this domain
	 */
	public Domain(DTYPE returnType, DTYPE... types) {
		this.returnType = returnType;
		this.types = types;
	}
	
	/**
	 * Tests if the position parameter for this operator can be of type type.
	 * 
	 * @param position the position of the parameter
	 * @param type the real type of the parameter
	 * @return true if a parameter of this type can be put at this position
	 */
	public boolean accepts(int position, DTYPE type) {
		if (position>types.length) {
			return false;
		}
		return type.isType(types[position]);
	}
	
	/**
	 * Restricts the domains to a specified type in e specified position.
	 * </br>Only useful for the multi-domains. Not implemented in this class
	 * 
	 * @param position the position of the parameter
	 * @param type the type of the parameter
	 */
	@SuppressWarnings("unused")
	public void restrict(int position, DTYPE type) {
		// Only usefull for multidomain, not implemented
	}

	/**
	 * @return the returnType
	 */
	public DTYPE getReturnType() {
		return returnType;
	}

	/**
	 * Gives a type accepted at the given position
	 * 
	 * @param position the position
	 * @return the type accepted
	 */
	public DTYPE getType(int position) {
		return types[position];
	}
}
