package codePTIT.J05027;

import java.util.ArrayList;
import java.util.Scanner;



public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String boMon = sc.nextLine();
            list.add(new GiangVien(hoTen, boMon));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String query = sc.nextLine();
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA %s:\n", query.toLowerCase());
            for(GiangVien giangVien : list) {
                if(giangVien.getHoTen().toLowerCase().contains(query)) {
                    System.out.println(giangVien);
                }
            }
        }
    }
}
