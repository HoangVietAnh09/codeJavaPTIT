package codePTIT.J07057;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07057 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String hoTen = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            String danToc = sc.nextLine();
            int khuVuc = Integer.parseInt(sc.nextLine());
            list.add(new ThiSinh(hoTen, danToc, diem, khuVuc));
        }
        Collections.sort(list);
        for(ThiSinh thiSinh : list){
            System.out.println(thiSinh);
        }
    }
}
