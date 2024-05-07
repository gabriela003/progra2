package singleton;


public class Inicial {

	public static void main(String[] args) {
		Inicial test = new Inicial();
		test.inicializarConexion("Persona", "persona.cleardb.com");
		test.abrirConexion();
		//SingletonConfiguracion config = new SingletonConfiguracion();//ERROR
		//...
	}
	
	public void inicializarConexion(String baseDatos, String url) {
		//Inicializo la configuracion
		SingletonConfiguracion config = SingletonConfiguracion.instancia();//Aca se crea el objeto
		config.setBaseDatos(baseDatos);
		config.setUrl(url);
	}

	public void abrirConexion() {
		SingletonConfiguracion config = SingletonConfiguracion.instancia();//Aca ya existe el objeto
		Connection con = new Connection(config.getBaseDatos(), config.getUrl());
		//...
	}

}
