package com.aleix.exercices.basic;

import java.util.Scanner;

/**
 * Pide un número N y calcula la suma de todos los enteros desde 1 hasta N.
 */

public class Exercice_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= number; i++) {
            total += i;
        }
        System.out.println("The total number is: " + total);
    }
}
