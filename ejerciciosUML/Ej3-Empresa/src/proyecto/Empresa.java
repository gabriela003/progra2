package proyecto;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private String CUIT;
	
	ArrayList<Cliente> clientes;
	ArrayList<Empleado> empleados;
	
	
	public Empresa(String nombre, String cUIT) {
		super();
		this.nombre = nombre;
		CUIT = cUIT;
		clientes = new ArrayList<>();
		empleados = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCUIT() {
		return CUIT;
	}


	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	
	public void agregarEmpleado(String nombre, int dia, int mes, int anio, int sueldoBruto) {
		empleados.add(new Empleado(nombre, dia, mes, anio, sueldoBruto));
	}
	
	public void agregarDirectivo(String nombre, int dia, int mes, int anio, int sueldoBruto, int categoria) {
		empleados.add(new Directivo(nombre, dia, mes, anio, sueldoBruto, categoria));
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void info() {
		System.out.printf("Nombre empresa: %s - CUIT: %s\n",
				getNombre(),
				getCUIT()
		);
		
		for(int i=0; i<clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			System.out.printf("cliente(%d): nombre: %s - edad: %d, telefono: %s\n",
					i + 1,
					cliente.getNombre(),
					cliente.calcularEdad(),
					cliente.getTelefono()
			);
		}
		
		for(int i=0; i<empleados.size(); i++) {
			Empleado empleado = empleados.get(i);
			System.out.printf("empleado(%d): nombre: %s - edad: %d, sueldo: %d %s\n",
					i + 1,
					empleado.getNombre(),
					empleado.calcularEdad(),
					empleado.getSueldoBruto(),
					empleado.getCategoria()!=0? ("(Directivo categoría: " + empleado.getCategoria() + ")") : ""
			);
		}
	}
	
}
