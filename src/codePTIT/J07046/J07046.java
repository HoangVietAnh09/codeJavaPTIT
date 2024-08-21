package codePTIT.J07046;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;


public class J07046 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Khach> list = new ArrayList<>(t);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < t; i++) {
            String hoTen = sc.nextLine();
            String maPhong = sc.nextLine();
            Date ngayDen = sdf.parse(sc.nextLine());
            Date ngayDi = sdf.parse(sc.nextLine());
            Khach khach = new Khach(hoTen, maPhong, ngayDen, ngayDi);
            list.add(khach);
        }
        Collections.sort(list);
        for (Khach khach : list) {
            System.out.println(khach);
        }
    }
}
