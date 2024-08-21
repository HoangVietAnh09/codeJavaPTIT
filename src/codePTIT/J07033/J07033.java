package codePTIT.J07033;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07033 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sinhVien = new ArrayList<SinhVien>();
        for(int i = 0; i < t; i++){
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sv = new SinhVien(MSV, hoTen, lop, email);
            sinhVien.add(sv);
        }
        Collections.sort(sinhVien);
        for(SinhVien sv : sinhVien){
            System.out.println(sv);
        }
    }
}
