package com.aleix.exercices.intermediate;

import java.util.Arrays;

/**
 * Matriz transpuesta
 * Dada una matriz n x m, imprimir su transpuesta.
 */

class Matrix {
    int n, m;
    public int[][] matrix;
    public int[][] transposedMatrix;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[n][m];
        this.transposedMatrix = new int[m][n];
        createRandomIntegerArray();
        transpose();
    }

    public void createRandomIntegerArray() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int randomInt = (int) (Math.random() * 100);
                matrix[i][j] = randomInt;
            }
        }
    }

    public void transpose() {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
    }

    public void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Exercice_11 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        matrix.printMatrix(matrix.matrix);
        matrix.printMatrix(matrix.transposedMatrix);
    }
}
