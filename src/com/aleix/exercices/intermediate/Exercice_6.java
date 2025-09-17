package com.aleix.exercices.intermediate;

import java.util.Scanner;

/**
 * Pide una palabra y muestra su versión invertida (ejemplo: "java" → "avaj").
 */

public class Exercice_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length()-1;
        String reversed = "";
        for  (int i = strLength; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed += ch;
        }
        System.out.println(reversed);
    }
}
