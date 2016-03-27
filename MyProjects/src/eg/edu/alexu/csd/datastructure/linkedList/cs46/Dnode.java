package eg.edu.alexu.csd.datastructure.linkedList.cs46;

public class Dnode {
	public Object Dvalue;
	public Dnode Dnext;
	public Dnode Dprev;

	public Dnode(Object value) {
		this.Dvalue = value;
		this.Dnext = null;
		this.Dprev = null;
	}
}