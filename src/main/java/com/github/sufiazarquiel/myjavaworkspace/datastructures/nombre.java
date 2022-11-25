package com.github.sufiazarquiel.myjavaworkspace.datastructures;

import java.util.Scanner;

public class nombre {
    /*
     * Ejercicio n: Descripcion
     */

    // Método que hace la tarea que pide el ejercicio.
    public static void funcion() {
        // Variables
        String fullName = ""; // El número introducido por el usuario
        String name, surnameOne, surnameTwo;
        int firstSpace, secondSpace;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Introduce tu nombre completo: ");
            fullName = teclado.nextLine();
            System.out.print(fullName + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Search for spaces in input line
        firstSpace = fullName.indexOf(' ');
        secondSpace = fullName.lastIndexOf(' ');

        if (firstSpace == -1) { // No space found
            System.out.println("Espacios no encontrados en tu nombre.");

        } else if (firstSpace == secondSpace) { // Only one space found
            // Cut string
            name = fullName.substring(0, firstSpace);
            surnameOne = fullName.substring(firstSpace + 1);

            // Print string
            System.out.printf("Nombre: %s\n", name);
            System.out.printf("Primer apellido: %s\n", surnameOne);

        } else {
            // Cut string
            name = fullName.substring(0, firstSpace);
            surnameOne = fullName.substring(firstSpace + 1, secondSpace);
            surnameTwo = fullName.substring(secondSpace + 1);

            // Print string
            System.out.printf("Nombre: %s\n", name);
            System.out.printf("Primer apellido: %s\n", surnameOne);
            System.out.printf("Segundo apellido: %s\n", surnameTwo);
        }
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        funcion();
    }

}
