package com.github.sufiAzarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class operaWhile {
	/*
	 * HastaCero : bucle while que lee numeros y los agrega a un total hasta que
	 * el usuario introduce un 0.
	 */
	public static void main(String[] args) {
		// Variables
		double num = 1; // El número que introduce el usuario.
		double total = 0;
		double avg = 0;
		int countNum = -1;

		System.out.println("Para parar la suma introduce un 0.");

		// Objeto para leer lo que teclea el usuario.
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Introduce un número: ");
			num = teclado.nextInt();
			total += num;
			countNum++;
		} while (num != 0);
		teclado.close();

		avg = total / (countNum);

		System.out.printf("La suma total es: %.2f.\n", total);
		System.out.printf("La media es: %.2f.", avg);
	}
}
