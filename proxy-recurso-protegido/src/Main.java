//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("INICIO: PROXY");

        //crear usuarios
        Usuario admin =  new UsuarioAdmin("admin", "admin", "admin");
        Usuario generico = new UsuarioGenerico("generico", "generico");

        //crear nuestro recursoConcreto
        RecursoConcreto recursoConcreto = new RecursoConcreto("/admin", "<html><body><h1>ADMINISTRADOR</h1></body></html>");

//        System.out.println("HAPPYPATH: un usuario de tipo admin realiza la peticion: ");
//
//        try{
//            RecursoProxy proxy = new RecursoProxy(recursoConcreto, admin);
//            String contenido = proxy.getContenido();
//            System.out.println("CONTENIDO ACCEDIDO = " + contenido);
//        }catch (SecurityException e){
//            System.out.println("ERROR: SECURITY EXCEPTION" + e.getMessage());
//        }

        System.out.println("UNHAPPYPATH: un usuario de tipo generico realiza la peticion: ");

        try{
            RecursoProxy proxy = new RecursoProxy(recursoConcreto, generico);
            String contenido = proxy.getContenido();
            System.out.println("CONTENIDO ACCEDIDO = " + contenido);
        }catch (SecurityException e){
            System.out.println("ERROR: SECURITY EXCEPTION " + e.getMessage());
        }
    }
}