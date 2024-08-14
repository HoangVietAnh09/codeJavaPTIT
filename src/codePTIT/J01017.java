package codePTIT;

import java.util.Scanner;

public class J01017 {
    public static boolean solve(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs((s.charAt(i)-'0') - (s.charAt(i+1)-'0')) != 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String res = solve(s) ? "YES" : "NO";
            System.out.println(res);

        }
    }
}
