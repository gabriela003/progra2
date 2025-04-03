package facturas;

public class Cliente {
	private int codigo;
	private String razonSocial;
	
	public Cliente(int codigo, String razonSocial) {
		this.codigo = codigo;
		this.razonSocial = razonSocial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
}
