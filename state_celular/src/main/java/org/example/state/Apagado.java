package org.example.state;

import org.example.Celular;

public class Apagado implements Estado {

    public Apagado() {
    }


    @Override
    public void accionar(Celular c) {
    // Cuando está apagado y se presiona el botón, se enciende
        System.out.println("Transición: Apagado → Encendido");
        c.setEstado(new Encendido());
        
    }
}
