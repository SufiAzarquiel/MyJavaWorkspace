package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles12 {
    /* Ejercicio 12: Programa que solitite un numero n y
     * luego muestre por pantalla la siguiente figura:
     *      Introduciendo: 
     *      Da como salida:
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int figuraNum(String input) {
        // Variables
        int num = 0; // El número introducido por el usuario

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            System.out.print(num + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        boolean maxReached = false;
        for (int j = 1; j <= num*2; j+=2) {
            for (int i = 0; i < j; i++) {
                if (i >= j/2) {
                    maxReached = true;
                }
                if (!maxReached) {
                    System.out.print(i+1 + " ");
                } else {
                    System.out.print(j-i + " ");
                }
            }
            System.out.println("");
            maxReached = false;
        }

        // Valor final usado para el test unitario.
        return -1;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Valores que simulan input del usuario.
        String input = "6\n";

        // Ejecutar función del ejercicio.
        figuraNum(input);
    }
}