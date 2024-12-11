package codePTIT.ThucHanh3.B3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop, email, sdt));
        }
        Collections.sort(list);
        for(SinhVien sv : list){
            System.out.println(sv);
        }

    }
}
