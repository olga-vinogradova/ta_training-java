package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Arrays;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        try{System.out.println(Arrays.toString(LocalMaximaRemove.removeLocalMaxima(array)));
    } catch (UnsupportedOperationException e) {
        System.out.println(e.getMessage());
    }}

    private static int[] removeLocalMaxima(int[] array) {
        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++){
            if ((i > 0 && array[i] <= array[i - 1]) || (i != array.length - 1 && array[i] <= array[i + 1])){
                result[j++] = array[i];
            }
        }return Arrays.copyOf(result, j);
    }
}
