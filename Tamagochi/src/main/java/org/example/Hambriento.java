package org.example;

public class Hambriento implements IEstado{
    private Tamagochi tamagochi;
    public Hambriento(Tamagochi tama) {
        this.tamagochi = tama;
    }

    @Override
    public void tomar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        this.tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void mimar() {
        // TODO Auto-generated method stub

    }
}
