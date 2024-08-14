package codePTIT;

import java.util.Scanner;

public class J01006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0){
			int n = sc.nextInt();
			long[] fib = new long[104];
			fib[0] = 1;
			fib[1] = 1;
			for(int i = 2; i < n; i++){
				fib[i] = fib[i-1] + fib[i-2];
			}
			System.out.println(fib[n-1]);
		}
	}
}