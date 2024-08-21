package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07002 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String s = sc.next();
            try{
                sum += Integer.parseInt(s);
            }catch(Exception e){

            }
        }
        System.out.println(sum);
    }
}
