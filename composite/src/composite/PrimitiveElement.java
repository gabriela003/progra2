package composite;

public class PrimitiveElement extends DrawingElement {

	public PrimitiveElement(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(DrawingElement d) {
		// TODO Auto-generated method stub
        System.out.println("No se puede agregar a un PrimitiveElement");

	}

	@Override
	public void remove(DrawingElement d) {
		// TODO Auto-generated method stub
		System.out.println("No se puede borrar un PrimitiveElement");
	}

	@Override
	public void display(int indent) {
		// TODO Auto-generated method stub
		System.out.println(this.name);
	}

}
