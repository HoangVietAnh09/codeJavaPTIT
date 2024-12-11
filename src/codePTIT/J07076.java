package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07076 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int q = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            int[] b = new int[n];
            for(int i=0;i<n;i++) b[i] = arr[i][q-1];
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(b[i] > b[j]){
                        int tmp = b[i];
                        b[i] = b[j];
                        b[j] = tmp;
                    }
                }
            }
            for(int i=0;i<n;i++) arr[i][q-1] = b[i];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.printf("%d ",arr[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
