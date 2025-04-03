package recibos;

public class Recibo extends Comprobante {
	private float total;
	private Proveedor proveedor;
	private String detalle;
	
	public Recibo(int dia, int mes, int anio, int codigo, String razonSocial) {
		super(dia, mes, anio);
		proveedor = new Proveedor(codigo, razonSocial);
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public void mostrarInfo() {
		System.out.printf("Tipo: %c - Número: %d - Fecha: %d/%d/%d\n",
				getTipo(),
				getNumero(),
				getFecha().getDia(),
				getFecha().getMes(),
				getFecha().getAnio()
		);
		
		System.out.printf("----------- Proveedor -------------\n");
		System.out.printf("Código: %d - Razón Social: %s\n",
			proveedor.getCodigo(),
			proveedor.getRazonSocial()
		);
		
		System.out.printf("----------- Detalle -----------\n");
		System.out.printf("Servicio: %s , Importe total : $%.2f\n",
				getDetalle(),
				getTotal()
		);
	}

}
