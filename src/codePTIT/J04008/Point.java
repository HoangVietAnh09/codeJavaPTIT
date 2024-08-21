package codePTIT.J04008;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Point {
    private double x, y;
    public Point(){
        x = y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point p){
        return sqrt(pow(this.x-p.x, 2) + pow(this.y-p.y, 2));
    }
    public  double distance2(Point a, Point b){
        return sqrt(pow(a.x-b.x, 2) + pow(a.y-b.y, 2));
    }
    public String toString(){
        return x + " " + y;
    }
}
