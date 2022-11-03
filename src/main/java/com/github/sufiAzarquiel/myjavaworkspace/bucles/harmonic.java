package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class harmonic {
    /*
     * Harmonic : Pide un número y calcula [Sumatorio n=1 (1/n)] hasta obtener el
     * número introducido
     */

    public static void main(String[] args) {
        // Variables
        int num = 0; // El número que introduce el usuario.
        double total = 0;
        double i = 0;

        // Lee lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = teclado.nextInt();
        teclado.close();

        do {
            i++;
            total += (1 / i);
        } while (total < num);

        System.out.printf("Número encontrado: %.3f\nEn n = %d", total, (int) i);
    }
}
