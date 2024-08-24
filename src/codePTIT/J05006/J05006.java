package codePTIT.J05006;

import java.util.ArrayList;
import java.util.Scanner;


public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String tax = sc.nextLine();
            String ngayKiHopDong = sc.nextLine();
            list.add(new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong));
        }
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
