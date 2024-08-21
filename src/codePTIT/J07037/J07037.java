package codePTIT.J07037;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07037 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> list = new ArrayList<>(t);
        for(int i = 0; i < t; i++){
            String MDN = sc.nextLine();
            String ten = sc.nextLine();
            int soSinhVien = Integer.parseInt(sc.nextLine());
            DoanhNghiep doanhNghiep = new DoanhNghiep(MDN, ten, soSinhVien);
            list.add(doanhNghiep);
        }
        Collections.sort(list);
        for(DoanhNghiep doanhNghiep : list){
            System.out.println(doanhNghiep);
        }

    }
}
