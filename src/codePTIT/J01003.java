package codePTIT;

import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("VSN");
            }else{
                System.out.println("VN");
            }
        }else{
            System.out.println(String.format("%.2f", -b/a));
        }
    }
}
