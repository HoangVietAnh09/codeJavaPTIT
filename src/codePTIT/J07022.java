package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DATA.in"));
        ArrayList<String> list = new ArrayList<String>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int n = Integer.valueOf(s);
            } catch (NumberFormatException e) {
                list.add(s);
            }
        }
        Collections.sort(list);
        for(String s : list){
            System.out.print(s + " ");
        }
    }
}
