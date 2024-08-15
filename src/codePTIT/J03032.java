package codePTIT;

import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] words = sc.nextLine().split(" ");
            for (int i = 0; i < words.length; i++) {
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    System.out.print(words[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
