package codePTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] al = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            al[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                byte x = sc.nextByte();
                if(x == 1){
                    al[i].add(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i+1);
            for(int j : al[i]){
                System.out.printf("%d ", j+1);
            }
            System.out.println();
        }
    }
}
