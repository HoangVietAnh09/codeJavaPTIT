package codePTIT.J05042;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            String hoTen = sc.nextLine();
            int soBaiDung = sc.nextInt();
            int tongSub = sc.nextInt();
            list.add(new SinhVien(hoTen, soBaiDung, tongSub));
        }
        Collections.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
