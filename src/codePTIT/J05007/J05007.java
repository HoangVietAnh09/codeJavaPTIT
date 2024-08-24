package codePTIT.J05007;



import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;



public class J05007 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String tax = sc.nextLine();
            String ngayKiHopDong = sc.nextLine();
            list.add(new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, tax, ngayKiHopDong));
        }
        Collections.sort(list);
        for (NhanVien nv : list) {
            System.out.println(nv);
        }
    }
}
