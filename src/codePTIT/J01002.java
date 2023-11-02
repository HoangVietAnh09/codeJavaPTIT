package codePTIT;

import java.util.Scanner;

public class J01002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for(int i = 1; i <= t; i++) {
			long n;
			n = sc.nextInt();
			long sum = 0;
			sum = n*(n+1)/2;
			System.out.println(sum);
		}
	}

}
