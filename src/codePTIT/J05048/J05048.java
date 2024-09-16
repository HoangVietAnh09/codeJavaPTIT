package codePTIT.J05048;

import java.util.ArrayList;
import java.util.Scanner;


public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        while (t-- > 0) {
            String MDH = sc.nextLine();
            long soLuongNhap = Long.parseLong(sc.nextLine());
            list.add(new DonHang(MDH, soLuongNhap));
        }
        for(DonHang dh : list){
            System.out.println(dh);
        }
    }
}
