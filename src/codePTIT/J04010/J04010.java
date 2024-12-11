package codePTIT.J04010;

import java.util.Scanner;

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point A = new Point(sc.nextDouble(), sc.nextDouble());
            Point B = new Point(sc.nextDouble(), sc.nextDouble());
            Point C = new Point(sc.nextDouble(), sc.nextDouble());

            Triangle triangle = new Triangle(A, B, C);
            double AB = triangle.len(A, B);
            double BC = triangle.len(B, C);
            double AC = triangle.len(A, C);

            if(AB + AC <= BC || AB + BC <= AC || BC + AC <= AB){
                System.out.println("INVALID");
            }else{
                double S = 1/4f*(Math.sqrt((AB+AC+BC)*(AB+BC-AC)*(AB+AC-BC)*(-AB+BC+AC)));
                double R = AB*AC*BC/(4*S);
                System.out.printf("%.3f\n", Math.PI * R * R);
            }
        }
    }
}
