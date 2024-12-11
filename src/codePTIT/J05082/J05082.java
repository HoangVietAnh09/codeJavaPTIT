package codePTIT.J05082;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05082 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            list.add(new KhachHang(ten, gioiTinh, ngaySinh, diaChi));
        }
        Collections.sort(list);
        for (KhachHang khachHang : list) {
            System.out.println(khachHang);
        }
    }
}
