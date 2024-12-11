package codePTIT;

import java.util.Scanner;

public class J01024 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            String res = check(s) ? "YES" : "NO";
            System.out.println(res);
        }
    }
}
