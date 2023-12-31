package codePTIT;

import java.util.Scanner;
class ps{
	private long tu, mau;
	public ps() {
		tu = 0;
		mau = 1;
	}
	public ps(long tu, long mau) {
		this.tu = tu;
		this.mau = mau;
	}
	private long gcd(long a, long b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
	
	public String toString() {
		long tmp = gcd(this.tu, this.mau);
		return tu/tmp + "/" + mau/tmp;
	}
}

public class J04004 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long x = sc.nextLong();
		long y = sc.nextLong();
		long z = sc.nextLong();
		long t = sc.nextLong();
		long tu = x*t + y*z;
		long mau = y*t;
		ps res = new ps(tu, mau);
		System.out.println(res);
	}

}
