package codePTIT.J04010;

class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double len(Point a, Point b){
        return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX())+(a.getY() - b.getY())*(a.getY() - b.getY()));
    }



    
}
