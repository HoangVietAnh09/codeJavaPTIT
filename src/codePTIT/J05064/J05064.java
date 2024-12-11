package codePTIT.J05064;

import java.util.ArrayList;
import java.util.Scanner;


public class J05064 {
    public static int count(GiaoVien gv, ArrayList<GiaoVien> list) {
        String tmp = gv.getMGV().substring(0,2);
        int cnt = 0;
        for(GiaoVien t : list){
            if(t.getMGV().startsWith(tmp)) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> list = new ArrayList<>();
        while (t-- > 0) {
            String MGV = sc.nextLine();
            String hoTen = sc.nextLine();
            long luongCoBan = Long.parseLong(sc.nextLine());
            GiaoVien gv = new GiaoVien(MGV, hoTen, luongCoBan);
            if(gv.getMGV().startsWith("HT") && count(gv, list) == 1 || gv.getMGV().startsWith("HP") && count(gv, list) == 2) continue;
            list.add(new GiaoVien(MGV, hoTen, luongCoBan));
        }
        for (GiaoVien g : list) {
            System.out.println(g);
        }
    }
}
