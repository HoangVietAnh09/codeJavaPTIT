package codePTIT;

import java.util.Scanner;

public class J01007 {
	public static long[] fib = new long[104];
	public static void Fibonacci() {
		fib[0] = 1L;
		fib[1] = 1L;
		for (int i = 2; i < 104; i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
	}
	public static boolean checkFib(long n){
		for(long x : fib){
			if(x == n){
				return true;
			}else if(x > n){
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Fibonacci();
		while(t --> 0){
			long n = sc.nextLong();
			if(checkFib(n)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}