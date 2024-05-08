package proxy;

public class LineaAzulProxy implements Colectivo {

    private static final int CANTIDAD_PASAJEROS = 6;
    private int numPasajeros;
    private Colectivo cole;
	
	@Override
	public void enter(Pasajero pasajero) {
		 if (numPasajeros < CANTIDAD_PASAJEROS) {
		      cole.enter(pasajero);
		      numPasajeros++;
		    } else {
		    	System.out.println("Supero el maximo de pasajeros");
		    }
		
	}

	public LineaAzulProxy(Colectivo cole) {
		super();
		this.cole = cole;
	}

}
