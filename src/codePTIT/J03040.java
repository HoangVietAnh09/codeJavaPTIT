package codePTIT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03040 {
    public static boolean check1(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Integer.valueOf(s.charAt(i)) >= Integer.valueOf(s.charAt(i+1))) return false;
        }
        return true;
    }
    public static boolean check2(String s){

        Set<Integer> st = new HashSet<Integer>();
        for(int i=0;i<s.length();i++){
            st.add(Integer.valueOf(s.charAt(i)));
        }
        if(st.size()!=1) return false;
        return true;
    }
    public static boolean check3(String s){
        if(s.charAt(0) != s.charAt(1) || s.charAt(1) != s.charAt(2)) return false;
        if(s.charAt(3) != s.charAt(4)) return false;
        return true;
    }
    public static boolean check4(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String st = sc.nextLine();
            String s = st.substring(5);
            String tmp = s.replace(".", "");
            String res = check1(tmp) || check2(tmp) || check3(tmp) || check4(tmp) ? "YES" : "NO";
            System.out.println(res);
        }
    }
}
