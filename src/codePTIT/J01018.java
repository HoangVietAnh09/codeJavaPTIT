package codePTIT;

import java.util.Scanner;

public class J01018 {
    public static boolean check1(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += s.charAt(i)-'0';
        }
        return sum%10 == 0;
    }
    public static boolean check2(String s){
        for(int i=0;i<s.length()-2;i++){
            if(Math.abs(s.charAt(i)-s.charAt(i+1)) != 2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            String s = sc.next();
            String res = check1(s) && check2(s) ? "YES" : "NO";
            System.out.println(res);
        }
    }
}
