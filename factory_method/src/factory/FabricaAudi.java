package factory;

public class FabricaAudi extends Fabrica {
    @Override
    Auto obtenerAuto(String tipoAuto) {
        switch (tipoAuto) {
            case "A":
                return new Audi310();
            case "B":
                return new Audi();
            default:
                System.out.println("Tipo de auto no disponible");
                return null;
        }
    }
}
