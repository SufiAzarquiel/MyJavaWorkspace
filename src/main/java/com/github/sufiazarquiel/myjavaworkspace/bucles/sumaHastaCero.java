package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class sumaHastaCero {
	/*
	 * SumaHastaCero : bucle while que lee numeros y los suma hasta que
	 * el usuario introduce un 0.
	 */
	public static void main(String[] args) {
		// Variables
		int num = 1; // El número introducido
		int sum = 0;

		// Objeto para leer lo que teclea el usuario.
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Teclea un número: ");
			num = teclado.nextInt();
			sum += num;
			if (num == 0) {
				break;
			}
		} while (true);
		teclado.close();

		System.out.printf("La suma total es %d", sum);
	}
}
