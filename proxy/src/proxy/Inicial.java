package proxy;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineaAzul lAzul = new LineaAzul();
		LineaAzulProxy lProxy = new LineaAzulProxy(lAzul);
		lProxy.enter(new Pasajero("Uno", "Uno"));
		lProxy.enter(new Pasajero("Dos", "Uno"));
		lProxy.enter(new Pasajero("Tres", "Uno"));
		lProxy.enter(new Pasajero("Cuatro", "Uno"));
		lProxy.enter(new Pasajero("Cinco", "Uno"));
		lProxy.enter(new Pasajero("Seis", "Uno"));
		lProxy.enter(new Pasajero("Siete", "Uno"));
		
	}

}
