package recibos;

public class Main {

	public static void main(String[] args) {

		Recibo recibo = new Recibo(21,3,2024,2468, "Empresa 777");
		recibo.setTipo('R');
		recibo.setNumero(1);
		recibo.setDetalle("Pago de Servicios A");
		recibo.setTotal(350);
		
		recibo.mostrarInfo();
	}
}
