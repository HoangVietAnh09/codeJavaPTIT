package codePTIT.J04018;

import java.util.Scanner;



public class J04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            SoPhuc a = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc b = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc c = a.cong(b).nhan(a);
            SoPhuc d = a.cong(b).nhan(a.cong(b));

            System.out.printf("%s, %s\n", c, d);
        }
    }
}
