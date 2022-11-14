package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class posneg {
    /*
     * Ejercicio : Un programa que pide números e imprime de manera cumulativa
     * las cantidades positivas y las negativas por separado.
     * Para de pedir números cuando las sumas sean iguales.
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int posnegF() {
        // Variables
        int num = 0; // El número introducido por el usuario
        int pos = 0;
        int neg = 0;

        // Lee lo que teclea el usuario.
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("\nIntroduce un número: ");
            num = teclado.nextInt();
            if (num > 0) {
                pos += num;
            } else {
                neg += num;
            }
            System.out.printf("Positivos: %d Negativos: %d", pos, neg);
            i++;
        } while (pos != Math.abs(neg) || i < 5);
        teclado.close();

        // Valor final usado para el test unitario.
        return pos;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        posnegF();
    }
}
