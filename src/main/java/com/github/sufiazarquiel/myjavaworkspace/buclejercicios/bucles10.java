package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

public class bucles10 {
    /*
     * Ejercicio 10: Calcular todos los números de tres cifras tales que
     * la suma de los cubos de las cifras es igual al valor del número.
     * (Dado el 153 entonces 1³+5³+3³=153).
     * Da como salida: 153 370 371 407
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int sumacubos() {
        // Variables
        int num = 100; // El número introducido por el usuario

        // Código principal.

        // Mientras que n tiene tres cifras.
        do {
            // Separar el número en sus cifras.
            int cent = num / 100;
            int resto = num % 100;
            int dec = resto / 10;
            int uni = resto % 10;

            // Si la suma de cada cifra al cubo es igual al número, imprimelo.
            if (Math.pow(cent, 3) +
                    Math.pow(dec, 3) +
                    Math.pow(uni, 3) == num) {
                System.out.print(num + " ");
            }

            // Comprueba el siguiente número.
            num++;
        } while (num < 1000);

        // Valor final usado para el test unitario.
        return -1;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        sumacubos();
    }
}
