package codePTIT.J07051;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J07051 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\KHACHHANG.in"));
        ArrayList<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String name = sc.nextLine();
            String phong = sc.nextLine();
            String ngayNhan = sc.nextLine();
            String ngayTra = sc.nextLine();
            int phiDichVu = Integer.parseInt(sc.nextLine());
            list.add(new KhachHang(name, phong, ngayNhan, ngayTra, phiDichVu));
        }
        Collections.sort(list);
        for(KhachHang khachHang : list){
            System.out.println(khachHang);
        }

    }
}
