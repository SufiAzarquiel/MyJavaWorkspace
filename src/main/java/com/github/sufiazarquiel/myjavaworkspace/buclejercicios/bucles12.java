package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles12 {
    /*
     * Ejercicio 12: Programa que solitite un numero n y
     * luego muestre por pantalla la siguiente figura:
     * Introduciendo:
     * Da como salida:
     *           1
     *         1 2 1
     *       1 2 3 2 1
     *     1 2 3 4 3 2 1
     *   1 2 3 4 5 4 3 2 1
     * 1 2 3 4 5 6 5 4 3 2 1
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int figuraNum(String input) {
        // Variables
        // El número introducido por el usuario, representa la cantidad de filas
        int num = 0;

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
        // fila_actual representa el número maximo de cada fila

        // Bucle para dibujar todas las filas
        for (int i = 0; i <= num; i++) {
            // Imprimimos los espacios correspondientes a cada fila
            for (int j = (num - i) * 2; j > 0; j--) {
                System.out.printf(" ");
            }

            // Cada fila imprimimos números hasta llegar a fila_actual
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }

            // Despúes, imprimimos desde [fila_actual - 1] hasta 1
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            // Cambiar de fila
            System.out.println("");
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