package codePTIT.J04019;

public class Triangle {
    private double A, B, C;
    public Triangle(Point a, Point b, Point c) {
        A = a.distance(b, c);
        B = b.distance(a, c);
        C = c.distance(a, b);
    }

    public boolean valid(){
        double m = Math.max(A, Math.max(B, C));
        return 2*m < A + B + C;
    }

    public String getPerimeter(){
        double c = A+B+C;
        return String.format("%.3f", c);
    }

}
