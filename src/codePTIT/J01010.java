package codePTIT;

import java.util.Scanner;

public class J01010 {
    public static long solve(String s){
        long res = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                res = res*10 + 1;
            }else if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                res = res*10;
            }else{
                return 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            long result = solve(s);
            if(result == 0){
                System.out.println("INVALID");
            }else{
                System.out.println(result);
            }
        }
    }
}
