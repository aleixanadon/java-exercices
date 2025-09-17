package com.aleix.exercices.basic;

import java.util.Scanner;

/**
 * Lee dos números enteros e imprime cuál es el mayor (o si son iguales).
 */

public class Exercice_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num_1 = scan.nextInt();
        int num_2 = scan.nextInt();
        if (num_1 > num_2) {
            System.out.println(num_1 + " is bigger than " + num_2);
        } else if (num_2 > num_1) {
            System.out.println(num_2 + " is bigger than " + num_1);
        } else {
            System.out.println(num_1 + " is equal to " + num_2);
        }
    }
}
