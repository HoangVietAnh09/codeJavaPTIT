package codePTIT.ThucHanh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        while (t-- > 0) {
            String MSP = sc.nextLine();
            String ten = sc.nextLine();
            int giaBan = Integer.parseInt(sc.nextLine());
            int thoiHan = Integer.parseInt(sc.nextLine());
            SanPham sanPham = new SanPham(MSP, ten, giaBan, thoiHan);
            list.add(sanPham);
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list1 = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String diaChi = sc.nextLine();
            String msp = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            String ngayMua = sc.nextLine();
            for(SanPham sanPham : list){
                if(sanPham.getMSP().equals(msp)){
                    list1.add(new KhachHang(hoTen, diaChi, msp, soLuong, ngayMua, sanPham));
                }
            }
        }
        Collections.sort(list1);
        for(KhachHang khachHang : list1){
            System.out.println(khachHang);
        }

    }
}
