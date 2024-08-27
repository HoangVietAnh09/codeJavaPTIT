package codePTIT.J05029;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String MDN =  sc.nextLine();
            String hoTen = sc.nextLine();
            int soSinhVien = Integer.parseInt(sc.nextLine());
            list.add(new DoanhNghiep(MDN, hoTen, soSinhVien));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for(DoanhNghiep dn : list){
                if(dn.getSoSinhVien() >= a && dn.getSoSinhVien() <= b){
                    System.out.println(dn);
                }
            }
        }
    }
}
