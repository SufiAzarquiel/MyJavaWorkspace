package com.github.sufiAzarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class cifras {
    /*
	 * Cifras : pedir un número y decir cuántas cifras tiene.
	 */

	public static void main(String[] args) {
		// Variables
		int num = 0;
        int cifras = 0; // Descripción opcional de variable

		// Objeto para leer lo que teclea el usuario.
		try {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce un número entero: ");
			num = teclado.nextInt();
			teclado.close();
		} catch (Exception InputMismatchException) {
			System.out.println("Valor introducido no corresponde con el tipo esperado.");
			System.exit(-1);
		}

		// Código principal.

		// Divide el número entre 10 hasta que no se pueda dividir más con resultado > 1.
		while(num>0) {
            num /= 10;
            // Cada vez que se hace la división contamos una cifra más.
            cifras++;
        }

		// Resultado final
		System.out.println("Resultado: " + cifras);
	}
}
