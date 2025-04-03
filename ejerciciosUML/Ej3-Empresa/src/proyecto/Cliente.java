package proyecto;

import java.util.ArrayList;

public class Cliente extends Persona {
	private int telefono;
	ArrayList<Empresa> empresas;
	
	public Cliente(String nombre, int dia, int mes, int anio, int telefono) {
		super(nombre, dia, mes, anio);
		this.telefono = telefono;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
