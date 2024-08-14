package codePTIT;

import java.util.Scanner;

public class J01011 {
    public static long gcd(long n, long m){
        if(m == 0) return n;
        return gcd(m, n%m);
    }
    public static long lcm(long n, long m){
        return n*m/gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            System.out.println(lcm(n, m) + " " + gcd(n, m));
        }
    }
}
