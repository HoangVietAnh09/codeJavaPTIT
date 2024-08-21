package codePTIT.J07048;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J07048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String MSP = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int baoHanh = Integer.parseInt(sc.nextLine());
            list.add(new SanPham(MSP, ten, gia, baoHanh));
        }
        Collections.sort(list);
        for(SanPham sanPham : list){
            System.out.println(sanPham);
        }
    }
}
