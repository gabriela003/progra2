package factory;

public class Inicial {

	public static void main(String[] args) {
        Cliente clienteUno = new Cliente("B", "AUDI");
        
        Fabrica fabrica = getFabricaAuto(clienteUno);
        if(fabrica != null) {
        	Auto autoUno = fabrica.crear(clienteUno.getTipoAuto());
        	autoUno.encender();
        }
    }
	private static Fabrica getFabricaAuto(Cliente clienteUno) {
		 switch (clienteUno.getContratoEmpresa().toUpperCase()) {
	         case "BMW":
	             return new FabricaBMW();
	         case "AUDI":
	             return new FabricaAudi();
	         default:
	             System.out.println("Fabrica no disponible");
	             return null;
		 }
	}

	
	
}
