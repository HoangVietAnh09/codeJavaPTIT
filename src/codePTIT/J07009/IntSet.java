package codePTIT.J07009;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> ts;

    public IntSet(int[] a){
        ts = new TreeSet<>();
        for(int i = 0; i < a.length; i++){
            ts.add(a[i]);
        }
    }
    public IntSet(){
        ts = new TreeSet<>();
    }

    public IntSet intersection(IntSet intSet){
        IntSet res = new IntSet();
        for(Integer i : ts){
            if(intSet.ts.contains(i)){
                res.ts.add(i);
            }
        }
        return res;
    }
    public String toString(){
        String res = "";
        for(Integer i : ts){
            res += i + " ";
        }
        return res;
    }
}
