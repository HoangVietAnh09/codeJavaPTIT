package codePTIT.J07084;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07084 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThoiGian> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String batDau = sc.nextLine();
            String ketThuc = sc.nextLine();
            list.add(new ThoiGian(hoTen, batDau, ketThuc));
        }
        Collections.sort(list);
        for (ThoiGian thoiGian : list) {
            System.out.println(thoiGian);
        }
    }
}
