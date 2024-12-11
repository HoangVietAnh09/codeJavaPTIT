package codePTIT.J05074;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J05074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int tmp = t;
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop));
        }
        while(tmp--> 0){
            String MSV = sc.next();
            String diem = sc.next();
            DiemDanh diemDanh = new DiemDanh(MSV, diem);
            for(SinhVien sv : list){
                if(sv.getMSV().equals(MSV)){
                    sv.setDiemDanh(diemDanh);
                }
            }
        }
        for(SinhVien sv : list){
            System.out.println(sv);
        }


    }
}
