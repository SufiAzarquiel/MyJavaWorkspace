package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles8 {
    /*
     * Ejercicio 8: Programa que descomponga un número en sus factores primos.
     * Introduciendo: 75
     * Da como salida : 3 5 5
     */

    // Variables
    static int num = 0; // El número introducido por el usuario
    static int factor = 1; // Los posibles factores de n
    // Valores que simulan input del usuario.
    static String input = "75\n";

    // Método que comprueba si un número positivo es primo
    public static boolean esPrimo(int a) {
        if (a == 0 || a == 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que hace la tarea que pide el ejercicio.
    public static int factores() {
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
        System.out.print("Factores primos: ");
        // Comprobamos todos los factores posibles desde el número introducido hasta 1
        // (exclusive)
        do {
            if (esPrimo(factor)) {
                while (num % factor == 0) {
                    num /= factor;
                    System.out.printf("%d ", factor);
                }
            }
            factor++;
        } while (factor < num);

        // Valor final usado para el test unitario.
        return -1;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        factores();
    }
}
