package codePTIT.J05081;

import java.util.*;


public class J05081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<MatHang> list = new ArrayList<>(t);
		for(int i = 1; i <= t; i++) {
			String ten = sc.nextLine();
			String donVi = sc.nextLine();
			int giaMua = Integer.parseInt(sc.nextLine());
			int giaBan = Integer.parseInt(sc.nextLine());
			MatHang math = new MatHang(ten, donVi, giaMua, giaBan);
			list.add(math);
		}
		Collections.sort(list);
		for(MatHang math : list) {
			System.out.println(math);
		}
	}
}
