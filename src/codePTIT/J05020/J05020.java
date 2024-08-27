package codePTIT.J05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop, email));
        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
