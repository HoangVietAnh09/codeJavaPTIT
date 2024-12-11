package codePTIT.J07074;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07074 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        while (t-- > 0) {
            String MM = sc.nextLine();
            String tenMon = sc.nextLine();
            int soTin = Integer.parseInt(sc.nextLine());
            list.add(new MonHoc(MM, tenMon, soTin));
        }
        Scanner sc1 = new Scanner(new File("LICHGD.in"));
        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<MonHoc> list2 = new ArrayList<>();

        while (n-- > 0) {
            String MM = sc1.nextLine();
            int thu = Integer.parseInt(sc1.nextLine());
            int kip = Integer.parseInt(sc1.nextLine());
            String hoTenGiangVien = sc1.nextLine();
            String phongHoc = sc1.nextLine();
            LopHoc lopHoc = new LopHoc(MM, hoTenGiangVien, phongHoc, thu, kip);
            for(MonHoc monHoc : list) {
                if(lopHoc.getMM().equals(monHoc.getMMH())){
                    list2.add(new MonHoc(monHoc.getMMH(), monHoc.getTenMonHoc(), monHoc.getSoTin(), lopHoc));
                }
            }
        }


        String query = sc1.nextLine();
        String q = null;
        for(MonHoc monHoc : list) {
            if(monHoc.getMMH().equals(query)){
                q = monHoc.getTenMonHoc();
            }
        }
        Collections.sort(list2);
        System.out.printf("LICH GIANG DAY MON %s:\n", q);
        for(MonHoc monHoc : list2) {
            if(monHoc.getMMH().equals(query)){
                System.out.println(monHoc);
            }
        }


    }
}
