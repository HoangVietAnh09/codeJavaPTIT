package codePTIT.J05003;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class J05003 {
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
        for(SinhVien sv : list) {
            System.out.println(sv);
        }

    }
}
