package codePTIT;

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(s1.equals(s2) ? -1 : Math.max(s1.length(), s2.length()));
        }
    }
}
