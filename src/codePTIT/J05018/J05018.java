package codePTIT.J05018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list = new ArrayList<HocSinh>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            double toan = Double.parseDouble(sc.next());
            double tiengViet = Double.parseDouble(sc.next());
            double ngoaiNgu = Double.parseDouble(sc.next());
            double vatLy = Double.parseDouble(sc.next());
            double hoaHoc = Double.parseDouble(sc.next());
            double sinhHoc = Double.parseDouble(sc.next());
            double lishSu = Double.parseDouble(sc.next());
            double diaLy = Double.parseDouble(sc.next());
            double giaoDucCongDan = Double.parseDouble(sc.next());
            double congNghe = Double.parseDouble(sc.nextLine());
            list.add(new HocSinh(hoTen, toan, tiengViet, ngoaiNgu, vatLy, hoaHoc, sinhHoc, lishSu, diaLy, giaoDucCongDan, congNghe));
        }
        Collections.sort(list);
        for (HocSinh hocSinh : list) {
            System.out.println(hocSinh);
        }
    }
}
