package codePTIT.J07054;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.*;

public class J07054 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < t; i++) {
            String hoTen = sc.nextLine();
            double diem1 = Double.parseDouble(sc.nextLine());
            double diem2 = Double.parseDouble(sc.nextLine());
            double diem3 = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien(hoTen, diem1, diem2, diem3));
        }
        Collections.sort(list);
        int rank = 1;
        list.get(0).setRank(rank);
        rank++;
        for(int i = 1; i < list.size(); i++) {
            if(list.get(i).getDiemTrungBinh() == list.get(i - 1).getDiemTrungBinh()) {
                list.get(i).setRank(list.get(i-1).getRank());
                rank++;
            }else{
                list.get(i).setRank(rank);
                rank++;
            }
        }
        for(SinhVien sv : list) {
            System.out.println(sv);
        }

    }
}
