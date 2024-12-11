package codePTIT;

import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ke = new int[n+1];
        for(int i=1;i <= n-1;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            ke[x]++;
            ke[y]++;
        }
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(ke[i] > 1){
                cnt++;
            }
        }
        if(cnt > 1) System.out.println("No");
        else System.out.println("Yes");

    }
}
