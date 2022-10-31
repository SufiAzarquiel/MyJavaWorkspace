package com.github.sufiAzarquiel.myjavaworkspace;

/**
 * Main class for my workspace repository.
 */
public class hello {

    public static final String WRKSPC_STRING = "my-java-workspace";

    public static void main(String[] args) {
        System.out.printf("Hello world, %s!%n", WRKSPC_STRING);
    }

}

/*
 * Template for course exercises.
package controlStructures;

import java.util.Scanner;

public class EjercicioTemplate {
	/*
	 * Ejercicio : descripción.
	 *
	public static void main(String[] args) {
		// Variables
		int var = 0, newVar = 0; // Descripción opcional de variable

		// Objeto para leer lo que teclea el usuario.
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Prompt: ");
			var = teclado.nextInt();
			teclado.close();
		} catch (Exception InputMismatchException) {
			System.out.println("Valor introducido no corresponde con el tipo esperado.");
			System.exit(-1);
		}

		// Código principal.

		// Descripción de la tarea que realiza el siguiente bloque de código.
		

		// Resultado final
		System.out.println("Resultado: " + var + newVar);
	}
}
 */