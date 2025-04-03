package facturas;

public class Producto {
	private int codigo;
	private String descripcion;
	private float precio;

	public Producto(int codigo, String descripcion, float precio) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
