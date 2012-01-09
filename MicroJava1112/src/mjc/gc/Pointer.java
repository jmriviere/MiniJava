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
}
