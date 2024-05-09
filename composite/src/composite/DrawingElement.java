package composite;

public abstract class DrawingElement {
	protected String name;

	public DrawingElement(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(DrawingElement d);
	public abstract void remove(DrawingElement d);
	public abstract void display(int indent);
	

}
