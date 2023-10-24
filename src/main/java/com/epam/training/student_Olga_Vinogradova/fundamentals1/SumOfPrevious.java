package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Arrays;

public class SumOfPrevious {
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};
        try {
            System.out.println(Arrays.toString(getSumCheckArray(array)));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }


    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        result[0] = false;
        result[1] = false;

        for (int i = 2; i < array.length; i++) {
            if (array[i] == array[i - 1] + array[i - 2]) {
                result[i] = true;
            }

        }
        return result;
    }
}
