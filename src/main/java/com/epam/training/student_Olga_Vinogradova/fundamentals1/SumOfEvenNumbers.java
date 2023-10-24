package com.epam.training.student_Olga_Vinogradova.fundamentals1;

public class SumOfEvenNumbers {
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sum +=num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2, 10, 0, 5};
        try {
            System.out.println(sum(array));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
