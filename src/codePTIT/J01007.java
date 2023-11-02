package codePTIT;

import java.util.Scanner;

public class J01007 {
	public static Scanner sc = new Scanner(System.in);
	
	public static long fib(long n) {
		long f[] = new long[10004];
		f[0] = 0;
		f[1] = 1;
		for(int i = 2; i < 100; i++) {
			f[i] = f[i-1] + f[i-2];
		}
		for(int i = 0; i < 100; i++) {
			if(f[i] == n) return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			if(fib(n) == 0) {
				System.out.println("NO");
			}else {
				System.err.println("YES");
			}
		}
		
	}
}
