package codePTIT;

import java.util.Scanner;

public class J02011 {
	public static Scanner sc = new Scanner(System.in);
	public static void swap(int &x, int &y) {
		int tmp = x;
		x = y;
		y = tmp;
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int i, j, minIdx;
		int cnt = 0;
		int flag = 0;
		for(i = 0; i < n-1; i++) {
			minIdx = i;
			for(j = i+1; j < n; j++) {
				if(a[minIdx] > a[j]) {
					flag = 1;
					minIdx = j;
				}
			}
			if(flag == 1) {
				cnt++;
				System.out.printf("Buoc %d: ", cnt);
			}
			int tmp = a[minIdx];
			a[minIdx] = a[i];
			a[i] = tmp;
			for(i = 0; i < n; i++) {
				if(flag == 1) {
					System.out.print(a[i] + " ");
				}
			}
			flag = 0;
			System.out.println();
		}
	}
}
