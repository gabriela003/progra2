package observer;

public class Tv implements Observer {

	@Override
	public void actualizar(Subject subject) {
		// TODO Auto-generated method stub
		 if (subject instanceof Journalist) {
            String title = ((Journalist) subject).getTitulo();
            String summary = ((Journalist) subject).getResumen();
            String image = ((Journalist) subject).getImagen();
            String text = ((Journalist) subject).getTexto();
            
            System.out.println("Tv se entero");
	     }
		
	}
	

}
