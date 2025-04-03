package proyecto;

public class Main {

	public static void main(String[] args) {

		Empresa empresa1 = new Empresa("Arcor","2012345542");
		
		empresa1.agregarDirectivo("Juan", 22, 11, 1978, 1000000, 5);
		
		empresa1.agregarEmpleado("Ana", 23, 10, 1988, 40000);
		empresa1.agregarEmpleado("Lucas", 12, 4, 2001, 37000);
		empresa1.agregarEmpleado("Pepe", 1, 2, 1992, 41000);
		
		Cliente cliente1 = new Cliente("Carlos", 27, 4, 1996, 1567854387);
		empresa1.agregarCliente(cliente1);
		
		empresa1.info();
	}

}
