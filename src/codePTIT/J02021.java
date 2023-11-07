package codePTIT;

import java.util.Scanner;

public class J02021 {
	public static Scanner sc = new Scanner(System.in);
	static int n, k, cnt = 0;
	static int[] a = new int[10];
	public static void in() {
		for(int i = 1; i <= k; i++) {
			System.out.print(a[i]);
		}
		cnt++;
		System.out.print(" ");
	}
	public static void backTrack(int i) {
		for(int j = a[i-1] + 1; j <= n-k+i; j++) {
			a[i] = j;
			if(i == k) {
				in();	
			}else {
				backTrack(i+1);
			}
		}
	}
	public static void main(String[] args) {
		n = sc.nextInt();
		k = sc.nextInt();
		backTrack(1);
		System.out.println();
		System.out.printf("Tong cong co %d to hop", cnt);
		
	}

}
