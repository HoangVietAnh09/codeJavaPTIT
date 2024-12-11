package codePTIT.J05060;

import java.util.ArrayList;
import java.util.Scanner;

public class J05060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double lyThuyet = Double.parseDouble(sc.nextLine());
            double thucHanh = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(hoTen, ngaySinh, lyThuyet, thucHanh));
        }
        for (ThiSinh thiSinh : list) {
            System.out.println(thiSinh);
        }
    }
}
