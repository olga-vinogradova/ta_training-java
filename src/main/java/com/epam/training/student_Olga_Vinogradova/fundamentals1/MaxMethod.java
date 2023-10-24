package com.epam.training.student_Olga_Vinogradova.fundamentals1;

public class MaxMethod {
    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            throw new UnsupportedOperationException();
        }
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] values = new int[]{};
        try {
            int result = MaxMethod.max(values);
            System.out.println(result == 10);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
