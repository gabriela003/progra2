package org.example;

public class Feliz implements IEstado{
    private Tamagochi tamagochi;
    String estado;
    public Feliz(Tamagochi tama) {
        this.tamagochi = tama;
        this.estado="Estoy Feliz";
    }

    @Override
    public void tomar() {
        // TODO Auto-generated method stub
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");

    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mimar() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return this.estado;
    }
}
