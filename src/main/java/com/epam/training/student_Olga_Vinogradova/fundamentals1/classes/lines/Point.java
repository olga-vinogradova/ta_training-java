package com.epam.training.student_Olga_Vinogradova.fundamentals1.classes;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }

}
