package org.example;

public class URLProxy implements URL {

    private URLProtegida urlProtegida;
    private Usuario usuario;

    // con inyeccion: el objeto protegido se recibe desde afuera
    public URLProxy(URLProtegida urlProtegida, Usuario usuario) {
        this.urlProtegida = urlProtegida;
        this.usuario = usuario;
    }

    // sin inyeccion: el proxy crea el objeto protegido solo cuando hace falta (lazy)
    public URLProxy(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getContenido() {
        if (validarIdentidad()) {
            //si el acceso es valido--> envio la peticion al obj protegido
            if (urlProtegida == null) {
                urlProtegida = new URLProtegida("<html>...</html>");
            }
            return urlProtegida.getContenido();
        } else {
            //si no es una peticion de un user admin --> lanzamos error
            throw new SecurityException("STATUS = 403 UNAUTHORIZED");
        }
    }

    private boolean validarIdentidad() {
        //valida si un usuario es admin
        return this.usuario instanceof UsuarioAdmin;
    }
}
