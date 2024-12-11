package codePTIT.ThucHanh3.B2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t -- >0){
            String MNV = sc.nextLine();
            String NV = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            list.add(new NhanVien(MNV, NV, gioVao, gioRa));
        }
        Collections.sort(list);
        for(NhanVien nv : list){
            System.out.println(nv);
        }

    }
}
