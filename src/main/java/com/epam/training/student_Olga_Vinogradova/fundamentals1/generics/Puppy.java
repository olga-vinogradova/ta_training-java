package com.epam.training.student_Olga_Vinogradova.fundamentals1.generics;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
