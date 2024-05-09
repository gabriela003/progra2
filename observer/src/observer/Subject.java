package observer;

public interface Subject {
	void addObserver(Observer observer);
    void remObserver(Observer observer);
    void notificarObserver();
	
}
