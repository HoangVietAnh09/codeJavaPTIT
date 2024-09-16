package codePTIT.J05053;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        while (t-- > 0) {
            String tenHang = sc.next();
            String loai = sc.nextLine();
            String MDH = sc.nextLine();
            long donGia = Long.parseLong(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());
            list.add(new DonHang(loai, tenHang, MDH, soLuong, donGia));
        }
        Collections.sort(list);
        for (DonHang hang : list) {
            System.out.println(hang);
        }

    }
}
