package org.example.entidades;

import org.example.service.IOperable;
import org.example.service.IOperableCientifica;

public class CalculadoraCientifica {

    public double calcular(IOperable operacion, int a, int b){
        return operacion.operar(a,b);
    }
    public double calcularCient(IOperableCientifica operacion, int a){
        return operacion.operar(a);
    }
}
