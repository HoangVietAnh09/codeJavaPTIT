package codePTIT.J04006;


import java.util.Scanner;

public class J04006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hoTen = sc.nextLine();
		String lop = sc.nextLine();
		String ngaySinh = sc.nextLine();
		double gpa = sc.nextDouble();
		SinhVien sinh = new SinhVien(hoTen, lop, ngaySinh, gpa);
		System.out.println(sinh);
	}

}
