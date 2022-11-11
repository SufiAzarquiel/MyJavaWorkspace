package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles9 {
    /*
     * Ejercicio 9: Programa que lea un número entero positivo y
     * lo transforme a su representación binaria.
     */

    // Método que hace la tarea que pide el ejercicio.
    public static String decToBin(String input) {
        // Variables
        int num = 0; // El número introducido por el usuario
        String binario = ""; // La representación del número en binario

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

        // Un bucle hasta llegar a coeficiente uno.
        do {
            binario = num % 2 + binario;
            num /= 2;
        } while (num >= 1);

        System.out.println(binario);
        // Valor final usado para el test unitario.
        return binario;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Valores que simulan input del usuario.
        String input = "18\n";

        // Ejecutar función del ejercicio.
        decToBin(input);
    }
}
