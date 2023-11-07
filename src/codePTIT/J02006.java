package codePTIT;

import java.util.Arrays;
import java.util.Scanner;

public class J02006 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[1004];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			c[a[i]] = 1;
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			c[b[i]] = 1;
		}
		for(int i = 1; i < 1004; i++) {
			if(c[i] == 1) {
				System.out.print(i + " ");
			}
		}
	
	}

}
