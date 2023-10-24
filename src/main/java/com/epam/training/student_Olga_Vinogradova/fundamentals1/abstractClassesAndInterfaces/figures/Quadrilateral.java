package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces.figures;

import java.util.ArrayList;
import java.util.List;

public class Quadrilateral extends Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double area() {
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }

    public Point leftmostPoint() {
        List<Point> points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);

        Point leftmost = points.get(0);
        for (Point p : points) {
            if (p.getX() < leftmost.getX()) {
                leftmost = p;
            }
        }
        return leftmost;
    }
}