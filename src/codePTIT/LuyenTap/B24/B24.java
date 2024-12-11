package codePTIT.LuyenTap.B24;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B24 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\SINHVIEN.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> list1 = new ArrayList<>();
        while (t1-- > 0) {
            String MSV = sc1.nextLine();
            String hoTen = sc1.nextLine();
            String sdt = sc1.nextLine();
            String email = sc1.nextLine();
            list1.add(new SinhVien(MSV, hoTen, sdt, email));
        }
        Scanner sc2 = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DETAI.in"));
        ArrayList<DeTai> list2 = new ArrayList<>();
        int t2 = Integer.parseInt(sc2.nextLine());
        while(t2-- > 0) {
            String tenGiangVien = sc2.nextLine();
            String tenDeTai = sc2.nextLine();
            list2.add(new DeTai(tenGiangVien, tenDeTai));
        }
        Scanner sc3 = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\NHIEMVU.in"));
        int t3 = sc3.nextInt();
        while(t3-- > 0) {
            String MSV = sc3.next();
            String MDT = sc3.next();
            NhiemVu nv = new NhiemVu(MSV, MDT);
            for(SinhVien sv : list1) {
                if(sv.getMSV().equals(nv.getMSV())){
                    for(DeTai dt : list2) {
                        if(dt.getMDT().equals(nv.getMDT())){
                            sv.setDeTai(dt);
                        }
                    }
                }
            }
        }
        Collections.sort(list1);
        for(SinhVien sv : list1) {
            System.out.println(sv);
        }



    }
}
