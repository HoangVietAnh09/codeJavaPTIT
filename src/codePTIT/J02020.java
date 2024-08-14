package codePTIT;

import java.util.Scanner;

public class J02020 {
	public static int[] arr = new int[100];
	public static int n, k, count = 0;
	public static void in(){
		count++;
		for(int i = 1; i <= k; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void backTrack(int i){
		for(int j = arr[i-1]+1; j <= n-k+i; j++){
			arr[i] = j;
			if(i == k){
				in();
			}else{
				backTrack(i+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		backTrack(1);
		System.out.printf("Tong cong co %d to hop", count);

	}
}
