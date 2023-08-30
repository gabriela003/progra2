package org.example;

import java.util.EmptyStackException;

public class Tamagochi {
    private IEstado estado;


    public void tomar(){
        this.estado.tomar();
       // this.setEstado(estado.tomar());
    }

    public void comer(){
        this.estado.comer();

    }

    public void mimar(){
        this.estado.mimar();

    }

    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }


}
