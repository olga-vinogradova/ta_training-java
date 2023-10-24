package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        int totalValue = 0;
        int count = 0;

        do {
            value = scanner.nextInt();
            if(value!=0){
            totalValue += value;
            count += 1;}
        } while (value != 0);

        System.out.println(Math.round(totalValue/count));
    }
    }

