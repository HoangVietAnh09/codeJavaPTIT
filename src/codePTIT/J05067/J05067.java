package codePTIT.J05067;

import java.util.ArrayList;
import java.util.Scanner;

public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> list = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            String MDH = sc.next();
            long soLuong = sc.nextLong();
            list.add(new DonHang(MDH, soLuong));
        }
        for (DonHang donHang : list) {
            System.out.println(donHang);
        }
    }
}
