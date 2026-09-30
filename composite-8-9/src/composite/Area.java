package composite;

import java.util.ArrayList;
import java.util.List;

public class Area implements INombrable{
    private String nombre;
    private List<INombrable> rol;

    public Area(String nombre) {
        this.nombre = nombre;
        this.rol = new ArrayList<INombrable>();
    }

    public void agregarRol(INombrable nombrable) {
        this.rol.add(nombrable);
    }


    @Override
    public void dameNombre() {
        for(INombrable nombrable : rol) {
            nombrable.dameNombre();
        }

    }
}
