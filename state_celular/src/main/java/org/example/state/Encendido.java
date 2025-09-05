package org.example.state;

import org.example.Celular;

public class Encendido implements Estado {

    @Override
    public void accionar(Celular c) {
        // Cuando está encendido y se presiona el botón, se suspende
        System.out.println("Transición: Encendido → Suspendido");
        c.setEstado(new Suspendido());
    }
}
