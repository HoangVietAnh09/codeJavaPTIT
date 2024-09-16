package codePTIT.J05049;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DonHang> list = new ArrayList<>();
        while (t-- > 0) {
            String MDH = sc.nextLine();
            long soLuongNhap = Long.parseLong(sc.nextLine());
            list.add(new DonHang(MDH, soLuongNhap));
        }
        Collections.sort(list);
        String query = sc.nextLine();
        for(DonHang dh : list){
            if(dh.getMDH().substring(0,1).equals(query)){
                System.out.println(dh);
            }
        }
    }
}
