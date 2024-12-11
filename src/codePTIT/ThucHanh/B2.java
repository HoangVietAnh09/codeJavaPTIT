package codePTIT.ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class B2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<String> list1 = (ArrayList<String>) ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Set<String> st = new TreeSet<>();
        for (String s : list1) {
            for (Integer i : list2) {
                String res = "";
                res = s + i;
                st.add(res);
            }
        }
        for(String x : st){
            System.out.println(x);
        }
    }
}
