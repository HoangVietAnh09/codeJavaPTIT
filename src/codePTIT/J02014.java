package codePTIT;

import java.util.Scanner;

public class J02014 {
    public static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        int[] f = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
            if(i == 0){
                f[i] = a[i];
            }else{
                f[i] = f[i-1] + a[i];
            }
        }
        for(int i = 1; i < n; i++) {
            if(f[i-1] == sum - f[i]){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }
}
