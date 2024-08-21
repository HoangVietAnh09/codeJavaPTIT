package codePTIT;

import java.util.HashMap;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Boolean> hs = new HashMap<Integer, Boolean>();
        int n = sc.nextInt();
        int max = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            hs.put(x, true);
            max = Math.max(max, x);
        }
        boolean check = false;
        for(int i = 1; i <= max; i++){
            if(!hs.containsKey(i)){
                System.out.println(i);
                check = true;
            }
        }
        if(!check){
            System.out.println("Excellent!");
        }

    }
}
