package strategy;

//Clase EstrategiaConcreta
public class EstrategiaOrdenamientoShell extends EstrategiaOrdenamiento {

	@Override
	public void ordenar(int[] vector) {
		int i, j, incremento=0, aux;
		incremento = vector.length/2;
		tiempoInicial = System.nanoTime();
		while (incremento > 0)
		{
			for (i=incremento; i < vector.length; i++)
			{
				j 		= i;
				aux 	= vector[i];
				while ((j >= incremento) && (vector[j-incremento] > aux))
				{
					vector[j] = vector[j - incremento];
					j = j - incremento;
				}
				vector[j] = aux;
			}
			incremento /= 2;
		}
		tiempoFinal = System.nanoTime();
		System.out.println("Duración ordenamiento shell: " + (tiempoFinal-tiempoInicial)/1e6 + " ms");
	}
}