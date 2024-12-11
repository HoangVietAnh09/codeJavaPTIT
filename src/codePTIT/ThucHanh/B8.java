package codePTIT.ThucHanh;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        BigInteger sum = new BigInteger("0");
        BigInteger max = null;
        BigInteger min = null;
        for(int i = 0; i < t; i++){
            BigInteger b = sc.nextBigInteger();

            if(i == 0){
                max = b;
                min = b;
            }
            if(b.compareTo(min) < 0){
                min = b;
            }
            if(b.compareTo(max) > 0){
                max = b;
            }
            sum = sum.add(b);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);

    }
}
