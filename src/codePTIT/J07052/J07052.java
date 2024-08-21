package codePTIT.J07052;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07052 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String MTS = sc.nextLine();
            String hoTen = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(MTS,hoTen,toan,ly,hoa));
        }

        Collections.sort(list);
        int chiTieu = Integer.parseInt(sc.nextLine());
        double diemChuan = list.get(chiTieu-1).diemTong();
        System.out.println(String.format("%.1f", diemChuan));
        for(ThiSinh thiSinh : list){
            if(thiSinh.diemTong() >= diemChuan){
                thiSinh.setTrangThai("TRUNG TUYEN");
                System.out.println(thiSinh);
            }else{
                thiSinh.setTrangThai("TRUOT");
                System.out.println(thiSinh);
            }
        }
    }
}
