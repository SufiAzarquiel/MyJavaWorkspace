package com.github.sufiazarquiel.myjavaworkspace.buclejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class bucles6 {
    /*
     * Ejercicio 5: Realizar un programa que calcule la potencia de un numero a n .
     * La potencia se
     * hará por medio de multiplicaciones, está prohibido usar Math.pow().
     * si n es mayor que cero se hará una potencia normal
     * si n es menor que cero se hará 1/(a^n)
     * y si n cero la solución será 1
     */

    // Variables
    static int a = 0; // La base de la potencia
    static int n = 0; // El exponente de la potencia
    static double result = 1; // El resultado de la potencia
    // Valores que simulan input del usuario.
    static String input = "3\n" + "-1\n";

    // Funcion principal
    public static double power() {
        // Comprueba que los datos introducidos son válidos.
        try {
            // Objeto para leer lo que teclea el usuario.
            Scanner teclado = new Scanner(input);
            System.out.print("Introduce una base: ");
            a = teclado.nextInt();
            System.out.print(a + "\n");
            System.out.print("Introduce un exponente: ");
            n = teclado.nextInt();
            System.out.print(n + "\n");
            teclado.close();
        } catch (Exception InputMismatchException) {
            // Si no se introduce un número entero cierra el programa.
            System.out.println("Valor introducido no corresponde con el tipo esperado.");
            System.exit(-1);
        }

        // Código principal.

        // Un bucle hasta n.

        if (n == 0) {
            result = 1;
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= a;
            }
        } else {
            for (int i = 0; i < (n*-1); i++) {
                result *= a;
            }
            result = (double) 1 / result;
        }

        // Imprime el resultado final
        System.out.printf("El resultado de a elevado a n es: %.2f", result);

        // Aproximar el resultado a dos decimales
        BigDecimal b = new BigDecimal(0);
        b = b.add(BigDecimal.valueOf(result).setScale(2, RoundingMode.FLOOR));
	    result = b.doubleValue();

        // Devuelve el valor del resultado para comprobar mediante test
        return result;
    }

    // Main
    public static void main(String[] args) {
        power();
    }
}
