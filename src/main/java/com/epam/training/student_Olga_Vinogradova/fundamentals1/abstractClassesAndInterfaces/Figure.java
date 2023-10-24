package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces;

abstract class Figure {
    public abstract double area();
    public abstract String pointsToString();
    public abstract Point centroid();
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + "]";
    }
    public abstract Point leftmostPoint();
    public abstract boolean isTheSame(Figure figure);
}
