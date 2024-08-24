package codePTIT;

import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        Set<String> st = new TreeSet<>();
        for(String s : list){
            String[] words = s.trim().toLowerCase().split("\\s+");
            st.addAll(Arrays.asList(words));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            if(st.contains(s)){
                System.out.println(s);
                st.remove(s);
            }
        }
    }
}
