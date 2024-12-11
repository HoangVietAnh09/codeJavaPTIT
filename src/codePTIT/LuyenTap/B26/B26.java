package codePTIT.LuyenTap.B26;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class B26 {
    public static void main(String[] args) throws ParseException, IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\MUAHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        while (t-- > 0) {
            String MSP = sc.nextLine();
            String tenSanPham = sc.nextLine();
            long giaBan = Long.parseLong(sc.nextLine());
            long baoHanh = Long.parseLong(sc.nextLine());
            list.add(new SanPham(MSP, tenSanPham, giaBan, baoHanh));
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list1 = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String diaChi = sc.nextLine();
            String MSP = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            String ngayMua = sc.nextLine();

            list1.add(new KhachHang(hoTen, diaChi, MSP, soLuong, ngayMua));
        }
        for(KhachHang khachHang : list1) {
            for(SanPham sanPham : list) {
                if(khachHang.getMSP().equals(sanPham.getMSP())){
                    khachHang.setSanPham(sanPham);
                }
            }
        }
        Collections.sort(list1);
        for(KhachHang khachHang : list1) {
            System.out.println(khachHang);
        }
    }
}
