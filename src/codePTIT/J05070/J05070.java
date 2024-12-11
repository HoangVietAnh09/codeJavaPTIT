package codePTIT.J05070;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Doi> list1 = new ArrayList<>();
        while (t-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long giaVe = Long.parseLong(sc.nextLine());
            list1.add(new Doi(ma, ten, giaVe));
        }
        t = sc.nextInt();
        ArrayList<TranDau> list2 = new ArrayList<>();
        while (t-- > 0) {
            String MT = sc.next();
            long soCoDongVien = Long.parseLong(sc.next());
            TranDau tranDau = new TranDau(MT, soCoDongVien);
            for(Doi doi : list1) {
                if(doi.getMa().equals(tranDau.getMTD().substring(1,3))){
                    tranDau.setDoi(doi);
                    list2.add(tranDau);
                }
            }
        }
        Collections.sort(list2);
        for(TranDau tranDau : list2) {
            System.out.println(tranDau);
        }
    }
}
