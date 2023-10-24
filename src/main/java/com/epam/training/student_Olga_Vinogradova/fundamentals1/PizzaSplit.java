package com.epam.training.student_Olga_Vinogradova.fundamentals1;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfPiecesPerPizza = scanner.nextInt();
        int pizza = 0;
        int count = 0;


        if ((numberOfPeople > 0) && (numberOfPiecesPerPizza > 0)) {
            do {
                count ++;
                pizza = numberOfPiecesPerPizza * count % numberOfPeople;
            } while(pizza != 0);
            }
        System.out.println(count);
        }
    }
