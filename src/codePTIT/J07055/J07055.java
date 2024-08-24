package codePTIT.J07055;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07055 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            String hoTen = sc.nextLine();
            double luyenTap = Double.parseDouble(sc.nextLine());
            double thucHanh = Double.parseDouble(sc.nextLine());
            double thi = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(hoTen, luyenTap, thucHanh, thi));
        }
        Collections.sort(list);
        for(SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
