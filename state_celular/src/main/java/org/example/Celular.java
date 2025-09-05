package org.example;

import org.example.state.Apagado;
import org.example.state.Estado;

public class Celular {
    private String numeroTelefono;
    private Estado estado;

    public Celular(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.estado = new Apagado(); // Estado inicial
    }

    // Getters y Setters
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    // Métodos de acción
    public void presionarBoton() {
        System.out.println("Presionando botón...");
        estado.accionar(this);
    }

    public void mostrarEstado() {
        System.out.println("Estado actual: " + estado.getClass().getSimpleName());
        System.out.println("Número: " + numeroTelefono);
        System.out.println("---");
    }
}
