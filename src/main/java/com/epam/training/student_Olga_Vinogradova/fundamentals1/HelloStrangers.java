package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strangersAmount = scanner.nextInt();
        scanner.nextLine();

        if (strangersAmount == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (strangersAmount < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
               for (int i = 0; i < strangersAmount; i++) {
                String strangerName = scanner.nextLine();
              System.out.println("Hello, " + strangerName);
            }

        }
    }
}