package facturas;

public class Main {

	public static void main(String[] args) {
		Fecha hoy = new Fecha(21,3,2024);
		
		Producto prod1 = new Producto(1, "Café", (float)8.5);
		Producto prod2 = new Producto(2, "Medialuna", (float)2);
		
		Cliente cliente = new Cliente(1, "Juana");
		
		Factura f1 = new Factura('F',1,hoy,cliente);
		
		f1.agregarProducto(prod1);
		f1.agregarProducto(prod2);
		
		f1.mostrarInfo();
	}

}
