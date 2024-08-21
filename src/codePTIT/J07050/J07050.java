package codePTIT.J07050;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            list.add(new MatHang(ten, nhom, giaMua, giaBan));
        }
        Collections.sort(list);
        for(MatHang hang : list){
            System.out.println(hang);
        }
    }
}
