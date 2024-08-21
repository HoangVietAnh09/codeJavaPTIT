package codePTIT;

import java.util.Map;
import java.util.Scanner;

public class J01014 {
	public static boolean isPrime(long s){
		for(int i = 2; i <= Math.sqrt(s); i++){
			if(s%i == 0) return false;
		}
		return s > 1;
	}
	public static void solve(long n){
		long res = 0;
		for(int i = 1; i <= Math.sqrt(n); i++){
			if(n % i == 0){
				if(isPrime(n/i)){
					System.out.println(n/i);
					return;
				}
				if(isPrime(i)){
					res = i;
				}
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			solve(n);
		}
	}

}
