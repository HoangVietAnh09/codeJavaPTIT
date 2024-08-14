package codePTIT;

import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            System.out.printf("Test %d: ", j);
            for(int i = 2; i <= n; i++){
                int cnt = 0;
                while(n%i == 0){
                    cnt++;
                    n/=i;
                }
                if(cnt != 0){
                    System.out.printf("%d(%d) ", i, cnt);
                }
            }
            System.out.println();
        }
    }
}
