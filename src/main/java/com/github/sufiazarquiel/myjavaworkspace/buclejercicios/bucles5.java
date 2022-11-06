package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles5 {
    /*
     * Ejercicio 5: Programa que escriba los n primeros numeros de la sucesion de Fibonacci. El
     * primer numero de la serie es 0, el segundo es 1 y cada uno de los siguientes es la
     * suma de los dos anteriores a el.
     * Introduciendo:10
     * Da como salida: 0 1 1 2 3 5 8 13 21 34
     */
    
    // Variables
    static int num = 0; // El número introducido por el usuario
    static int prev = 0; // El valor de curr un paso antes en el bucle
    static int prev2 = 0; // El valor de curr dos pasos antes en el bucle
    static int curr = 1; // El número que se usará en el bucle

    public static int fibonacci() {
        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner("10\n");
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            System.out.print(num + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        System.out.print("0 ");
        // Un bucle hasta n.
        for (int i = 0; i < num-1; i++) {
            curr += prev2;
            System.out.printf("%d ", curr);
            prev2 = prev;
            prev = curr;
        }

        return curr;
    }
    
    public static void main(String[] args) {
        fibonacci();
    }
}

