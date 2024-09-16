package codePTIT.J05054;

import java.util.*;

public class J05054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> list = new ArrayList<>();
        ArrayList<HocSinh> clone = new ArrayList<>();
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            double diemTrungBinh = Double.parseDouble(sc.nextLine());
            list.add(new HocSinh(hoTen, diemTrungBinh));
        }
        int cnt = 1;
        Collections.sort(clone);
        for(HocSinh hocSinh : list) {
            for(HocSinh rec : clone){
                if(hocSinh.getDiemTrungBinh() == rec.getDiemTrungBinh()) {
                    hocSinh.setThuTu(cnt++);
                    break;
                }
            }
        }
        for(HocSinh hocSinh : list) {
            System.out.println(hocSinh);
        }
    }
}
