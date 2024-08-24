package codePTIT.J07059;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class J07059 {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\CATHI.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> list = new ArrayList<CaThi>();
        for (int i = 0; i < t; i++) {
            String date = sc.nextLine();
            String time = sc.nextLine();
            String phong = sc.nextLine();
            list.add(new CaThi(date, time, phong));
        }
        Collections.sort(list);
        for(CaThi caThi : list) {
            System.out.println(caThi);
        }
    }
}
