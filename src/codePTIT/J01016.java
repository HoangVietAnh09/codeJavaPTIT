package codePTIT;

import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                cnt++;
            }
        }
        String res = (cnt == 4 || cnt == 7) ? "YES" : "NO";
        System.out.println(res);
    }
}
