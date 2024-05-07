package singleton;

public class SingletonConfiguracion {

	private String url;
	private String baseDatos;
	private static SingletonConfiguracion instancia;
	
	private SingletonConfiguracion() {
	}
	
	public static SingletonConfiguracion instancia() {
	//Lazy loading, se crea cuando es llamado por primera vez
	if (instancia==null) {
		instancia = new SingletonConfiguracion();
	}
		return instancia;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBaseDatos() {
		return baseDatos;
	}

	public void setBaseDatos(String baseDatos) {
		this.baseDatos = baseDatos;
	}
}