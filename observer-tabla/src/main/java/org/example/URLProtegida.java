package org.example;

public class URLProtegida implements URL {
    private String contenido;

    public URLProtegida(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String getContenido() {
        return contenido;
    }
}
