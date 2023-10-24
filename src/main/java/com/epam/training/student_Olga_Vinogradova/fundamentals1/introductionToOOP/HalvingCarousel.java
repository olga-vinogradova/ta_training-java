package com.epam.training.student_Olga_Vinogradova.fundamentals1.introductionToOOP;

import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.CarouselRun;
import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.DecrementingCarousel;


public class HalvingCarousel extends DecrementingCarousel {
    protected int position = 0;
    boolean isRun;
    private int counter = 0;

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun() {
                @Override
                public int next() {
                    if (isFinished()) {
                        return -1;
                    } else {
                        while (carousel[position %= carousel.length] < 1) {
                            position++;
                        }
                    }
                    int y = carousel[position];
                    carousel[position] = carousel[position] / 2;
                    position++;
                    return y;
                }

                @Override
                public boolean isFinished() {
                    for (int el : carousel) {
                        if (el > 0) {
                            return false;
                        }
                    }
                    return true;
                }
            };
        }
        return null;
    }

    public boolean addElement(int element) {
        if (counter < capacity && element > 0 && !isRun) {
            carousel[counter] = element;
            counter++;
            return true;
        }
        return false;
    }
}