package com.builder.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario.BuilderUsuario("Juan").build();

		Usuario usuario2 = new Usuario.BuilderUsuario("Maria")
				.apellido("Martinez")
				.apodo("Marita")
				.edad(35)
				.build();

		System.out.println(usuario1.toString());
		System.out.println(usuario2.toString());



	}

}
