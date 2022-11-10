package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

public class bucles11 {
    /*
     * Ejercicio 11: Programa que visualice en la pantalla la siguiente figura:
        *
      * * *
    * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
     */

    // Método que hace la tarea que pide el ejercicio.
    public static void figura() {
        // Variables
        int n = 1;
        boolean maxReached = false;

        // Código principal. 6 4 2 0 2 4 6

        // Cada fila de la figura.
        for (int i = 0; i < 7; i++) {
            // Dibujar los espacios de cada fila
            for (int j = 0; j < 7-n; j++) {
                System.out.print(" ");
            }
            // Dibujar la fila
            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            // Cambiar de fila
            System.out.println("");

            // Hemos alcanzado la maxima longitud posible?
            if (n == 7) {
                maxReached = true;
            }
            
            // Si ya la hemos alcanzado, empezar a disminuir el tamaño de las filas
            if (maxReached) {
                n -= 2;
            } else {
                n += 2;
            }
        }
    }

    // Ejecuta el método principal de la clase.
    public static void main(String[] args) {
        // Ejecutar función del ejercicio.
        figura();
    }
}

