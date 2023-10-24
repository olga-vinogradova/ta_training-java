package com.epam.training.student_Olga_Vinogradova.fundamentals1.abstractClassesAndInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c){
        if(a == null || b == null || c == null) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;

        if (area() == 0) throw new IllegalArgumentException();
    }

    public double area() {
        return Math.abs((a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY())
                + c.getX() * (a.getY() - b.getY())) / 2);
    }

    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + " ";
    }

    public Point centroid() {
        double centerX = (a.getX() + b.getX() + c.getX()) / 3;
        double centerY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(centerX, centerY);
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


    public boolean isTheSame(Figure figure) {
        if (figure instanceof Triangle) {
            Triangle other = (Triangle) figure;
            List<Point> otherPoints = new ArrayList<>();
            otherPoints.add(other.a);
            otherPoints.add(other.b);
            otherPoints.add(other.c);

            for (Point p : otherPoints) {
                if (!pointsContain(p)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean pointsContain(Point p) {
        return a.equals(p) || b.equals(p) || c.equals(p);
    }
}
