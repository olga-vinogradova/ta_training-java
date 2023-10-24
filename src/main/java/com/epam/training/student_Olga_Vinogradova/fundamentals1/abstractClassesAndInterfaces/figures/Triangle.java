package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces.figures;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
                + c.getX() * (a.getY() - b.getY())) / 2);
    }

    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }

    public Point leftmostPoint() {
        List<Point> points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);

        Point leftmost = points.get(0);
        for (Point p : points) {
            if (p.getX() < leftmost.getX()) {
                leftmost = p;
            }
        }
        return leftmost;
    }
}