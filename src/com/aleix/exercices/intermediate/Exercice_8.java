package com.aleix.exercices.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cuenta cuántas vocales hay en una cadena de texto.
 */

public class Exercice_8 {
    public static void main(String[] args) {
        /**
         * This seems like C programming
         */
        String[] vowels = {"a", "e", "i", "o", "u"};
        String str = "java is like kotlin";
        int strLength = str.length();
        int vowelsLength = vowels.length;
        int vowelsCount = 0;
        for  (int i = 0; i <= strLength-1; i++) {
            char strChar = str.charAt(i);
            for (int j = i; j <= vowelsLength; j++) {
                char vowelsChar = str.charAt(j);
                if (vowelsChar == strChar) {
                    vowelsCount++;
                }
            }
        }
        System.out.println("num of vowels: " + vowelsCount);
    }
}
