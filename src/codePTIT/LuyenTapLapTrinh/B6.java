package codePTIT.LuyenTapLapTrinh;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B6 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            sc.nextLine();
            String hoTen = sc.nextLine();
            int ac = sc.nextInt();
            int submit = sc.nextInt();
            list.add(new SinhVien(hoTen, ac, submit));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
