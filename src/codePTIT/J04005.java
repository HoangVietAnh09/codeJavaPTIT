package codePTIT;

import java.util.Scanner;
class ThiSinh{
	private String ten, nsinh;
	double d1, d2, d3, tong;
	public ThiSinh(String ten, String nsinh, double d1, double d2, double d3){
		this.ten = ten;
		this.nsinh = nsinh;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	
	public String toString() {
		return ten + " " + nsinh + " " + String.format("%.1f", d1+d2+d3);
	}
	
}

public class J04005 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String ten = sc.nextLine();
		String nsinh = sc.nextLine();
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		ThiSinh a = new ThiSinh(ten, nsinh, d1, d2, d3);
		System.out.println(a);
		
		
	}

}
