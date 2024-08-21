package codePTIT.J04007;


import java.util.Scanner;


public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String MNV = "00001";
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String tax = sc.nextLine();
        String ngayDangKy = sc.nextLine();
        NhanVien nhanVien = new NhanVien(MNV, hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayDangKy);
        System.out.println(nhanVien);
    }

}
