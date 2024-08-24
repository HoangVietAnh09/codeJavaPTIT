package codePTIT.J04009;

import java.util.Scanner;

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
                double S = 1/4f * Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(c+a-b));
                System.out.printf("%.2f\n", S);
            } else {
                System.out.println("INVALID");
            }
        }
    }
}