package codePTIT.J05009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(hoTen, ngaySinh, diem1, diem2, diem3));
        }
        Collections.sort(list);
        double diemTong = list.get(0).getDiemTong();
        for(ThiSinh thiSinh : list) {
            if(thiSinh.getDiemTong() == diemTong) {
                System.out.println(thiSinh);
            }
        }
    }
}
