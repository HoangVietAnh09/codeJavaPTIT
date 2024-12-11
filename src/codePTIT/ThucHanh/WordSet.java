package codePTIT.ThucHanh;

import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private String word;

    public WordSet(String word) {
        this.word = word;
    }

    public String union(WordSet s){
        String[] tmp = s.word.toLowerCase().trim().split("\\s+");
        String[] tmp1 = this.word.toLowerCase().trim().split("\\s+");
        Set<String> set = new TreeSet<>();
        for(String t : tmp){
            set.add(t);
        }
        for(String t : tmp1){
            set.add(t);
        }
        String res = "";
        for(String t : set){
            res += t + " ";
        }
        return res;
    }

    public String intersection(WordSet s){
        String[] tmp = s.word.toLowerCase().trim().split("\\s+");
        String[] tmp1 = this.word.toLowerCase().trim().split("\\s+");
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for(String t : tmp){
            set1.add(t);
        }
        for(String t : tmp1){
            set2.add(t);
        }

        String res = "";
        for(String t : set2){
            if(set1.contains(t)){
                res += t + " ";
            }
        }
        return res;
    }
}
