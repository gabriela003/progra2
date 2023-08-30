package org.example.service;

public class Factorial implements IOperableCientifica{
    @Override
    public double operar(int a) {
        double res =1;
        for (int i = 1; i <= a; i++) {
            res*=i;
        }
        return res;
    }
}
