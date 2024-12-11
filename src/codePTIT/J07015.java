package codePTIT;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class J07015 {
    public static boolean prime(int n){
    for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> map = new HashMap<>(10005);
        for(Integer i : list){
            if(prime(i)){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                }else{
                    map.put(i, 1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}