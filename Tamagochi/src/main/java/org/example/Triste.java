package org.example;

public class Triste implements IEstado {
    private Tamagochi tamagochi;
    public Triste(Tamagochi tama) {
        this.tamagochi = tama;
    }

    @Override
    public void tomar() {
        // TODO Auto-generated method stub
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");

        System.out.println("Se tildo");

    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Vomitando");
    }

    @Override
    public void mimar() {
        // TODO Auto-generated method stub
        this.tamagochi.setEstado(new Feliz(this.tamagochi));

    }

}
