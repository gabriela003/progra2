package proyecto;

public class Empleado extends Persona {
	private int sueldoBruto;
	private Directivo jefe;
	private Empresa empresa;
	
	public Empleado(String nombre, int dia, int mes, int anio, int sueldoBruto) {
		super(nombre, dia, mes, anio);
		this.sueldoBruto = sueldoBruto;
	}

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public Directivo getJefe() {
		return jefe;
	}

	public void setJefe(Directivo jefe) {
		this.jefe = jefe;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public int getCategoria() {
		return 0;
	}
}
