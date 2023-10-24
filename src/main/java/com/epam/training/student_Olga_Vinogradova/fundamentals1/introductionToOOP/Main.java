package com.epam.training.student_Olga_Vinogradova.fundamentals1.introductionToOOP;

import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.CarouselRun;
import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.DecrementingCarousel;

public class Main {
    public static void main(String[] args) {

        HalvingCarousel carousel = new HalvingCarousel(5);

        System.out.println(carousel.addElement(1));
        System.out.println( carousel.addElement(2));
        System.out.println( carousel.addElement(3));

        carousel.run();

        System.out.println(carousel.addElement(4));
        System.out.println(carousel.addElement(5));
        System.out.println( carousel.addElement(6));

        System.out.println(  carousel.addElement(0));
        System.out.println(carousel.addElement(-123));
        System.out.println( carousel.addElement(-4568));
    }
    }
