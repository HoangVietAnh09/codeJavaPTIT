package codePTIT.J07058;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07058 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String ma = sc.nextLine();
            String mon = sc.nextLine();
            String hinhThuc = sc.nextLine();
            list.add(new MonHoc(ma,mon,hinhThuc));
        }
        Collections.sort(list);
        for(MonHoc mh : list){
            System.out.println(mh);
        }


    }

}
