package codePTIT.J05044;


import java.util.ArrayList;
import java.util.Scanner;


public class J05044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int luongCoBan = Integer.parseInt(sc.nextLine());
            int soNgayCong = Integer.parseInt(sc.nextLine());
            list.add(new NhanVien(hoTen, chucVu, luongCoBan, soNgayCong));
        }
        String key = sc.nextLine();
        for (NhanVien nv : list) {
            if(nv.getChucVu().equals(key)) System.out.println(nv);
        }
    }
}
