package codePTIT.J05037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        while (t-- > 0) {
            String donHang = sc.nextLine();
            String donVi = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            list.add(new DonHang(donHang, donVi, donGia, soLuong));
        }
        Collections.sort(list);
        for(DonHang donHang : list){
            System.out.println(donHang);
        }

    }
}
