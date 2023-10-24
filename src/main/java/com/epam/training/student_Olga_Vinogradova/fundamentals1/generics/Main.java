package com.epam.training.student_Olga_Vinogradova.fundamentals1.generics;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House<Dog> dogHouse = new House<>(); // Parameterize the dogHouse with Dog type
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        // dogHouse.enter(murzik); // This will fail to compile
        System.out.println(dogHouse);

        House<Cat> catHouse = new House<>(); // Parameterize the catHouse with Cat type
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        // catHouse.enter(rex); // This will fail to compile
        System.out.println(catHouse);
    }
}

