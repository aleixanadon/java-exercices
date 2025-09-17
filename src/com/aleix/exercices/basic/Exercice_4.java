package com.aleix.exercices.basic;

import java.util.Scanner;

/**
 * Dado un número n, imprime su tabla de multiplicar del 1 al 10.
 */

public class Exercice_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int length = 10;
        for (int i = 1; i <= length; i++) {
          System.out.println(number*i);
        }
    }
}
