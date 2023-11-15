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
			
		}
		
		
	}

}
