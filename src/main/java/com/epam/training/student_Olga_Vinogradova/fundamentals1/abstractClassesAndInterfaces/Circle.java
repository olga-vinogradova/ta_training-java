package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces;

public class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        validateCircle();
    }
    public Point centroid() {
        return center;
    }

    private void validateCircle() {
        if (radius <= 0 || center == null) {
            throw new IllegalArgumentException("Circle radius must be positive");
        }
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public String pointsToString() {
        return center.toString() + ", radius: " + radius + " ";
    }

    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (figure instanceof Circle) {
            Circle other = (Circle) figure;

            if (compareFloats(this.radius, other.radius) &&
                    compareFloats(this.center.getX(), other.center.getX()) &&
                    compareFloats(this.center.getY(), other.center.getY())) {
                return true;
            }
        }
        return false;
    }

    public static boolean compareFloats(double f1, double f2) {
        final double epsilon = 0.001;

        return Math.abs(f1 - f2) < epsilon;
    }
}
