package codePTIT.LuyenTap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class B20 {
    public static boolean isDigit(String word){
        for(int i=0; i<word.length(); i++){
            if(Character.isDigit(word.charAt(i))) return true;
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if(!s.contains(".") && !s.contains(",") && !s.contains("!") && !s.contains("?") && !s.contains(":")) {
                if(isDigit(s)){
                    ts.add(s);
                }
            }
        }
        for(String s : ts){
            System.out.println(s);
        }

    }
}
