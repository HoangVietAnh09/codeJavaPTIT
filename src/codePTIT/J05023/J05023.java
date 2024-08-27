package codePTIT.J05023;


import java.util.ArrayList;
import java.util.Scanner;


public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop, email));
        }
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String khoa = sc.next();
            System.out.printf("DANH SACH SINH VIEN KHOA %d:\n", Integer.parseInt(khoa));
            for (int j = 0; j < list.size(); j++) {
                if(khoa.substring(2,4).equals(list.get(j).getLop().substring(1,3))){
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
