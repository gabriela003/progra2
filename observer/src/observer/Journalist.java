package observer;

import java.util.ArrayList;

public class Journalist implements Subject {

	private ArrayList observers = new ArrayList<>();
    private String titulo, resumen, imagen, texto;
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void remObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notificarObserver() {
		// TODO Auto-generated method stub
		observers.forEach(observer -> ((Observer) observer).actualizar(this));
	}

    public void publish(String titulo, String resumen, String imagen, String texto) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.imagen = imagen;
        this.texto = texto;
        notificarObserver();
    }

	public ArrayList getObservers() {
		return observers;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public String getImagen() {
		return imagen;
	}

	public String getTexto() {
		return texto;
	}
	
    
	
}
