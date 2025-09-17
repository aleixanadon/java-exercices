package com.aleix.exercices.basic;

import java.util.Scanner;

/**
 * Pide un número por consola y determina si es par o impar.
 */

class Exercice_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
