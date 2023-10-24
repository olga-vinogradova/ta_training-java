package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces;

public class CountDownTask implements Task {
    private int value;
    private boolean isFinished;

    public CountDownTask(int value) {
        if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    @Override
    public void execute() {
        value--;
        if (value <= 0) {
            value = 0;
            isFinished = true;
        }
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    public int getValue() {
        return value;
    }
}