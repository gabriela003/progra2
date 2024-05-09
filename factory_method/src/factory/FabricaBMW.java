package factory;

public class FabricaBMW extends Fabrica {
    @Override
    Auto obtenerAuto(String tipoAuto) {
        switch (tipoAuto) {
            case "A":
                return new Bmw();
            case "B":
                return new Bmw();
            default:
                System.out.println("Tipo de auto no disponible");
                return null;
        }
    }
}
