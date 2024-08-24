package codePTIT.J05004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;



public class J05004 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(hoTen, lop, ngaySinh, diem));
        }
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
