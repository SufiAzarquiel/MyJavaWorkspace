package com.github.sufiAzarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class hastacero {
    /*
	 * HastaCero : bucle while que lee numeros hasta que
     * el usuario introduce un 0.
	 */
	public static void main(String[] args) {
		// Variables
		int var = 1; // Descripción opcional de variable

		// Objeto para leer lo que teclea el usuario.
		Scanner teclado = new Scanner(System.in);
		while(var != 0) {
			System.out.print("Teclea un 0: ");
			var = teclado.nextInt();
		}
		teclado.close();
	}
}
