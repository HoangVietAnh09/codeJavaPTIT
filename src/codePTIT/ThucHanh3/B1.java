package codePTIT.ThucHanh3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                long tmp = Long.parseLong(s);
                try{
                    int tmp1 = Integer.parseInt(s);
                }catch(Exception e){
                    sum += tmp;
                }

            }catch (Exception e){

            }
        }
        System.out.println(sum);
    }
}
