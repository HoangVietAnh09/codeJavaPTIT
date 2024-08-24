package codePTIT.J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            list.add(new MatHang(ten, nhom, giaMua, giaBan));
        }
        Collections.sort(list);
        for(MatHang hang : list) {
            System.out.println(hang);
        }
    }
}
