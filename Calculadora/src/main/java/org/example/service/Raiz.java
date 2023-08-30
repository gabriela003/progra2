package org.example.service;

public class Raiz implements IOperableCientifica{

    @Override
    public double operar(int a) {
        return Math.sqrt(a);
    }
}
