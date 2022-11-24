package com.github.sufiazarquiel.myjavaworkspace.examen;

import java.util.Scanner;

public class cifrasordenadas {
    /*
     * Ejercicio n: Descripcion
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int funcion(String input) {
        // Variables
        int num = 0; // El número introducido por el usuario
        int n = 0; // Variable usada en el bucle
        int cifra = 0; // Cada cifra del numero introducido
        boolean ordenado = true; // Verdadero si el numero resulta estar en orden ascendente

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            n = num; // n empieza siendo igual al número introducido
            cifra = n % 10; // Empezamos por la primera cifra, que sera el resto del número entre 10
            System.out.print(num + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Un bucle hasta la última cifra.
        do {
            int prev = cifra;
            cifra = n % 10;
            n /= 10;
            if (prev < cifra) {
                System.out.printf("El numero %d no tiene las cifras ordenadas.\n", num);
                ordenado = false;
                break;
            }
        } while (cifra > 1);
        if (ordenado) {
            System.out.printf("El numero %d tiene todas sus cifras ordenadas ascendentemente.\n", num);
        }
        // Valor final usado para el test unitario.
        return cifra;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Valores que simulan input del usuario.
        String input = "2456\n" + "-1\n";

        // Ejecutar función del ejercicio.
        funcion(input);

        input = "4637\n" + "-1\n";
        funcion(input);
    }
}