package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class sumaSinNeg {
    /*
     * SumaSinNeg : bucle while que lee numeros y los suma hasta que
     * el usuario introduce un 0.
     * Si el usuario introduce un número negativo no lo sumamos.
     */
    public static void main(String[] args) {
        // Variables
        int num = 1; // El número introducido
        int sum = 0;

        // Números para testear el programa
        String input = "1\n" + "2\n" +
                "3\n" + "-5\n" +
                "-4\n" + "0\n" +
                "1\n";

        // Objeto para leer lo que teclea el usuario
        Scanner teclado = new Scanner(input);
        do {
            num = teclado.nextInt();
            System.out.println("Teclea un número: " + num);
            if (num < 0) {
                continue;
            }
            sum += num;
        } while (num != 0);
        teclado.close();

        System.out.printf("La suma total es %d", sum);
    }
}
