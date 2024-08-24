package codePTIT;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class J07030 {
    public static boolean prime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for(Integer i : list1){
            if(prime(i)){
                set1.add(i);
            }
        }
        for(Integer i : list2){
            if(prime(i)){
                set2.add(i);
            }
        }
        int target = 1000000;
        for(Integer i : set1){
            if(i*2 < target){
                if(set2.contains(target-i)){
                    System.out.println(i + " " + (target-i));
                }
            }
        }
    }
}
