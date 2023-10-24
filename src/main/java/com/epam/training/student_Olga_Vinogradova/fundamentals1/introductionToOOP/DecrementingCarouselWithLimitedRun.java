package com.epam.training.student_Olga_Vinogradova.fundamentals1.introductionToOOP;

import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.CarouselRun;
import com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.decrementingCarousel.DecrementingCarousel;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel {

    private int remainingActions;
    private boolean isRun;

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        this.remainingActions = actionLimit;
    }

    @Override
    public boolean addElement(int element) {
        if (!isRun && element > 0 && index < carousel.length) {
            carousel[index++] = element;
            int countElement = 0;
            countElement++;
            return true;
        }
        return false;
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun() {
                @Override
                public int next() {
                    if (remainingActions <= 0 || isFinished()) {
                        return -1;
                    } else {
                        int currentValue = super.next();
                        if (currentValue != -1) {
                            remainingActions--;
                        }
                        return currentValue;
                    }
                }

                @Override
                public boolean isFinished() {
                    return remainingActions <= 0 || super.isFinished();
                }
            };
        }
        return null;
    }
}