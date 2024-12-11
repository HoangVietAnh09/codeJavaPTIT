package codePTIT.J05057;

import java.util.ArrayList;
import java.util.Scanner;



public class J05057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> list = new ArrayList<>();
        while (t-- > 0) {
            String MTS = sc.nextLine();
            String hoTen = sc.nextLine();
            double toan = Double.parseDouble(sc.nextLine());
            double ly = Double.parseDouble(sc.nextLine());
            double hoa = Double.parseDouble(sc.nextLine());
            list.add(new ThiSinh(MTS,hoTen,toan,ly,hoa));
        }
        for(ThiSinh thiSinh : list){
            System.out.println(thiSinh);
        }
    }
}
