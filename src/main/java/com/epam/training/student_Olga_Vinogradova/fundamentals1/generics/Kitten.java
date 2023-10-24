package com.epam.training.student_Olga_Vinogradova.fundamentals1.generics;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}
