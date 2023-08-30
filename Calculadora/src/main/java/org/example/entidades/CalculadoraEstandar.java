package org.example.entidades;

import org.example.service.IOperable;

public class CalculadoraEstandar {
    public double calcular(IOperable operable, int a, int b){

        return operable.operar(a,b);
    }
}
