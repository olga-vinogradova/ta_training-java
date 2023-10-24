package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces.figures;

public class Main {
    public static void main(String[] args) {
        double area = new Circle(new Point(1,1), 3).area();
        System.out.println(area);
    }
}
