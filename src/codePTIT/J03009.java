package codePTIT;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().split("\\s+");
            String[] tokens = sc.nextLine().split("\\s+");
            HashMap<String, Integer> hm = new HashMap<>();
            HashSet<String> hs = new HashSet<>();
            for(int i = 0; i < tokens.length; i++){
                hm.put(tokens[i], 1);
            }
            for(int i = 0; i < words.length; i++){
                if(!hm.containsKey(words[i])){
                    hs.add(words[i]);
                }
            }
            for(String word : hs){
                System.out.print(word + " ");
            }
            System.out.println();

        }
    }
}
