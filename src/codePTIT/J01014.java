package codePTIT;

import java.util.Scanner;

public class J01014 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean check(long n) {
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}
		return n > 1;
	}
	public static void process() {
		long n = sc.nextLong();
		long max = 0;
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				if(check(n/i)){
					System.out.println(n/i);
					return;
				}
				if(check(i)) {
					max = i;
				}
			}
		}
		System.out.println(max);
	}
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			process();
		}
	}

}
