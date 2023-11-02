package codePTIT;

import java.util.Arrays;
import java.util.Scanner;

public class J02005 {
	public static Scanner sc = new Scanner(System.in);
	public static void process() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[1004];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			c[a[i]] = 1;
		}
		for(int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);
		for(int i = 0; i < m; i++) {
			if(c[b[i]] == 1) {
				System.out.print(b[i] + " ");
				c[b[i]] = 2;
			}
		}
 		
		
		
	}
	public static void main(String[] args) {
		process();
	}
}
