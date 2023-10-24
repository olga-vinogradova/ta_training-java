package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Arrays;

public class MultiplyMatrix {
        public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
            int rows1 = matrix1.length;
            int columns1 = matrix1[0].length;
            int columns2 = matrix2[0].length;

            int[][] result = new int[rows1][columns2];

            for (int i = 0; i < rows1; i++){
                for (int j = 0; j< columns2; j++){
                    for (int k = 0; k < columns1; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }return result;
        }

        public static void main(String[] args) {

            System.out.println("Test your code here!\n");


            int[][] a = {
                    {0, 12345},
                    {4509, 0},
                    {3, 567} };

            int[][] b = {
                    {653, 0, 25353},
                    {0, 61, 6} };

            int[][] result = multiply(a, b);
            System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
        }
    }


