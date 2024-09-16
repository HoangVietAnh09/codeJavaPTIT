package codePTIT.J04013;

import java.util.Scanner;



public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String MTS = sc.nextLine();
        String hoTen = sc.nextLine();
        double toan  = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        ThiSinh thiSinh = new ThiSinh(MTS, hoTen, toan, ly, hoa);
        System.out.println(thiSinh);
    }
}
