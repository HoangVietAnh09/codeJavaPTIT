package codePTIT.ThucTapCoSo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ThucTapCoSo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String msv = sc.nextLine();
            String hoTen = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(msv, hoTen, sdt, email));
        }

        Scanner sc2 = new Scanner(new File("NHIEMVU.in"));
        int m = Integer.parseInt(sc2.nextLine());
        HashMap<String, String> hm2 = new HashMap<>();
        for(int i = 0; i < m; i++){
            String msv = sc2.next();
            String mdt = sc2.next();
            hm2.put(msv, mdt);
        }



        Scanner sc1 = new Scanner(new File("DETAI.in"));
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, String> hm1 = new HashMap<>();
        int n = Integer.parseInt(sc1.nextLine());
        for(int i = 0; i < n; i++){
            String giangVien = sc1.nextLine();
            String deTai = sc1.nextLine();
            DeTai x = new DeTai(giangVien, deTai);
            hm.put(x.getMdt(), x.getTenDeTai());
            hm1.put(x.getTenDeTai(), x.getTenGiangVien());
        }



        for(SinhVien sv : list){
            String mdt = hm2.get(sv.getMsv());
            String tenDeTai = hm.get(mdt);
            String tenGiangVien = hm1.get(tenDeTai);
            sv.setDeTai(new DeTai(tenGiangVien, tenDeTai));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }


    }
}
