package com.epam.training.student_Olga_Vinogradova.fundamentals1.classes.segments;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {
    private Point start;
    private Point end;

        public Segment(Point start, Point end) {
            if(start.getX() == end.getX() && start.getY() == end.getY()) {
                throw new IllegalArgumentException("Degenerative segment: start and end points are the same.");
            }
            this.start = start;
            this.end = end;

        }

        double length() {
            double dx = end.getX() - start.getX();
            double dy = end.getY() - start.getY();
            return sqrt(pow(dx,2) + pow(dy,2));

        }

        Point middle() {
            double midX = (start.getX() + end.getX()) / 2;
            double midY = (start.getY() + end.getY()) / 2;
            return new Point(midX, midY);
        }

        Point intersection(Segment another) {
            double x1 = start.getX();
            double y1 = start.getY();
            double x2 = end.getX();
            double y2 = end.getY();
            double x3 = another.start.getX();
            double y3 = another.start.getY();
            double x4 = another.end.getX();
            double y4 = another.end.getY();
            double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

            if (denominator == 0) {
                return null;
            }

            double intersectionX = ((x1 * y2 - y1 * x2) * (x3 - x4) - (x1 - x2) * (x3 * y4 - y3 * x4)) / denominator;
            double intersectionY = ((x1 * y2 - y1 * x2) * (y3 - y4) - (y1 - y2) * (x3 * y4 - y3 * x4)) / denominator;

            if (intersectionX >= Math.min(x1, x2) && intersectionX <= Math.max(x1, x2) &&
                    intersectionY >= Math.min(y1, y2) && intersectionY <= Math.max(y1, y2) &&
                    intersectionX >= Math.min(x3, x4) && intersectionX <= Math.max(x3, x4) &&
                    intersectionY >= Math.min(y3, y4) && intersectionY <= Math.max(y3, y4)) {
                return new Point(intersectionX, intersectionY);
            } else {
                return null;
            }
        }
}