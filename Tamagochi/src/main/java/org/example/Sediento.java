package org.example;

public class Sediento implements IEstado {
    private Tamagochi tamagochi;
    public Sediento(Tamagochi tama) {
        this.tamagochi = tama;
    }

    @Override
    public void tomar() {
        // TODO Auto-generated method stub
        this.tamagochi.setEstado(new Feliz(this.tamagochi));

    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mimar() {
        // TODO Auto-generated method stub

    }
}
