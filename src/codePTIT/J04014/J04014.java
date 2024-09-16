package codePTIT.J04014;

import java.util.Scanner;



public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long tu1 = sc.nextInt();
            long mau1 = sc.nextInt();
            long tu2 = sc.nextInt();
            long mau2 = sc.nextInt();
            PhanSo ps1 = new PhanSo(tu1, mau1);
            PhanSo ps2 = new PhanSo(tu2, mau2);
            long tu = (ps1.getTu()*ps2.getMau() + ps1.getMau()*ps2.getTu())*(ps1.getTu()*ps2.getMau() + ps1.getMau()*ps2.getTu());
            long mau = ps1.getMau()*ps2.getMau() * ps1.getMau() * ps2.getMau();
            PhanSo ps3 = new PhanSo(tu, mau);
            PhanSo res = ps3.rutGon(ps3);
            System.out.print(res + " ");
            tu = ps1.getTu()*ps2.getTu()*res.getTu();
            mau = ps1.getMau()*ps2.getMau()*res.getMau();
            PhanSo ps4 = new PhanSo(tu, mau);
            PhanSo res2 = ps4.rutGon(ps4);
            System.out.println(res2);
        }
    }
}
