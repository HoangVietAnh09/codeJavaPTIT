package codePTIT.J05077;


import java.util.ArrayList;
import java.util.Scanner;

public class J05077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Phong> list1 = new ArrayList<>();
        while (t-- > 0) {
            String MP = sc.next();
            String tenPhong = sc.nextLine();
            list1.add(new Phong(MP, tenPhong));
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> list2 = new ArrayList<>();
        while (t-- > 0) {
            String MNV = sc.nextLine();
            String hoTen = sc.nextLine();
            long luongCoBan= Long.parseLong(sc.nextLine());
            long soNgayCong = Long.parseLong(sc.nextLine());
            NhanVien nhanVien = new NhanVien(MNV, hoTen, luongCoBan, soNgayCong);
            for(Phong p : list1){
                if(MNV.substring(3).equals(p.getMP())){
                    nhanVien.setPhong(p);
                    list2.add(nhanVien);
                }
            }

        }
        for(NhanVien nv : list2){
            System.out.println(nv);
        }

    }
}
