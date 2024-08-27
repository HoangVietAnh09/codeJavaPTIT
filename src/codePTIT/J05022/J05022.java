package codePTIT.J05022;

import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {
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
        for(int i = 0; i < q; i++) {
            String query = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + query + ":");
            for(int j = 0; j < list.size(); j++) {
                if(query.equals(list.get(j).getLop())){
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
