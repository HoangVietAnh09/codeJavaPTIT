package codePTIT;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07032 {
    public static boolean check(String s){
        if(s.length() == 1 ||s.length()%2 == 0) return false;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) - '0')%2 == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Map<Integer, Integer> map1 = new TreeMap<>();
        for(Integer i : list1){
            if(list2.contains(i) && check(String.valueOf(i))){
                if(!map1.containsKey(i)){
                    map1.put(i, 1);
                }else{
                    map1.put(i, map1.get(i) + 1);
                }
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : map1.entrySet()){
            if(cnt < 10){
                System.out.println(entry.getKey() + " " + entry.getValue());
                cnt++;
            }
        }
    }
}
