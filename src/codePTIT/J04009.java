
import java.util.Scanner;

class Point {

    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow(x-p2.x, 2) + Math.pow(y-p2.y, 2));
    }
}

public class J04009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            Point[] tri = new Point[3];
            for (int i = 0; i < 3; i++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                tri[i] = new Point(x, y);
            }

            double a = tri[0].distance(tri[1]);
            double b = tri[1].distance(tri[2]);
            double c = tri[0].distance(tri[2]);

            if (a + b > c && b + c > a && a + c > b) {
                double S = (double)1 / 4 * Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
                System.out.printf("%.2f\n", S);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}