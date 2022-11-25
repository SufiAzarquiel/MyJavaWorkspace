package com.github.sufiazarquiel.myjavaworkspace.datastructures;

import java.util.Scanner;

public class correo {
    /*
     * Check if a string is a valid email adress
     * There is an @
     * Ends in .es or .com
     * before and after @symbol there are at least 3 chars
     * ----search @, length of substring (0, @) and (@, end)
     */

    // Método que hace la tarea que pide el ejercicio.
    public static boolean funcion(String input) {
        // Variables
        String correo = "";
        boolean valid = true;

        // Objeto para leer lo que teclea el usuario.
        try {
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce tu correo: ");
            correo = teclado.nextLine();
            System.out.print(correo + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Comprobar condiciones
        int arroba = correo.indexOf("@");
        if (arroba == -1 || !(correo.endsWith(".es") || correo.endsWith(".com"))) {
            valid = false;
        } else {
            String before = correo.substring(0, arroba);
            String after = correo.substring(arroba+1);
            if (before.length() <=3 || after.length() <= 4) {
                valid = false;
            }
        }

        // Imprimir resultado
        String res = valid ? "" : "no ";
        System.out.printf("Tu correo %ses valido.", res);

        // Valor final usado para el test unitario.
        return valid;
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Valores que simulan input del usuario.
        String input = "sufiazarquiel@outlook.com";

        // Ejecutar función del ejercicio.
        funcion(input);
    }
}
