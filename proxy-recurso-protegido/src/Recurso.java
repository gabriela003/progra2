public abstract class Recurso {
    private String path;
    private String contenido;

    public Recurso(String path, String contenido) {
        this.path = path;
        this.contenido = contenido;
    }
    public Recurso() {

    }

    public String getContenido() {
        return contenido;
    }
}
