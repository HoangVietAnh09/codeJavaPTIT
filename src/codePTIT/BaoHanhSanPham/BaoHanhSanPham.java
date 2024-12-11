package codePTIT.BaoHanhSanPham;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class BaoHanhSanPham {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = sc.nextInt();
        HashMap<String, SanPham> hm = new HashMap<>();
        while (t-- > 0) {
            sc.nextLine();
            String msp = sc.nextLine();
            String ten = sc.nextLine();
            long gia = sc.nextLong();
            long baoHanh = sc.nextLong();
            SanPham x = new SanPham(msp, ten, gia, baoHanh);
            hm.put(x.getMsp(), x);
        }

        int n = sc.nextInt();
        ArrayList<KhachHang> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            sc.nextLine();
            String hoTen = sc.nextLine();
            String diaChi = sc.nextLine();
            SanPham sanPham = hm.get(sc.next());
            int soLuong = sc.nextInt();
            String ngayMua = sc.next();
            list.add(new KhachHang(hoTen, diaChi, sanPham, soLuong, ngayMua));
        }
        Collections.sort(list);
        for(KhachHang khachHang : list) {
            System.out.println(khachHang);
        }
    }
}
