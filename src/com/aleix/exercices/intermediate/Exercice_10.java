package com.aleix.exercices.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ordenar un array
 * Dado un array de enteros, ordénalo de menor a mayor.
 */

public class Exercice_10 {

    // generate an array of random integers
    public static int[] createRandomIntegerArray(int arrayLen) {
        int[] list = new int[arrayLen];
        for (int i = 1; i < arrayLen; i++) {
            int randomInt = (int) (Math.random() * 100);
            list[i] = (randomInt);
        }
        return list;
    }

    // print array of integers
    // I could've used ArrayList instead to avoid Arrays.toString()
    public static void printIntegerArray(int[] list) {
        // print array of integers
        System.out.println(Arrays.toString(list));
    }

    // order array list with bubble sort algorithm
    public static int[] bubbleSort(int[] list) {
        // use the bubble sort algorithm to sort an array of integers
        // list.length -2 bc after the first round of swaps, the last element is placed at the end
        for (int j = 0; j < list.length - 2; j++) {
            for (int i = 0; i < list.length - 1; i++) {
                int actualNum = list[i];
                int nextNum = list[i + 1];
                if (actualNum > nextNum) {
                    list[i] = nextNum;
                    list[i+1] = actualNum;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] unorderedArr = createRandomIntegerArray(9);
        printIntegerArray(unorderedArr);
        int[] orderedArr = bubbleSort(unorderedArr);
        printIntegerArray(orderedArr);
    }
}
