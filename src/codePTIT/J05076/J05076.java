package codePTIT.J05076;

import java.util.*;

public class J05076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Hang> list1 = new ArrayList<>();
        while (t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String xepLoai = sc.nextLine();
            list1.add(new Hang(ma, ten, xepLoai));
        }
        ArrayList<Hang> res = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        Set<String> st = new HashSet<>();
        while (m-- > 0) {
            String ma = sc.next();
            long soLuongNhap = sc.nextLong();
            long giaNhap = sc.nextLong();
            long soLuongXuat = sc.nextLong();
            ThongKe thongKe = new ThongKe(ma, soLuongNhap, giaNhap, soLuongXuat);
            for(Hang hang : list1) {
                if(hang.getMa().equals(ma)){
                    if(st.contains(ma)) {
                        Hang hangMoi = new Hang(hang.getMa(), hang.getTen(), hang.getXepLoai());
                        hangMoi.setThongKe(thongKe);
                        res.add(hangMoi);
                    }else{
                        st.add(ma);
                        hang.setThongKe(thongKe);
                        res.add(hang);
                    }
                }
            }
        }
        for(Hang hang : res) {
            System.out.println(hang);
        }


    }
}
