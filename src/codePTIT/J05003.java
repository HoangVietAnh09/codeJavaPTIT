package codePTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class Sinh_Vien{
	public static int cnt = 1;
	private String msv, ten, nsinh, lop;
	private float gpa;
	public Sinh_Vien() {
		msv = ten = nsinh = lop = "";
		gpa = 0f;
	}
	public Sinh_Vien(String ten, String nsinh, String lop, float gpa) {
		this.msv = String.format("B20DCCN%03d", cnt++);
		this.ten = ten;
		this.nsinh = nsinh;
		this.lop = lop;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return msv + " " + ten + " " + lop + " " + nsinh + " " + String.format("%.2f", gpa);
	}
};

public class J05003 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			String ten = sc.nextLine();
			String lop = sc.nextLine();
			String nsinh = sdf.format(sdf.parse(sc.nextLine()));
			float gpa = Float.parseFloat(sc.nextLine());
			Sinh_Vien a = new Sinh_Vien(ten, lop, nsinh, gpa);
			System.out.println(a);
		}
		
	}

}
