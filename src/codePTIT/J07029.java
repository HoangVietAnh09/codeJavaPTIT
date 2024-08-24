package codePTIT;

import java.io.*;
import java.util.*;

public class J07029 {
    public static boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>(10005);
        for(Integer i : list){
            if(prime(i)){
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else{
                    map.put(i,1);
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i : map.keySet()){
            al.add(i);
        }
        Collections.sort(al, Collections.reverseOrder());
        for(int i = 0; i < 10; i++){
            System.out.println(al.get(i) + " " + map.get(al.get(i)));
        }

    }
}
