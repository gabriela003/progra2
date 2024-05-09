package strategy;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux[], topeVector = 1000;
        VectorEnteros vector = new VectorEnteros(topeVector, new EstrategiaOrdenamientoBubble());
        aux = vector.generarVector(topeVector);
        vector.cargarVector(aux);
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoInsertion());
        vector.cargarVector(aux);
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoShell());
        vector.cargarVector(aux);
        vector.ordenar();
	}
	
	
	
}
