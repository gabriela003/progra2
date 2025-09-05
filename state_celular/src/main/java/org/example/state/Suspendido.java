package org.example.state;

import org.example.Celular;

public class Suspendido  implements Estado{
    @Override
    public void accionar(Celular c) {
        // Cuando está suspendido y se presiona el botón, se enciende
        System.out.println("Transición: Suspendido → Encendido");
        c.setEstado(new Encendido());
    }
}
