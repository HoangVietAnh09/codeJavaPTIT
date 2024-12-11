package codePTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();
            StringBuilder sb = new StringBuilder(c.toString());
            int max = Math.max(a.toString().length(), b.toString().length());
            if(sb.length() < max){
                sb.insert(0, "0");
            }
            System.out.println(sb);
        }
    }
}
