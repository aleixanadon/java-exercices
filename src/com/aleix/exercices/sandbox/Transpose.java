package com.aleix.exercices.sandbox;

import java.util.Arrays;

public class Transpose {

    /**
     * swap loops order to transpose an array
     * I've learnt that you have to say to the int[][] the length
     * and that int[][] is static, cannot change the size inside
     */

    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2 },
            { 3, 4 },
            { 5, 6 },
        };
        
        int[][] transposed = new int[matrix[0].length][matrix.length];
        
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transposed));
    }
}
