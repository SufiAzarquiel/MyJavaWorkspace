package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles4 {
    /*
     * Ejercicio 4: Programa que lea números hasta que se teclee un número negativo
     * y después
     * indique si se ha dado el mismo número dos veces consecutivas:
     * Introduciendo: 1 3 5 3 4 6 7 –1
     * Da como salida: No
     * Introduciendo: 1 3 5 6 6 4 3 –1
     * Da como salida : Si
     */

    public static void main(String[] args) {
        // Variables
        int num = 0, prev = 0; // El número escaneado en una iteración cualquiera y el anterior a ese
        boolean found = false;

        // Números para testear el programa
        /*
         * String input1 = "1\n" + "3\n" +
         * "5\n" + "3\n" +
         * "4\n" + "6\n" +
         * "7\n" + "-1\n";
         */
        String input2 = "1\n" +
                "3\n" +
                "5\n" +
                "6\n" +
                "6\n" +
                "4\n" +
                "3\n" +
                "-1\n";

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input2);
            do {
                System.out.print("Introduce un número: ");
                prev = num;
                num = teclado.nextInt();
                System.out.print(num + "\n");
                if (num == prev && !found) {
                    found = true;
                }
            } while (num > 0);
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Resultado
        if (found) {
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }
}
