package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class adivina {
    /*
     * Adivina : genera un número aleatorio y pide al usuario
     * que adivine qué número es. Ofrece ayuda diciendo si el
     * número introducido es mayor o menor que el generado.
     * Al final, imprimir los pasos empleados.
     */
    static void pista(int a, int b) {
        if (a > b) {
            System.out.println("El número generado es mayor.");
        } else if (a < b) {
            System.out.println("El número generado es menor.");
        }
    }

    public static void main(String[] args) {
        // Variables
        int num = 0; // El número que introduce el usuario.
        int rnd = (int) (Math.random() * 100 + 1);
        int steps = 0;

        System.out.println("Para parar introduce un 0.\n");
        System.out.println("Número aleatorio [1-100] generado..." + rnd);

        // Lee lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduce un número: ");
            num = teclado.nextInt();
            steps++;
            System.out.println("No has adivinado el número.");
            System.out.println("Intentos: " + (steps - 1));
            pista(rnd, num);
            // Hasta que el usuario adivina el número o ha
            // hecho demasiados intentos.
        } while (num != rnd && steps < 10);
        teclado.close();

        if (num == rnd) {
            System.out.println("Has adivinado el número!");
            System.out.println("Intentos: " + steps);
            num = 0;
        } else if (steps >= 10) {
            System.out.println("Has superado el límite de pasos.");
            num = 0;
        }
    }
}