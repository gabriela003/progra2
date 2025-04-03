package proyecto;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, int dia, int mes, int anio) {
		super();
		this.nombre = nombre;
		fechaNacimiento = LocalDate.of(anio, mes, dia);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int calcularEdad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
		
		return periodo.getYears();
	}
	
}
