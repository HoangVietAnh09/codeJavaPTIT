package codePTIT.ThucHanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class B5 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arr = (ArrayList<String>) obj.readObject();

        ArrayList<String> arr1 = new ArrayList<>();
        for(String x:arr) {
            String k[] =x.split("\\s+");
            for(String v:k) {
                arr1.add(v);
            }
        }
        TreeSet<Integer> te =new TreeSet<>();
        for(String x:arr1) {
            try {
                int n =Integer.parseInt(x);
                te.add(n);
            } catch (Exception e) {

            }
        }
        for(int x:te) {
            System.out.println(x);
        }
    }
}