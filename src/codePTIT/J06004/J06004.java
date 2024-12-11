package codePTIT.J06004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class J06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String MSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String sdt = sc.nextLine();
            int thuTu = sc.nextInt();
            list.add(new SinhVien(MSV, hoTen, sdt, thuTu));
        }
        Collections.sort(list);
        sc.nextLine();
        HashMap<Integer, String> hm = new HashMap<>();
        for(int i = 1; i <= m; i++) {
            String deTai = sc.nextLine();
            hm.put(i, deTai);
        }
        for(SinhVien sv : list) {
            System.out.println(sv + " " + hm.get(sv.getThuTu()));
        }

    }
}
