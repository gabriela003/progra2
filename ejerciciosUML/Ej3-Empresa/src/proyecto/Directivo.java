package proyecto;

import java.util.ArrayList;

public class Directivo extends Empleado {

	private int categoria;
	private ArrayList<Empleado> empleados;
	
	public Directivo(String nombre, int dia, int mes, int anio, int sueldoBruto, int categoria) {
		super(nombre, dia, mes, anio, sueldoBruto);
		this.categoria = categoria;
		empleados = new ArrayList<Empleado>();
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
}
