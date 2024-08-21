package codePTIT.J07034;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> monHocs = new ArrayList<MonHoc>();
        for (int i = 0; i < t; i++) {
            String MMH = sc.nextLine();
            String ten = sc.nextLine();
            int soTin = Integer.parseInt(sc.nextLine());
            MonHoc mh = new MonHoc(MMH, ten, soTin);
            monHocs.add(mh);
        }
        Collections.sort(monHocs);
        for (MonHoc mh : monHocs) {
            System.out.println(mh);
        }
    }
}
