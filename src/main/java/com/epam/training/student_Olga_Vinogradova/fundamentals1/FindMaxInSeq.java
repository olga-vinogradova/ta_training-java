package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class FindMaxInSeq {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int value;
//        int maxValue = 0;
//
//        do {
//            value = scanner.nextInt();
//        maxValue = Math.max(maxValue,value);
//        }
//        while (value != 0);
//        System.out.println(maxValue);
//    }
public static int max(){
Scanner scanner = new Scanner(System.in);
    int value;
    int maxValue = Integer.MIN_VALUE;

        do {
        value = scanner.nextInt();
        if(value!=0){
                maxValue = Math.max(maxValue, value);}
        } while (value != 0);

        return maxValue;
}

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}


