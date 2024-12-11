package codePTIT.LuyenTap.B23;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B23 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String batDau = sc.nextLine();
            String ketThuc = sc.nextLine();
            list.add(new SinhVien(hoTen, batDau, ketThuc));
        }
        Collections.sort(list);
        for(SinhVien sv : list) {
            System.out.println(sv);
        }

    }
}
