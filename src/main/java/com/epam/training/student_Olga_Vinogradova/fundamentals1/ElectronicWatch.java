package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValueInSeconds = Math.max(0,scanner.nextInt());

        inputValueInSeconds %= 86400;

        int hours = inputValueInSeconds / 3600;
        int minutes = (inputValueInSeconds % 3600) / 60;
        int seconds = inputValueInSeconds % 60;
        System.out.printf("%d:%02d:%02d",hours,minutes,seconds);
    }
}
