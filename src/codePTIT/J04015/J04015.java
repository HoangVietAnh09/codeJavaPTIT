package codePTIT.J04015;

import java.util.Scanner;


public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String hoTen = sc.nextLine();
        int luong = sc.nextInt();
        GiaoVien giaoVien = new GiaoVien(id, hoTen, luong);
        System.out.println(giaoVien);
    }
}
