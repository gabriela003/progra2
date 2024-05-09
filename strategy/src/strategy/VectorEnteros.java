package strategy;

//Clase Contexto
public class VectorEnteros {

	private int vector[];
	private final int tope;
	private EstrategiaOrdenamiento estrategia;
	
	public  int[] generarVector(int tope){
		int f,n, aux[] = new int[tope];
		for(f=0; f<tope; f++)
		{
			n= (int)(Math.random() * tope) + 1;
			aux[f]=n;
		}
		return aux;
	}
	
	public void cargarVector(int [] aux){
		this.limpiar();
		for(int i=0; i< this.tope; i++)
		{
			this.agregar(aux[i]);
		}
	}
	
	public VectorEnteros(int tope, EstrategiaOrdenamiento estrategia) {
		vector 			= new int[tope];
		this.estrategia = estrategia;
		this.tope		= tope;
	}

	public void setEstrategia(EstrategiaOrdenamiento estrategia) {
		this.estrategia = estrategia;
	}

	public void agregar(int numero)
	{
		for(int i=0; i<vector.length; i++) {
			if(vector[i]==0){
				vector[i] = numero;
				break;
			}
		}
	}

	public void ordenar() {
		estrategia.ordenar(vector);
	}
	public int getTope() {
		return tope;
	}
	public void limpiar() {
		for(int i=0; i<vector.length; i++) {
			vector[i]=0;
		}
	}
}