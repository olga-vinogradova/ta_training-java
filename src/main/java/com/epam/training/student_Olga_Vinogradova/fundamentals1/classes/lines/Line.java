package com.epam.training.student_Olga_Vinogradova.fundamentals1.classes;

public class Line {
 int k;
 int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection (Line other){
        if(this.k == other.k && this.b == other.b){
            return null;
        }else if (this.k == other.k){
            return null;
        }else{
            int x = (other.b - this.b)/(this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x,y);
        }
    }
}
