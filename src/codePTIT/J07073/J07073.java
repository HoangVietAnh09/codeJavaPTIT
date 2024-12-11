package codePTIT.J07073;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J07073 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> list = new ArrayList<>();
        while (t-- > 0) {
            String MMH = sc.nextLine();
            String ten = sc.nextLine();
            int soTin = Integer.parseInt(sc.nextLine());
            String hinhThucLyThuyet = sc.nextLine();
            String hinhThucThucHanh = sc.nextLine();
            list.add(new MonHoc(MMH, ten, hinhThucLyThuyet, hinhThucThucHanh, soTin));
        }
        Collections.sort(list);
        try {
            for(MonHoc mh : list){
                if(mh.getHinhThucThucHanh().equals("Truc tuyen") || mh.getHinhThucThucHanh().endsWith(".ptit.edu.vn")){
                    System.out.println(mh);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
