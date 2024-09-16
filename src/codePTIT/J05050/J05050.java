package codePTIT.J05050;

import java.util.ArrayList;
import java.util.Scanner;


public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> list = new ArrayList<>();
        while (t-- > 0) {
            String LSD = sc.nextLine();
            long soCu = Long.parseLong(sc.nextLine());
            long soMoi = Long.parseLong(sc.nextLine());
            list.add(new KhachHang(LSD, soCu, soMoi));
        }
        for(KhachHang khachHang : list){
            System.out.println(khachHang);
        }
    }
}
