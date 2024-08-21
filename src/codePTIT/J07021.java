package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String word = sc.nextLine();
            if (word.equals("END")) {
                break;
            }
            String[] words = word.trim().split("\\s+");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
            System.out.println(String.join(" ", words));
        }


    }
}
