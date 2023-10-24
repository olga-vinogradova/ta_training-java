package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Arrays;

public class CycleSwap {
    public static void main(String[] args) {
        int[] array = new int[]{  1, 3, 2, 7, 4 };
        try{
            CycleSwap.cycleSwap(array, 5);
            System.out.println(Arrays.toString(array));
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }}

     static void cycleSwap(int[] array) {
        if (array.length <= 1){
            return;
        }
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--){
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
    static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1){
            return;
        }
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int newPlace = (i + shift) % array.length;
            temp[newPlace] = array[i];
        }
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}

