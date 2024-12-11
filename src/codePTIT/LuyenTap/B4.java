package codePTIT.LuyenTap;

import java.math.BigInteger;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            BigInteger tich = new BigInteger("1");
            BigInteger tong = new BigInteger("0");
            for (int i = 0; i < s.length(); i++) {
                if(i%2 == 0){
                    if(s.charAt(i) != '0'){
                        tich = tich.multiply(BigInteger.valueOf(s.charAt(i)-'0'));
                    }
                }else{
                    tong = tong.add(BigInteger.valueOf(s.charAt(i)-'0'));
                }
            }
            System.out.println(tich + " " + tong);
        }
    }
}
