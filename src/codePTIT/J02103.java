package codePTIT;

import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x <= t; x++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int[][] b = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    b[i][j] = a[j][i];
                }
            }
            int[][] res = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int sum = 0;
                    for(int k = 0; k < m; k++){
                        sum += a[i][k]*b[k][j];
                    }
                    res[i][j] = sum;
                }
            }
            System.out.printf("Test %d:\n", x);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
