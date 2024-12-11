package codePTIT.LuyenTap.B25;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B25 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int t1 = Integer.parseInt(sc1.nextLine());
        ArrayList<SinhVien> list1 = new ArrayList<>();
        while (t1-- > 0) {
            String MSV = sc1.nextLine();
            String hoTen = sc1.nextLine();
            String sdt = sc1.nextLine();
            String email = sc1.nextLine();
            list1.add(new SinhVien(MSV, hoTen, sdt, email));
        }
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        int t2 = Integer.parseInt(sc2.nextLine());
        ArrayList<DeTai> list2 = new ArrayList<>();
        while (t2-- > 0) {
            String giangVien = sc2.nextLine();
            String tenDeTai = sc2.nextLine();
            list2.add(new DeTai(giangVien, tenDeTai));
        }
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        int t3 = sc3.nextInt();;
        ArrayList<HoiDong> list3 = new ArrayList<>();
        while (t3-- > 0) {
            String MSV = sc3.next();
            String MDT = sc3.next();
            String MHD = sc3.next();
            list3.add(new HoiDong(MSV, MDT, MHD));
        }
        for(HoiDong hd : list3){
            for(SinhVien sv : list1){
                if(sv.getMSV().equals(hd.getMSV())){
                    for(DeTai dt : list2){
                        if(dt.getMDT().equals(hd.getMDT())){
                            sv.setDeTai(dt);
                        }
                    }
                    hd.setSinhVien(sv);
                }
            }
        }
        Collections.sort(list3);
        int count = 0;
        for(int i = 1; i <= 8; i++){
            if(count != list3.size()){
                System.out.printf("DANH SACH HOI DONG %d:\n", i);
                for(HoiDong hd : list3){
                    if(hd.getMHD().substring(2,3).equals(Integer.toString(i))){
                        System.out.println(hd);
                        count++;
                    }
                }
            }

        }



    }
}
