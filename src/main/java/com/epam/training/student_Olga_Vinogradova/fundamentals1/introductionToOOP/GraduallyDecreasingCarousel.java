package com.epam.training.student_Olga_Vinogradova.fundamentals1.introductionToOOP;


import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.CarouselRun;
import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.DecrementingCarousel;

public class GraduallyDecreasingCarousel extends DecrementingCarousel {
    int decrement = 1;
    int index;
    boolean isRun;

    public GraduallyDecreasingCarousel(final int capacity) {
        super(capacity);
    }



    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new GraduallyDecreasingCarousel(capacity);
        }
        return null;
    }

    @Override
    public int next() {
        if (isFinished()) {
            return -1;
        } else {

            while (carousel[index %= carousel.length] <= 0) {
                index++;
                if (index == carousel.length) {
                    decrement++;
                }
            }
        }

        int value = carousel[index];
        carousel[index++] -= decrement;

        if (index == carousel.length) {
            decrement++;
        }

        return value;
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}