package codePTIT.J05036;

import java.util.ArrayList;
import java.util.Scanner;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        while (t-- > 0) {
            String donHang = sc.nextLine();
            String donVi = sc.nextLine();
            long giaNhap = Long.parseLong(sc.nextLine());
            long soLuong = Long.parseLong(sc.nextLine());
            list.add(new DonHang(donHang, donVi, giaNhap, soLuong));
        }
        for(DonHang donHang : list){
            System.out.println(donHang);
        }
    }
}
