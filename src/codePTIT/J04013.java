package codePTIT;

import java.util.Scanner;
class TuyenSinh{
	private String msv, ten; 
	private float toan, ly, hoa, pri, tong;
	public TuyenSinh(String msv, String ten, float toan, float ly, float hoa) {
		this.msv = msv;
		this.ten = ten;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		String tmp = msv.substring(0,3);
		if(tmp.equals("KV1")) this.pri = 0.5f;
		else if(tmp.equals("KV2")) this.pri = 1.f;
		else if(tmp.equals("KV3")) this.pri = 2.5f;
		this.tong = toan*2 + ly + hoa;
	}
	public String formatFloat(float x) {
		int tmp = (int) (x*10);
		return tmp%10 == 0 ? String.format("%.0f", x) : String.format("%.1f", x);
	}
	public String check() {
		if(tong + pri < 24.f) return "TRUOT";
		return "TRUNG TUYEN";
	}
	public String toString() {
		return msv + " " + ten + " " + formatFloat(pri) + " " + formatFloat(tong) + " " + check();
	}
	
}
public class J04013 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msv = sc.nextLine();
		String ten = sc.nextLine();
		float toan = Float.parseFloat(sc.nextLine());
		float ly = Float.parseFloat(sc.nextLine());
		float hoa = Float.parseFloat(sc.nextLine());
		TuyenSinh p = new TuyenSinh(msv, ten, toan, ly, hoa);
		System.out.println(p);
		
	}
}
