package codePTIT;

import java.util.Scanner;

public class J02004 {
    public static boolean check(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String res = check(arr) ? "YES" : "NO";
            System.out.println(res);
        }
    }
}
