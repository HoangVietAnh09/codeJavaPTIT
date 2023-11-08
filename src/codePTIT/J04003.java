package codePTIT;

import java.util.Scanner;
class PhanSo{
	private long tu, mau;
	
	public PhanSo() {
		tu = mau = 1;
	}
	
	public PhanSo(long tu, long mau) {
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

public class J04003 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		long tu = sc.nextLong();
		long mau = sc.nextLong();
		PhanSo a = new PhanSo(tu, mau);
		System.out.println(a);
		
	}
	

}
