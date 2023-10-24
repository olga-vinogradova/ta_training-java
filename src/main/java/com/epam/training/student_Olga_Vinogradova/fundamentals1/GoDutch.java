package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int billAmount = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();
        int totalAmount = (billAmount + (billAmount / 10));

        if(billAmount<0){
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends<=0) {
            System.out.println("Number of friends cannot be negative or zero");
        }else {
            System.out.println(totalAmount/numberOfFriends);
        }
    }
}