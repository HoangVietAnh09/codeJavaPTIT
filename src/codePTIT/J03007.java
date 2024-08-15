package codePTIT;

import java.util.Scanner;

public class J03007 {
    public static boolean checkReverse(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static boolean checkStartEnd(String s){
        return s.charAt(0) == '8' && s.charAt(s.length()-1) == '8';
    }
    public static boolean checkSum(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i)-'0';
        }
        return sum%10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String res = checkReverse(s) && checkStartEnd(s) && checkSum(s) ? "YES" : "NO";
            System.out.println(res);

        }
    }
}
