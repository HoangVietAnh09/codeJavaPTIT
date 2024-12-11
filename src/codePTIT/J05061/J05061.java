package codePTIT.J05061;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double lyThuyet = Double.parseDouble(sc.nextLine());
            double thucHanh = Double.parseDouble(sc.nextLine());
            list.add(new NhanVien(hoTen, ngaySinh, lyThuyet, thucHanh));
        }
        Collections.sort(list);
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
