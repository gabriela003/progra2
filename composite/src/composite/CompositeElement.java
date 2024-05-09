package composite;

import java.util.ArrayList;


public class CompositeElement extends DrawingElement {

	private ArrayList<DrawingElement> elements = new ArrayList<>();
	
	public CompositeElement(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(DrawingElement d) {
		// TODO Auto-generated method stub
		this.elements.add(d);
		
	}

	@Override
	public void remove(DrawingElement d) {
		// TODO Auto-generated method stub
		this.elements.remove(d);
	}

	@Override
	public void display(int indent) {
		// TODO Auto-generated method stub
		elements.get(indent).display(indent);
	}

}
