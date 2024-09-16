package codePTIT.J05046;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J05046 {
    public static int cnt = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        ArrayList<LoHang> list = new ArrayList<>();
        while (t-- > 0) {
            String ten = sc.nextLine();
            long soLuong = Long.parseLong(sc.nextLine());
            long donGia = Long.parseLong(sc.nextLine());
            list.add(new LoHang(ten, soLuong, donGia));
        }
        for (LoHang hang : list) {
            String tmp = hang.getDonHang().split("\\s+")[0].substring(0,1).toUpperCase() + hang.getDonHang().split("\\s+")[1].substring(0,1).toUpperCase();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
                hang.setMDH(tmp + String.format("%02d", map.get(tmp)));
            }else{
                map.put(tmp, 1);
                hang.setMDH(tmp + String.format("%02d", map.get(tmp)));
            }
        }
        for (LoHang hang : list) {
            System.out.println(hang);
        }
    }
}
