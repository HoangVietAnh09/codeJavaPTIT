package codePTIT;

import java.util.Scanner;

public class J03021 {
    public static String convert(char c){
        c = Character.toUpperCase(c);
        switch (c) {
            case 'A': case 'B': case 'C':
                return "2";
            case 'D': case 'E': case 'F':
                return "3";
            case 'G': case 'H': case 'I':
                return "4";
            case 'J': case 'K': case 'L':
                return "5";
            case 'M': case 'N': case 'O':
                return "6";
            case 'P': case 'Q': case 'R': case 'S':
                return "7";
            case 'T': case 'U': case 'V':
                return "8";
            case 'W': case 'X': case 'Y': case 'Z':
                return "9";
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                res += convert(s.charAt(i));
            }
            if(res.equals(new StringBuffer(res).reverse().toString())){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
