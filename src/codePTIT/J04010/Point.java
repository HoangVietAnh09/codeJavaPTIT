package codePTIT.J04010;

class Point {
    private double x, y;
    public Point(){
        x = y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p){
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point p){
        return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
    }

    public double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(x - p1.x, 2) + Math.pow(y - p2.y, 2));
    }

}
