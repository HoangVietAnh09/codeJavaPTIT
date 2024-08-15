package codePTIT;

import java.util.Scanner;

public class J02021 {
	public static int[] a = new int[100];
	public static int n, k, count = 0;
	public static void in(){
		count++;
		for(int i = 1; i <= k; i++){
			System.out.print(a[i]);
		}
		System.out.print(" ");
	}

	public static void backTrack(int i){
		for(int j = a[i-1] + 1; j <= n-k+i; j++){
			a[i] = j;
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
		System.out.println();
		System.out.printf("Tong cong co %d to hop", count);

	}
}
