package codePTIT.J05026;

import java.util.ArrayList;
import java.util.Scanner;



public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiangVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String khoa = sc.nextLine();
            list.add(new GiangVien(hoTen, khoa));
        }
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String query = sc.nextLine();
            String[] words = query.split("\\s+");
            String tmp = "";
            for (int i = 0; i < words.length; i++) {
                tmp += words[i].substring(0,1).toUpperCase();
            }
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", tmp);
            for(GiangVien gv : list) {
                if(gv.getKhoa().equals(tmp)){
                    System.out.println(gv);
                }
            }
        }
    }
}
