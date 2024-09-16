package codePTIT.J05034;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String doanhNghiep = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop, email, doanhNghiep));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String query = sc.nextLine();
            for(SinhVien sv : list) {
                if(sv.getDoanhNghiep().equals(query)){
                    System.out.println(sv);
                }
            }
        }
    }
}
