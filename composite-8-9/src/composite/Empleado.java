package composite;

public class Empleado implements INombrable{
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void dameNombre() {
        System.out.println("Mi nombre es: " + this.nombre);
    }
}
