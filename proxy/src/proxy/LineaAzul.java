package proxy;

public class LineaAzul implements Colectivo {

	@Override
	public void enter(Pasajero pasajero) {
		System.out.println("Ingreso pasajero " + pasajero.getNombre());
	}

}
