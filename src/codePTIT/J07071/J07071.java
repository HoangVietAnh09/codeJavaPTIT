package codePTIT.J07071;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07071 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DANHSACH.in"));
        int t = sc.nextInt();
        ArrayList<DoiTuong> list = new ArrayList<>();
        while (t-- > 0) {
            String ho = sc.nextLine();
            String dem = sc.nextLine();
            String ten = sc.nextLine();
            list.add(new DoiTuong(ho, dem, ten));
        }
        int q = sc.nextInt();
        while(q-- > 0) {
            String query = sc.next();
            String t1 = query.split("\\.|\\*")[0];
            String t2 = query.split("\\.|\\*")[1];
            for(DoiTuong doiTuong : list) {
                if(t1.equals(doiTuong.getHo().substring(0,1)) && t2.equals(doiTuong.getDem().substring(0,1))){
                    System.out.println(doiTuong);
                }
            }
        }
    }
}
