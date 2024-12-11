package codePTIT.LuyenTap;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long max = (long) -1E12;
        String res = "";
        while (sc.hasNextLine()) {
            String[] words = sc.nextLine().split(" ");
            for(String word : words) {
                if(word.length() > max) {
                    max = word.length();
                    res = word;
                }
            }
        }
        System.out.println(res + " - " + res.length());
    }
}
