package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles13 {
    /*
     * Ejercicio 13: Programa que obtenga el minimo comun multiplo(mcm) de dos
     * numeros.
     * Ejemplo: descomponemos los numeros en sus factores 10 (2 * 5) y 18 (2 * 9)
     * entonces el mcm es (2 * 5 * 9).
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int mcm(String input) {
        // Variables
        int a = 0, b = 0; // El número introducido por el usuario
        int varMcm = 1; // El número que se usará en el bucle

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce un número: ");
            a = teclado.nextInt();
            System.out.print(a + "\n");
            System.out.print("Introduce un número: ");
            b = teclado.nextInt();
            System.out.print(b + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // El mcm empieza siendo el menor de a y b
        int min = (a < b) ? a : b;
        int i = 0;
        while(true) {
            if (varMcm % a == 0 && varMcm % b == 0) {
                System.out.println(varMcm);
                break;
            }
            i++;
            varMcm = min * i;
        }

        // Valor final usado para el test unitario.
        return varMcm;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Valores que simulan input del usuario.
        String input = "10\n" + "18\n";

        // Ejecutar función del ejercicio.
        mcm(input);
    }
}
