package codePTIT.J05025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String khoa = sc.nextLine();
            list.add(new GiangVien(hoTen, khoa));
        }
        Collections.sort(list);
        for(GiangVien giangVien : list) {
            System.out.println(giangVien);
        }
    }
}
