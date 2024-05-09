package factory;

public abstract class Fabrica {
    
	public Auto crear(String tipoAuto) {
        Auto auto = obtenerAuto(tipoAuto);
        auto = prepararAuto(auto);
        return auto;
    }
    private Auto prepararAuto(Auto auto){
        auto.limpieza();
    	auto.revisionMecanica();
    	auto.combustible();
        return auto;
    }
    abstract Auto obtenerAuto(String tipoAuto);
	
	
}
