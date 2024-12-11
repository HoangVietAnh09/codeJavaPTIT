package codePTIT.J07071;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07071 {
    public static boolean check(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '*') continue;
            if(s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<DoiTuong> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            list.add(new DoiTuong(hoTen));
        }
        Collections.sort(list);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0) {
            String query = sc.next();
            String[] tmp = query.split("\\.");
            String tp = "";
            for(int i = 0; i < tmp.length; i++) {
                tp += tmp[i];
            }
            for(DoiTuong doiTuong : list) {
                if(check(tp, doiTuong.getVietTat())){
                    System.out.println(doiTuong);
                }
            }
        }
    }
}
