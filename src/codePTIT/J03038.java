package codePTIT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> st = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.substring(i, i + 1));
        }
        System.out.println(st.size());
    }
}
