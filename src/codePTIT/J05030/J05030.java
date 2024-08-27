package codePTIT.J05030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());
            list.add(new BangDiem(MSV, hoTen, lop, diem1, diem2, diem3));
        }
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            list.get(i).setThuTu(Integer.toString(i+1));
            System.out.println(list.get(i));
        }
    }
}
