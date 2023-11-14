package codePTIT;

import java.text.*;
import java.util.Date;
import java.util.Scanner;
class SinhVien{
	private String msv, ten, lop, ns;
	private double gpa;
	public SinhVien() {
		msv = ten = lop = ns = "";
		gpa = 0;
	}
	public SinhVien(String msv, String ten, String lop, String ns, double gpa) {
		this.msv = msv;
		this.ten = ten;
		this.lop = lop;
		this.ns = ns;
		this.gpa = gpa;
	}
	public String formatNs() {
		try {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
			Date date = f.parse(ns);
			return f.format(date);
		}catch(ParseException e) {
			System.out.println(e);
		}
		return "";
	}
	public String toString() {
		return msv + " " + ten + " " + lop + " " + formatNs() + " " + String.format("%.2f", gpa);
	}
}
public class J04006 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msv = "B20DCCN001";
		String ten = sc.nextLine();
		String lop = sc.nextLine();
		String ns = sc.nextLine();
		double gpa = sc.nextDouble();
		SinhVien a = new SinhVien(msv, ten, lop, ns, gpa);
		System.out.println(a);
		
		
	}

}
