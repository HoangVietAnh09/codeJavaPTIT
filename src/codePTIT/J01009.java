package codePTIT;

import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = 1, result = 0;
        for(int i = 1; i <= n; i++){
            tmp *= i;
            result += tmp;
        }
        System.out.println(result);
    }
}
