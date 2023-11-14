package codePTIT;

import java.util.Scanner;
class NhanVien{
	private String mnv, ten, sex, ns, dc, tax, regis;
	public NhanVien() {
		mnv = ten = sex = ns = dc = tax = regis = "";
	}
	public NhanVien(String mnv, String ten, String sex, String ns, String dc, String tax, String regis) {
		this.mnv = mnv;
		this.ten = ten;
		this.sex = sex;
		this.ns = ns;
		this.dc = dc;
		this.tax = tax;
		this.regis = regis;
	}
	public String toString() {
		return mnv + " " + ten + " " + sex + " " + ns + " " + dc + " " + tax + " " + regis;
	}
	
}


public class J04007 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String mnv = "00001";
		String ten = sc.nextLine();
		String sex = sc.nextLine();
		String ns = sc.nextLine();
		String dc = sc.nextLine();
		String tax = sc.nextLine();
		String regis = sc.nextLine();
		NhanVien a = new NhanVien(mnv, ten, sex, ns, dc, tax, regis);
		System.out.println(a);
		
		
		
	}

}
