package codePTIT;

import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1; j <= t; j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] a = new int[10004];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                a[arr[i]] = 1;
            }
            System.out.printf("Test %d:\n", j);
            for (int i = 0; i < n; i++) {
                int cnt = 1;
                if(a[arr[i]] == 1){
                    for(int k = i+1; k < n; k++){
                        if(arr[k] == arr[i]){
                            cnt++;
                        }
                    }
                    a[arr[i]] = 0;
                    System.out.printf("%d xuat hien %d lan\n", arr[i], cnt);
                }
            }

        }
    }
}
