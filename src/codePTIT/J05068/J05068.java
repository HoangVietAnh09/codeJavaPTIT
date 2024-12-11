package codePTIT.J05068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DonHang> list = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            String MDH = sc.next();
            long soLuong = sc.nextLong();
            list.add(new DonHang(MDH, soLuong));
        }
        Collections.sort(list);
        for (DonHang donHang : list) {
            System.out.println(donHang);
        }
    }
}
