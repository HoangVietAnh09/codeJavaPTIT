package codePTIT.J05021;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();
        while (sc.hasNext()) {
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
