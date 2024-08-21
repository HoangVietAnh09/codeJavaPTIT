package codePTIT.J04005;

import java.util.Scanner;


public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();
        ThiSinh thiSinh = new ThiSinh(hoTen, ngaySinh, m1, m2, m3);
        System.out.println(thiSinh);
    }

}
