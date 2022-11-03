package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles2 {
    /*
     * Ejercicio 2: Programa que lea 5 números y diga cuántos son múltiplos de 3,
     * cuántos
     * múltiplos de 5 y cuántos no están incluidos en ninguno de los grupos
     * anteriores.
     */

    public static void main(String[] args) {
        // Variables
        int num = 0;
        int mult3 = 0; // Multiplos de 3
        int mult5 = 0;
        int notMult = 0; // No múltiplo ni de 3 ni de 5

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduce un número: ");
                num = teclado.nextInt();
                if (num % 3 == 0) {
                    mult3++;
                }
                if (num % 5 == 0) {
                    mult5++;
                }
                if (num % 3 != 0 && num % 5 != 0) {
                    notMult++;
                }
            }
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Resultado final
        System.out.printf("%d múltiplo(s) de 3\n%d múltiplo(s) de 5\n%d no es/son múltiplo(s) de nada.",
                mult3, mult5, notMult);
    }
}
