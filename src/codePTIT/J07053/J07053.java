package codePTIT.J07053;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


public class J07053 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double lyThuyet = Double.parseDouble(sc.nextLine());
            double thucHanh = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(hoTen, ngaySinh, lyThuyet, thucHanh));
        }
        for(ThiSinh thiSinh : list){
            System.out.println(thiSinh);
        }
    }
}
