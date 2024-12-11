package codePTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07023 {
    public static boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static boolean thuanNghich(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        TreeMap<Integer, Integer> ts1 = new TreeMap<>();
        TreeMap<Integer, Integer> ts2 = new TreeMap<>();
        for(Integer i : list1){
            if(prime(i) && thuanNghich(i)){
                if(ts1.containsKey(i)){
                    ts1.put(i, ts1.get(i) + 1);
                }else{
                    ts1.put(i, 1);
                }
            }

        }
        for(Integer i : list2){
            if(prime(i) && thuanNghich(i)){
                if(ts2.containsKey(i)){
                    ts2.put(i, ts2.get(i) + 1);
                }else{
                    ts2.put(i, 1);
                }
            }

        }
        for(Integer i : ts1.keySet()){
            if(ts2.get(i) != null){
                System.out.printf("%d %d %d\n", i, ts1.get(i), ts2.get(i));
            }
        }

    }
}
