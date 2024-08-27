package codePTIT.J05024;

import java.util.ArrayList;
import java.util.Scanner;


public class J05024 {
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
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String query = sc.nextLine().toUpperCase();
            String tmp = "DC" + query.split("\\s+")[0].substring(0,1) + query.split("\\s+")[1].substring(0,1);
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", query);
            for(SinhVien sv : list) {
                if(sv.getMSV().contains(tmp)){
                    if(tmp.equals("DCCN") || tmp.equals("DCAT")){
                        if(!sv.getLop().substring(0,1).equals("E")){
                            System.out.println(sv);
                        }
                    }else{
                        System.out.println(sv);
                    }
                }
            }
        }
    }
}
