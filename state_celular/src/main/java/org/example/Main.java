package org.example;

import org.example.state.Apagado;
import org.example.state.Encendido;

public class Main {
    public static void main(String[] args) {

        // Crear un celular
        Celular miCelular = new Celular("555-1234");

        System.out.println("=== DEMO DEL SISTEMA DE TELÉFONO ===\n");

        // Estado inicial
        miCelular.mostrarEstado();

        // Presionar botón cuando está apagado (debería encender)
        miCelular.presionarBoton();
        miCelular.mostrarEstado();

        // Presionar botón cuando está encendido (debería suspender)
        miCelular.presionarBoton();
        miCelular.mostrarEstado();

        // Presionar botón cuando está suspendido (debería encender)
        miCelular.presionarBoton();
        miCelular.mostrarEstado();

        // Apagar manualmente
        System.out.println("\n--- Cambiando a estado apagado manualmente ---");
        miCelular.setEstado(new Apagado());
        miCelular.mostrarEstado();

        // Encender manualmente
        System.out.println("--- Cambiando a estado encendido manualmente ---");
        miCelular.setEstado(new Encendido());
        miCelular.mostrarEstado();
    }
}