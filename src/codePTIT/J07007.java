package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\DATA.in"));
        Set<String> st = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            st.add(s);
        }
        for(String s : st){
            System.out.println(s);
        }

    }
}
