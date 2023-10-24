package com.epam.training.student_Olga_Vinogradova.fundamentals1.generics;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}
