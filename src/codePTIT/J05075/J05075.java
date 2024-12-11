package codePTIT.J05075;


import java.util.ArrayList;
import java.util.Scanner;

public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int tmp = t;
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            list.add(new SinhVien(MSV, hoTen, lop));
        }
        while(tmp--> 0){
            String MSV = sc.next();
            String diem = sc.next();
            DiemDanh diemDanh = new DiemDanh(MSV, diem);
            for(SinhVien sv : list){
                if(sv.getMSV().equals(MSV)){
                    sv.setDiemDanh(diemDanh);
                }
            }
        }
        String query = sc.next();
        for(SinhVien sv : list){
            if(sv.getLop().equals(query))
                System.out.println(sv);
        }


    }
}
