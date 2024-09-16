package codePTIT.J05051;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05051 {
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
        Collections.sort(list);
        for(KhachHang khachHang : list){
            System.out.println(khachHang);
        }
    }
}
