package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles3 {
    /*
     * Ejercicio 3: Programa que solitite un numero n y luego muestre por pantalla
     * la siguiente figura:
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * ………….
     * 1 2 3 4 5 …..n
     */

    public static void main(String[] args) {
        // Variables
        int num = 0, newVar = 1;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Un bucle for anidado dentro de otro.
        for (int i = 0; i < num+1; i++) {
            for (int j = 1; j < newVar; j++) {
                System.out.print(j + " ");
            }
            newVar++;
            System.out.println("");
        }
    }
}
