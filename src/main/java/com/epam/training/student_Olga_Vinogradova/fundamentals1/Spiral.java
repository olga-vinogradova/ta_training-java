package com.epam.training.student_Olga_Vinogradova.fundamentals1;

public class Spiral {
    public static void main(String[] args) {
    int[][] spiral = Spiral.spiral(3, 4);

for (int i = 0; i < spiral.length; i++) {
    for (int j = 0; j < spiral[i].length; j++) {
        System.out.print(String.format("%4s", spiral[i][j]));
    }
    System.out.println();
} }

    private static int[][] spiral(int rows, int columns) {
        int [][] result = new int [rows][columns];
        int num = 1;
        int topRow = 0, bottomRow = rows - 1;
        int leftColumn = 0, rightColumn = columns - 1;

        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            for (int i = leftColumn; i <= rightColumn; i++) {
                result[topRow][i] = num++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                result[i][rightColumn] = num++;
            }
            rightColumn--;

            if (topRow <= bottomRow) {
                for (int i = rightColumn; i >= leftColumn; i--) {
                    result[bottomRow][i] = num++;
                }
                bottomRow--;
            }

            if (leftColumn <= rightColumn) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result[i][leftColumn] = num++;
                }
                leftColumn++;
            }
        }

        return result;
    }

    }

