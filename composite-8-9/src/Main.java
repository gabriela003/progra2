import composite.Area;
import composite.Empleado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Area empresa = new Area("Empresa SA");
        Area area1 = new Area("FRONT");
        Area area2 = new Area("BACK");

        Empleado e1 = new Empleado("Pepe");
        Empleado e2 = new Empleado("Luisa");
        Empleado e3 = new Empleado("Martha");

        area1.agregarRol(e2);
        area2.agregarRol(e3);
        empresa.agregarRol(area1);
        empresa.agregarRol(area2);
        empresa.agregarRol(e1);

        //empresa.dameNombre();

        area1.dameNombre();

    }
}