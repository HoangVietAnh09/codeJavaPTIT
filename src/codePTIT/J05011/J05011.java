package codePTIT.J05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String MKH = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            list.add(new KhachHang(MKH, hoTen, gioVao, gioRa));
        }
        Collections.sort(list);
        for (KhachHang khachHang : list) {
            System.out.println(khachHang);
        }

    }
}
