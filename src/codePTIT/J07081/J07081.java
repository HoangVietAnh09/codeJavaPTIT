package codePTIT.J07081;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07081 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String sdt = sc.nextLine();
            String email = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, sdt, email));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }
    }
}
