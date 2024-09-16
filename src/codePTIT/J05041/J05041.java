package codePTIT.J05041;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            long luongNgay = Long.parseLong(sc.nextLine());
            long soNgayCong = Long.parseLong(sc.nextLine());
            String chucVu = sc.nextLine();
            list.add(new NhanVien(hoTen, chucVu, luongNgay, soNgayCong));
        }
        Collections.sort(list);
        for(NhanVien nv : list){
            System.out.println(nv);
        }
    }
}
