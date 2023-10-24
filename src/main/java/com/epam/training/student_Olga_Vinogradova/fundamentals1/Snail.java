package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if(a<=b && a<h) {
            System.out.println("Impossible");
        }else if(a>=h){
                System.out.println("1");
        }else if (a>=0 && b>=0 && h>=0){
            int numberOfDays = (h-a+(a-b))/(a-b);
            System.out.println(numberOfDays);}
        }
    }

