package adapter;

public class BarcoPesquero implements BarcoAMotor{

	@Override
	public void navegar() {
		System.out.println("El barco pesquero esta navegando");
	}
}