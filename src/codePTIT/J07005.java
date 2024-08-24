package codePTIT;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class J07005 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.in"));
        Map<Integer, Integer> map = new TreeMap<>();
        while(dis.available()>0){
            int s = dis.readInt();
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, map.get(s)+1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
