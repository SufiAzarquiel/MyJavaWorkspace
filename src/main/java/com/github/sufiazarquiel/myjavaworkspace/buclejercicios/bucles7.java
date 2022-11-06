package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.util.Scanner;

public class bucles7 {
    /*
     * Ejercicio 7: Realizar un programa que lea varios números por teclado hasta
     * que se introduzca
     * un cero, y entonces diga cuál es el mayor de los números introducidos y
     * cuantas
     * veces se repite ese número.
     * Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
     * Da como salida: El mayor es el 7
     * Se repite 2 veces
     */

    // Variables
    static int num = 0; // El número introducido por el usuario
    static int mayor = 1; // El mayor valor introducido que se actualizará durantne el bucle
    static int suma = 0; // Contador para saber cuántas veces aparece el mayor número
    // Valores que simulan input del usuario.
    static String input = "1\n" + "3\n" + "5\n" + "5\n" + "4\n" + "6\n" +
            "6\n" + "7\n" + "1\n" + "4\n" + "7\n"+ "2\n" + "0\n";

    // Método que hace la tarea que pide el ejercicio.
    public static int cuentaElMayor() {
        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            do {
                System.out.print("Introduce un número: ");
                num = teclado.nextInt();
                System.out.print(num + "\n");
                if (num > mayor) {
                    mayor = num;
                    suma = 1;
                } else if (num == mayor) {
                    suma++;
                }
            } while (num != 0);
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.
        System.out.printf("El mayor número es el: %d.\n", mayor);
        System.out.printf("Se repite %d vez/veces.\n", suma);

        // Valor final usado para el test unitario.
        return mayor;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        cuentaElMayor();
    }
}
