package com.github.sufiazarquiel.myjavaworkspace.examen;

import java.util.Scanner;

public class calvo {
    /*
     * Ejercicio : Realiza un programa que pida por teclado la edad del individuo
     * cuando comenzó a perder pelo, el porcentaje de pelo que pierde cada año, y
     * calcule a qué edad estará calvo.
     */

    // Método que hace la tarea que pide el ejercicio.
    public static void funcion() {
        // Variables
        int edad = 0; // Edad del individuo
        double perdida = 0; // Porcentaje de pérdida de cabello
        double pelo = 100; // Porcentaje de pelo restante cada año

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("¿A qué edad comenzó la pérdida de cabello?: ");
            edad = teclado.nextInt();
            System.out.print("Porcentaje de pérdida de cabello (%): ");
            perdida = teclado.nextInt();
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Un bucle hasta n.
        while (pelo > 5) {
            pelo -= pelo * (perdida/100);
            edad += 1;
        }

        System.out.printf("Te quedarás calvo a los %d años", edad);
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        funcion();
    }
}
