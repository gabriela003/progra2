package strategy;

//Clase EstrategiaConcreta
public class EstrategiaOrdenamientoInsertion extends EstrategiaOrdenamiento {

	@Override
	public void ordenar(int[] vector) {
		int i, j, indice;
		tiempoInicial = System.nanoTime();
		for (i=1; i<vector.length; i++)
		{
			indice = vector[i];
			j = i;
			while ((j>0) && (vector[j-1] > indice))
			{
				vector[j] = vector[j-1];
				j = j - 1;
			}
			vector[j] = indice;
		}
		tiempoFinal = System.nanoTime();
		System.out.println("Duración ordenamiento insertion: " + (tiempoFinal-tiempoInicial)/1e6 + " ms");
	}
}