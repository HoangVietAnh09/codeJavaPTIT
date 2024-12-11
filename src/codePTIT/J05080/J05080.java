package codePTIT.J05080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05080 {
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
        t = Integer.parseInt(sc.nextLine());
        ArrayList<String> list1 = new ArrayList<>();
        while (t-- > 0) {
            String query = sc.nextLine();
            list1.add(query);
        }
        Collections.sort(list);
        for(String str : list1) {
            System.out.printf("Danh sach cho giang vien %s:\n", str);
            for(LopHoc lop : list) {
                if(str.equals(lop.getGiangVien())){
                    System.out.println(lop);
                }
            }
        }

    }
}
