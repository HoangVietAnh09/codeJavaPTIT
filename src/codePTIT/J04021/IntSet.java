package codePTIT.J04021;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    public static  int[] ex = new int[10004];
    private int[] a;
    Set<Integer> st = new TreeSet<>();
    public IntSet(int[] a){
        for(int i=0;i<a.length;i++){
            st.add(a[i]);
        }

    }

    public static void init(){
        for(int i = 0; i < 10004; i++){
            ex[i] = 0;
        }
    }

    public IntSet union(IntSet s1){
        s1.st.forEach(e -> this.st.add(e));
        return this;
    }

    public String toString(){
        String s = "";
        for(Integer i : st){
            s += i + " ";
        }
        return s;
    }
}
