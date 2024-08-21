package codePTIT;

import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }else{
                    cnt--;
                }
            }
            res += cnt > 0 ? 1 : 0;
        }
        System.out.println(res);
    }
}
