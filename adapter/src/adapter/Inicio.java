package adapter;

public class Inicio {
	
	public static void main(String[] args) {
		BarcoPesquero barcoPesquero = new BarcoPesquero();
		
		AdapterBarcoAMotor adapterBarcoAMotor = new AdapterBarcoAMotor(barcoPesquero);
		
		Capitan capitan = new Capitan(adapterBarcoAMotor);
		
	    capitan.navegarAVela();
	}
}