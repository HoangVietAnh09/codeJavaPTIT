package codePTIT.LuyenTap;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.next();
            String res = "";
            TreeMap<Character, Integer> map = new TreeMap<>();
            long sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= '0' &&  s.charAt(i) <= '9') {
                    sum += s.charAt(i) - '0';
                }else{
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i), map.get(s.charAt(i))+1);
                    }else{
                        map.put(s.charAt(i), 1);
                    }
                }
            }
            for(Map.Entry<Character, Integer> m : map.entrySet()) {
                for(int i = 1; i <= m.getValue(); i++){
                    res += m.getKey();
                }
            }
            res += String.valueOf(sum);
            System.out.println(res);

        }
    }
}
