package codePTIT;

import java.util.Scanner;

public class J01006 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static long fib(int n) {
		if(n == 2 || n == 1) return 1;
		else {
			return fib(n-1) + fib(n-2);
		}
		
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			System.out.println(fib(n));
			System.out.println();
		}
	}
}
