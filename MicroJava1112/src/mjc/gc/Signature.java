package mjc.gc;

import java.util.ArrayList;

/**
 * The list of the arguments of the methods or constructor as types.
 * </br>
 * This class was created to compensate the impossibility of unsing genericity in EGG
 * 
 * @author (comments) emmanuel
 */
public class Signature extends ArrayList<DTYPE> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
		Signature other = (Signature) obj;
		if (size()==other.size()) {
			boolean ok = true;
			for (int i = 0; i < size(); i++) {
				ok = other.get(i).isType(get(i));
				if (!ok) {
					return ok;
				}
			}
			return ok;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		String str = "";
		if (!isEmpty()) {
			str += this.get(0);
		}
		for (int i = 1; i < this.size(); i++) {
			str += ", " + this.get(i);
		}
		return str;
	}

	
}
