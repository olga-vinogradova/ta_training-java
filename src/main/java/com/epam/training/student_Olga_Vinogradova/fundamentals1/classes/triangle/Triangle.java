package com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.triangle;

public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (areVerticesDegenerative(a, b, c)) {
            throw new IllegalArgumentException("Degenerative triangle: vertices are collinear.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean areVerticesDegenerative(Point p1, Point p2, Point p3) {
        double area = 0.5 * (p1.getX() * (p2.getY() - p3.getY()) +
                p2.getX() * (p3.getY() - p1.getY()) +
                p3.getX() * (p1.getY() - p2.getY()));
        return area == 0;
    }

    public double area() {
        return 0.5 * Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) -
                (a.getX() - b.getX()) * (c.getY() - a.getY()));
    }

    public Point centroid() {
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(centroidX, centroidY);
    }
}