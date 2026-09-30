public class RecursoProxy extends Recurso {
    private Recurso recursoProtegido;
    private Usuario usuario;

    public RecursoProxy (Recurso recurso, Usuario usuario){
        this.recursoProtegido = recurso;
        this.usuario = usuario;

    }

    @Override
    public String getContenido() {
        if(validarIdentidad()){
            //si el acceso es valido -> enviamos la peticion al obj protegido
            return recursoProtegido.getContenido();
        }else{
            // si no es --> lanzar un error
            throw new SecurityException("STATUS = 403 UNAUTHORIZED");
        }
    }

    public boolean validarIdentidad(){
        return this.usuario instanceof UsuarioAdmin;

    }
}
