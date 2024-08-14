package codePTIT;

import java.util.Scanner;
class Phan_So{
	private long tu, mau;
	public Phan_So() {
		tu = 0;
		mau = 1;
	}
	public Phan_So(long tu, long mau) {
		this.tu = tu;
		this.mau = mau;
	}
	public long getTu() {
		return tu;
	}
	public long getMau() {
		return mau;
	}
	public static long gcd(long a, long b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
	public static Phan_So rutGon(Phan_So p) {
		long tmp = gcd(p.tu, p.mau);
		Phan_So q = new Phan_So(p.tu/tmp, p.mau/tmp);
		return q;
		
	}
	public String toString() {
		return tu + "/" + mau;
	}
	
	
}

public class J04014 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			int tu = sc.nextInt();
			int mau = sc.nextInt();
			Phan_So A = new Phan_So(tu, mau);
			tu = sc.nextInt();
			mau = sc.nextInt();
			Phan_So B = new Phan_So(tu, mau);
			Phan_So C = new Phan_So((long)Math.pow(A.getTu()*B.getMau() + A.getMau()*B.getTu(), 2), (long)Math.pow(A.getMau()*B.getMau(), 2));
			C = Phan_So.rutGon(C);
			Phan_So D = new Phan_So(A.getTu()*B.getTu()*C.getTu(), A.getMau()*B.getMau()*C.getMau());
			D = Phan_So.rutGon(D);
			System.out.println(C + " " + D);
			
		}
		
		
	}

}
