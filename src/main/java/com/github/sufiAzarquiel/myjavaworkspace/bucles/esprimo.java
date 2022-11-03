package com.github.sufiazarquiel.myjavaworkspace.bucles;

import java.util.Scanner;

public class esprimo {
    /*
    * Ejercicio : descripción.
    */
    public static void main(String[] args) {
    // Variables
    int num = 0, i = 2; // Descripción opcional de variable
    boolean esPrimo = true;
    
    // Objeto para leer lo que teclea el usuario.
    try {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    num = teclado.nextInt();
    teclado.close();
    } catch (Exception InputMismatchException) {
    System.out.println("Valor introducido no corresponde con el tipo esperado.");
    System.exit(-1);
    }
    
    // Código principal.
    
    // Descripción de la tarea que realiza el siguiente bloque de código.
    if(num == 1){
        esPrimo = false;
    }
    while ( i < (int) (Math.sqrt(num)+1)) {
        if (num % i == 0) {
            esPrimo = false;
            break;
        }
        i++;
    }
    
    // Resultado final
    if (esPrimo) {
        System.out.println("El número es primo");
    } else {
        System.out.println("El número no es primo.");
    }
    }
}
