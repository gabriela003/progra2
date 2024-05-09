package composite;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositeElement padre = new CompositeElement("Pintura");

        padre.add(new PrimitiveElement("Red Line"));
        padre.add(new PrimitiveElement("Blue Circle"));
        padre.add(new PrimitiveElement("Green Box"));



        CompositeElement comp = new CompositeElement("Two Circles");
        comp.add(new PrimitiveElement("Black Circle"));
        comp.add(new PrimitiveElement("White Circle"));
        padre.add(comp);



        PrimitiveElement pe = new PrimitiveElement("Yellow Line");

        padre.add(pe);
        padre.display(1);
        padre.remove(pe);

        padre.display(1);
		
		
	}

}
