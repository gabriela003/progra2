package factory;

public abstract class Auto {
    public Integer potencia;
    public String tipoCombustible;
    public String color;
    
    public void encender(){
        System.out.println("El auto esta encendido y tiene una potencia de " + potencia.toString());
    }
    public void limpieza(){
        System.out.println("Esta limpio y es de color " + color.toLowerCase());
    }
    public void revisionMecanica(){
        System.out.println("Fue verificado por el mecanido, se encuentra en perfectas condiciones!!!");
    }
    public void combustible(){
        System.out.println("Utiliza combustible del tipo " + tipoCombustible.toLowerCase());
    }
	
	
}
