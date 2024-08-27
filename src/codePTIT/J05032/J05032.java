package codePTIT.J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;



public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Nguoi> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.next();
            String ngaySinh = sc.nextLine();
            list.add(new Nguoi(hoTen, ngaySinh));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.get(0));
    }
}
