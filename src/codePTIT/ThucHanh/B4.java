package codePTIT.ThucHanh;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[t+2][t+2];
        Pair<Integer, Integer> pair = new Pair<>();
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                arr[i][j] = sc.nextInt();
                pair.add(i, j);
                if(i < j && arr[i][j] == 1){
                    System.out.println(pair);
                }
            }
        }

    }
}
