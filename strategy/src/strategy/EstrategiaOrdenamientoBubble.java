package strategy;

//Clase EstrategiaConcreta
public class EstrategiaOrdenamientoBubble extends EstrategiaOrdenamiento {

	@Override
	public void ordenar(int[] vector) {
		int i, iAux, iPaso=1;
		boolean bOrd;
		tiempoInicial = System.nanoTime();
		do
		{
			bOrd=true;
			for(i=0;i<vector.length-iPaso;i++)
			{
				if(vector[i]>vector[i+1])
				{
					iAux		= vector[i];
					vector[i]	= vector[i+1];
					vector[i+1]	= iAux;
					bOrd		= false;
				}
			}
			iPaso++;
		}while(!bOrd);
		tiempoFinal = System.nanoTime();
		System.out.println("Duración ordenamiento bubble: " + (tiempoFinal-tiempoInicial)/1e6 + " ms");
	}
}