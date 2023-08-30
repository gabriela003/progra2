package org.example;

public class Main {
    public static void main(String[] args) {
        Tamagochi tama = new Tamagochi();
        System.out.println(tama.getEstado());
        tama.setEstado(new Feliz(tama));
        System.out.println(tama.getEstado().toString());
        tama.comer();
        tama.tomar();
    }
}