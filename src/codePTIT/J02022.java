package codePTIT;

import java.util.Scanner;

public class J02022 {
    public static int n;
    public static int[] a;
    public static boolean[] daXet;

    public static void in(){
        for(int i = 1; i < n; i++){
            if(Math.abs(a[i] - a[i+1]) == 1){
                return;
            }
        }
        for(int i = 1; i <= n; i++){
            System.out.print(a[i]);
        }
        System.out.println();

    }
    public static void backTrack(int i){
        for(int j = 1; j <= n; j++){
            if(!daXet[j]){
                daXet[j] = true;
                a[i] = j;
                if(i == n){
                    in();
                }else{
                    backTrack(i+1);
                }
                daXet[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            a = new int[n+2];
            daXet = new boolean[n+2];
            backTrack(1);
        }
    }
}
