package codePTIT.J07010;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            SinhVien sinhVien = new SinhVien(ten, lop, ngaySinh, gpa);
            System.out.println(sinhVien);

        }

    }
}
