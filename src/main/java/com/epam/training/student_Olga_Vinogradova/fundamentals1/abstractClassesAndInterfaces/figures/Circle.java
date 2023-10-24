package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces.figures;

class Circle extends Figure {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public String pointsToString() {
        return center.toString();
    }

    public String toString() {
        return "Circle[" + pointsToString() + radius + "]";
    }

    public Point leftmostPoint() {
        double leftmostX = center.getX() - radius;

        return new Point(leftmostX, center.getY());
    }
}
