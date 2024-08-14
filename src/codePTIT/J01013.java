package codePTIT;

import java.util.Scanner;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            for(int i = 2; i <= Math.sqrt(n); i++) {
                while(n % i == 0) {
                    cnt += i;
                    n /= i;
                }
            }
        }
        System.out.println(cnt);
    }
}
