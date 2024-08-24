package codePTIT.J07056;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07056 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\KHACHHANG.in"));
        ArrayList<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String hoTen = sc.nextLine();
            String thongTin = sc.nextLine();
            list.add(new KhachHang(hoTen, thongTin));
        }
        Collections.sort(list);
        for(KhachHang khachHang : list){
            System.out.println(khachHang);
        }
    }
}
