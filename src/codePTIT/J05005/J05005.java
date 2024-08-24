package codePTIT.J05005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(hoten, lop, ngaySinh, diem));
        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
