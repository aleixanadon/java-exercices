package com.aleix.exercices.intermediate;

/**
 * Verifica si una palabra es un palíndromo (ejemplo: "oso", "ana", "reconocer").
 */

public class Exercice_7 {
    public static void main(String[] args) {
        String str = "reconocer";
        int strLength = str.length();
        int i = 0, j = strLength-1;
        boolean isPalindrome = true;
        while (i < strLength && j >= 0) {
            char ch_i = str.charAt(i);
            char ch_j = str.charAt(j);
            if (ch_i != ch_j) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPalindrome);
    }
}
