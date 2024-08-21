package codePTIT.J04004;

import java.util.Scanner;


public class J04004 {
	public static long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static long lcm(long a, long b){
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		PhanSo x1 = new PhanSo(x, y);
		long a = sc.nextLong();
		long b = sc.nextLong();
		PhanSo x2 = new PhanSo(a, b);
		long newTu = x1.getTu()*x2.getMau() + x1.getMau()*x2.getTu();
		long newMau = x1.getMau()*x2.getMau();
		PhanSo x3 = new PhanSo(newTu, newMau);
		System.out.println(x3);

	}
}
