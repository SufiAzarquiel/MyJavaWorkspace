package com.github.sufiazarquiel.myjavaworkspace.datastructures;

public class strbuilder {
    /*
     * Probando velocidad de un String y StringBuilder
     */

    // Método que hace la tarea que pide el ejercicio.
    public static int speedTest() {
        // Variables
        String str = "";
        StringBuilder s = new StringBuilder();
        Long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str = str.concat("Lunes");
        }
        Long fin = System.currentTimeMillis();
        System.out.println("Tiempo de un String: " + (fin - inicio));

        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            s.append("Lunes");
        }
        fin = System.currentTimeMillis();
        System.out.println("Tiempo de un StringBuilder: " + (fin - inicio));

        int curr = 1;

        // Valor final usado para el test unitario.
        return curr;
    }

    public static void builder() {
        String s1 = "Hola";
        String s2 = "Hola";

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.printf("S: %s\nSb: %s\n", s1, sb1);

        if (s1.equals(s2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Not equal");
        }

        if (sb1.toString().equals(sb2.toString())) {
            System.out.println("Sbs are equal");
        } else {
            System.out.println("Not equal");
        }

        // String to StringBuilder
        StringBuilder sb3 = new StringBuilder(s1);
        // StringBuilder to string
        String s3 = sb1.toString();
        System.out.println(sb3 + s3);
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        builder();
    }
}
