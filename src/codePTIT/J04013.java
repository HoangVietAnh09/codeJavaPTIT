package codePTIT;

import java.util.Scanner;
class TuyenSinh{
	private String msv, ten; 
	private double toan, ly, hoa, sum, pri, tong;
	public TuyenSinh(String msv, String ten, double toan, double ly, double hoa) {
		this.msv = msv;
		this.ten = ten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		sum = toan + ly + hoa;
		String tmp = msv.substring(0,3);
		if(tmp.equals("KV1")) pri = 0.5;
		else if(tmp.equals("KV2")) pri = 1;
		else if(tmp.equals("KV3")) pri = 2.5;
		tong = toan*2 + ly + hoa;
	}
	public String check() {
		if(tong < 24) return "TRUOT";
		return "TRUNG TUYEN";
	}
	public String toString() {
		return msv + " " + ten + " " + pri + " " + tong + " " + check();
	}
	
}
public class J04013 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msv = sc.nextLine();
		String ten = sc.nextLine();
		double toan = sc.nextDouble();
		double ly = sc.nextDouble();
		double hoa = sc.nextDouble();
		TuyenSinh p = new TuyenSinh(msv, ten, toan, ly, hoa);
		System.out.println(p);
		
	}
}
