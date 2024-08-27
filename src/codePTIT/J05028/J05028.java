package codePTIT.J05028;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        while (t-- > 0) {
            String MDN = sc.nextLine();
            String ten = sc.nextLine();
            int soLuong = Integer.parseInt(sc.nextLine());
            list.add(new DoanhNghiep(MDN, ten, soLuong));
        }
        Collections.sort(list);
        for (DoanhNghiep dn : list) {
            System.out.println(dn);
        }
    }
}
