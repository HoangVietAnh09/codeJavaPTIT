package codePTIT.J06003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J06003 {
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
        sc.nextLine();
        HashMap<Integer, String> hm = new HashMap<>();
        for(int i = 1; i <= m; i++) {
            String deTai = sc.nextLine();
            hm.put(i, deTai);
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int query = sc.nextInt();
            System.out.printf("DANH SACH NHOM %s:\n", query);
            for(SinhVien sv : list) {
                if(sv.getThuTu() == query){
                    System.out.println(sv);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n", hm.get(query));
        }

    }
}
