package codePTIT.ThucHanh;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class B9 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            String gioiTinh = sc.nextLine();
            SinhVien sinhVien = new SinhVien(MSV, hoTen, lop, email, sdt, gioiTinh);
            list.add(sinhVien);
        }
        Collections.sort(list);

        Scanner sc1 = new Scanner(new File("DANGKY.in"));
        Map<String, String> mp = new HashMap<>();
        while(sc1.hasNext()){
            String MSV = sc1.next();
            String size = sc1.next();
            mp.put(MSV, size);
        }
        for(Map.Entry<String, String> entry : mp.entrySet()){
            for(int i = 0; i < list.size(); i++){
                if(list.get(i).getMSV().equals(entry.getKey())){
                    list.get(i).setSize(entry.getValue());
                }
            }
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        sc = new Scanner(new File("TRUYVAN.in"));
        t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String gioiTinh = sc.next();
            String size = sc.next();
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gioiTinh.toUpperCase(), size);
            for(int i = 0; i < list.size(); i++){
                if(gioiTinh.equals(list.get(i).getGioiTinh()) && size.equals(list.get(i).getSize())){
                    System.out.println(list.get(i));
                }
            }
        }



    }
}
