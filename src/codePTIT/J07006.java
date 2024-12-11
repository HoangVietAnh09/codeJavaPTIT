package codePTIT;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] arr = new int[1004];
        for(Integer i : list){
            arr[i]++;
        }
        for(int i = 0; i < 1004; i++){
            if(arr[i] > 0){
                System.out.println(i + " " + arr[i]);
            }
        }

    }
}
