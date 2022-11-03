package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles1 {
    /*
     * Ejercicio 1: Programa que lea números hasta que se den cinco ceros y escriba
     * después la
     * suma de los números leídos.
     */

    public static void main(String[] args) {
        // Variables
        int num = 0, total = 0, found = 0;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduce un número: ");
            do {
                num = teclado.nextInt();
                if (num == 0) {
                    System.out.printf("Found %d cero(s).\n", ++found);
                }
                total += num;
                if (found < 5) {
                    System.out.print("Introduce un número: ");
                }
            } while (found < 5);
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }
        
        // Resultado final
        System.out.printf("Total is %d.", total);
    }
}
