package com.builder.demo;

import lombok.ToString;

@ToString
public class Usuario {
    private final String nombre;
    private String apellido;
    private int edad;
    private int numeroDepartamento;
    private String apodo;
    private String comidaFavorita;

    private Usuario(BuilderUsuario builderUsuario) {
        this.nombre = builderUsuario.nombre;
        this.apellido = builderUsuario.apellido;
        this.edad = builderUsuario.edad;
        this.numeroDepartamento = builderUsuario.numeroDepartamento;
        this.apodo = builderUsuario.apodo;
        this.comidaFavorita = builderUsuario.comidaFavorita;
    }

    private Usuario(String nombre) {
        this.nombre = nombre;
    }

    public static class BuilderUsuario {
        private final String nombre;
        private String apellido;
        private int edad;
        private int numeroDepartamento;
        private String apodo;
        private String comidaFavorita;


        public BuilderUsuario(String nombre) {
            this.nombre = nombre;
        }

        public BuilderUsuario apellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public BuilderUsuario edad(int edad) {
            this.edad = edad;
            return this;
        }

        public BuilderUsuario numeroDepartamento(int numeroDepartamento) {
            this.numeroDepartamento = numeroDepartamento;
            return this;
        }

        public BuilderUsuario apodo(String apodo) {
            this.apodo = apodo;
            return this;
        }

        public BuilderUsuario comidaFavorita(String comidaFavorita) {
            this.comidaFavorita = comidaFavorita;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", numeroDepartamento=" + numeroDepartamento +
                ", apodo='" + apodo + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                '}';
    }
}
