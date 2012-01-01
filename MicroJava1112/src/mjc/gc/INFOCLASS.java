package mjc.gc;

public class INFOCLASS extends INFO {

    //private TDS tds;
    private boolean isInterface;

    public INFOCLASS(DTYPE type, boolean isInterface) {
    	super(type);
		//this.tds = tds;
		this.isInterface = isInterface;
    }

    //public TDS getTds() {
    	//return tds;
    //}
    
    public boolean IsInterface() {
    	return this.isInterface;
    }
}