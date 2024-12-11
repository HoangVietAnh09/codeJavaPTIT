package codePTIT.J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<LopHoc> list = new ArrayList<>();
        while (t-- > 0) {
            String MLH = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String giangVien = sc.nextLine();
            list.add(new LopHoc(MLH, ten, nhom, giangVien));
        }
        t = sc.nextInt();
        ArrayList<MonHoc> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (t-- > 0) {
            String MMH = sc.next();
            list2.add(MMH);
            for(LopHoc lopHoc : list) {
                if(lopHoc.getMLH().equals(MMH)){
                    MonHoc mh = new MonHoc(MMH, lopHoc);
                    list1.add(mh);
                }
            }
        }
        Collections.sort(list1);
        for(String s : list2) {
            String ten = null;
            for(LopHoc lopHoc : list) {
                if(lopHoc.getMLH().equals(s)){
                    ten = lopHoc.getTen();
                }
            }
            System.out.printf("Danh sach nhom lop mon %s:\n", ten);
            for(MonHoc mh : list1) {
                if(mh.getMMH().equals(s)){
                    System.out.println(mh);
                }
            }
        }

    }
}
