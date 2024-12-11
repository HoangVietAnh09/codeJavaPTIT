package codePTIT;

import java.util.Scanner;

public class J03024 {
    public static String checkChan(String s){
        int cnt = 0;
        if(s.length()%2 != 0) return "NO";
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) return "INVALID";
            else{
                if(Character.getNumericValue(s.charAt(i))%2 == 0) cnt++;
                else cnt--;
            }
        }
        if(cnt <= 0) return "NO";
        return "YES";
    }
    public static String checkLe(String s){
        int cnt = 0;
        if(s.length()%2 == 0) return "NO";
        for(int i=0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) return "INVALID";
            else{
                if(Character.getNumericValue(s.charAt(i))%2 != 0) cnt++;
                else cnt--;
            }
        }
        if(cnt <= 0) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if(s.length()%2 == 0){
                System.out.println(checkChan(s));
            }else{
                System.out.println(checkLe(s));
            }

        }
    }
}
