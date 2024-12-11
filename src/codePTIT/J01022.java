package codePTIT;

import java.util.Scanner;

public class J01022 {
    public static long[] f = new long[104];
    public static void fibo(){
        f[1] = f[2] = 1L;
        for(int i=3; i<104; i++){
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static char dev(int n, long k){
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= f[n-2]) return dev(n-2, k);
        return dev(n-1, k - f[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibo();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(dev(n, k));
        }

    }
}
