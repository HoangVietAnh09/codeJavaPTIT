package codePTIT;

import java.util.Scanner;

public class J01026 {
    public static boolean check(int s){
        int tmp = (int)Math.sqrt(s);
        return tmp*tmp == s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String res = check(n) ? "YES" : "NO";
            System.out.println(res);

        }
    }
}
