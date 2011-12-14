package mjc.gc;

public class INFOCLASS extends INFO {

    private TDS tds;

    public INFOCLASS(DTYPE type, TDS tds) {
	super(type);
	this.tds = tds;
    }

    public TDS getTds() {
	return tds;
    }
}