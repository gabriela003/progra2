package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("PATRON PROXY: PRUEBA DE PETICIONES");

        //crear usuarios
        Usuario admin = new org.example.UsuarioAdmin("admin", "pass123");
        Usuario normal = new UsuarioNormal("normal", "pass123");

        //crear nuestro contenido protegido
        URLProtegida urlProtegida = new URLProtegida("<html><body><h1>CONTENIDO PROTEGIDO</h1></body></html>");

        System.out.println("HAPPYPATH: un usuario de tipo admin realiza la peticion:");

        try {
            URL proxy1 = new URLProxy(urlProtegida, admin);
            String contenido = proxy1.getContenido();
            System.out.println("ACCESO CONCEDIDO: CONTENIDO: " + contenido);
        } catch (SecurityException e) {
            System.out.println("ERROR: SECURITY EXCEPTION: " + e.getMessage());
        }

        System.out.println("UNHAPPYPATH: un usuario de tipo normal realiza la peticion:");

        try {
            URL proxy2 = new URLProxy(urlProtegida, normal);
            String contenido = proxy2.getContenido();
            System.out.println("ACCESO CONCEDIDO: CONTENIDO: " + contenido);
        } catch (SecurityException e) {
            System.out.println("ERROR: SECURITY EXCEPTION: " + e.getMessage());
        }
    }
}
