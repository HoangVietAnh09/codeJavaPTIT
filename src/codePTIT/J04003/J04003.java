package codePTIT.J04003;

import java.util.Scanner;

public class J04003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long tu = sc.nextLong();
		long mau = sc.nextLong();
		PhanSo a = new PhanSo(tu, mau);
		System.out.println(a);

	}
	

}
