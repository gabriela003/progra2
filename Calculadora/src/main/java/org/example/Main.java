package org.example;

import org.example.entidades.CalculadoraCientifica;
import org.example.entidades.CalculadoraEstandar;
import org.example.service.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        IOperable suma = new Suma();
        CalculadoraEstandar calcu = new CalculadoraEstandar();
        double result1= calcu.calcular(suma,3,4);
        System.out.println("resultado de IOperable suma= "+ result1);

        IOperable resta = new Resta();
        double result2 = calcu.calcular(resta, 8,2);
        System.out.println("resultado de IOperable resta= "+ result2);

        IOperable mult = new Multiplicacion();
        double result3= calcu.calcular(mult,3,2);
        System.out.println("resultado de IOperable multiplicar" + result3);

        IOperable division = new Dividir();
        double result4 = calcu.calcular(division,7,2);
        System.out.println("resultado de IOperable dividir: "+ result4);

        //-------------- implementacion de CalcCientifica-------------------

        IOperableCientifica fact = new Factorial();
        CalculadoraCientifica calcCient = new CalculadoraCientifica();

        double resFac = calcCient.calcularCient(fact, 3);
        System.out.println("resultado factorial = "+ resFac);
        double resultadoSuma = calcCient.calcular(suma,10,2);
        System.out.println("Cientifica usando un metodo ioperable estandar:"+ resultadoSuma);

        IOperableCientifica raiz = new Raiz();
        double resultadoRaiz = calcCient.calcularCient(raiz,9);
        System.out.println("resultado raiz de 9= "+resultadoRaiz);



    }

}