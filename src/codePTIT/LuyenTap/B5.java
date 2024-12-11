package codePTIT.LuyenTap;

import java.util.ArrayList;
import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] word = s.split(" ");
            for(int i = word.length - 1; i >= 0; i--) {
                System.out.print(word[i] + " ");
            }
            System.out.println();
        }
    }
}
