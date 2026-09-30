public class UsuarioAdmin extends Usuario {

    private String rol;

    public UsuarioAdmin(String username, String password, String rol) {
        super(username, password);
        this.rol = rol;
    }
}
