package facturas;

import java.util.ArrayList;

public class Factura extends Comprobante {
	private float total;
	private Cliente cliente;
	private ArrayList<Producto> productos;
	
	public Factura(char tipo, int numero, Fecha fecha, Cliente cliente) {
		super(tipo, numero, fecha);
		setCliente(cliente);
		productos = new ArrayList<>();
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
		setTotal(getTotal() + producto.getPrecio());
	}
	
	private void mostrarProductos() {
		for(Producto p : productos) {
			System.out.printf("Código: %d , Descripción: %s , Precio: $%.2f\n",
				p.getCodigo(),
				p.getDescripcion(),
				p.getPrecio()
			);
		}
	}
	
	public void mostrarInfo() {
		System.out.printf("Tipo: %c - Número: %d - Fecha: %d/%d/%d\n",
				getTipo(),
				getNumero(),
				getFecha().getDia(),
				getFecha().getMes(),
				getFecha().getAnio()
		);
		
		System.out.printf("----------- Cliente -------------\n");
		System.out.printf("Código: %d - Razón Social: %s\n",
			cliente.getCodigo(),
			cliente.getRazonSocial()
		);
		
		System.out.printf("----------- Productos -----------\n");
		mostrarProductos();
		
		System.out.printf("\nPrecio total: $%.2f\n", getTotal());
	}
	
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	
}
