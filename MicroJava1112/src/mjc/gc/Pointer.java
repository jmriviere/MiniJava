package mjc.gc;

public class Pointer extends DTYPE {

	private Clazz clazz;
	
	public Pointer(Clazz clazz) {
		super(clazz.getName(), 1);
		this.clazz = clazz;
	}
	
	public Clazz getClazz() {
		return clazz;
	}

	/* (non-Javadoc)
	 * @see mjc.gc.DTYPE#isType(mjc.gc.DTYPE)
	 */
	@Override
	public boolean isType(DTYPE dtype) {
		if (dtype instanceof Pointer) {
			Clazz other = ((Pointer) dtype).getClazz();
			Clazz self = getClazz();
			return self.isClazz(other);
		} else {
			return false;
		}
	}
}
