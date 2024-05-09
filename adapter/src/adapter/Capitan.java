package adapter;

//Clase Objetivo
public class Capitan {

	private BarcoAVela barcoAVela;
	
	public Capitan() {
	}
	
	public Capitan(BarcoAVela barcoAVela) {
		this.barcoAVela = barcoAVela;
	}
	
	public void setbarcoAVela(BarcoAVela barcoAVela) {
		this.barcoAVela = barcoAVela;
	}

	public void navegarAVela() {
	    barcoAVela.navegarAVela();
	}
}