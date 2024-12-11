package codePTIT.J07014;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> ts;
    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        ts = new TreeSet<>();
        while(sc.hasNext()) {
            ts.add(sc.next().toLowerCase());
        }
    }
    public WordSet(){
        ts = new TreeSet<>();
    }
    public WordSet union(WordSet wordSet){
        WordSet c = new WordSet();
        for(String word : wordSet.ts){
            c.ts.add(word);
        }
        for(String word : this.ts){
            c.ts.add(word);
        }
        return c;
    }
    public WordSet intersection(WordSet wordSet){
        WordSet c = new WordSet();
        for(String word : wordSet.ts){
            if(ts.contains(word)){
                c.ts.add(word);
            }
        }
        return c;
    }

    public String toString(){
        String res = "";
        for(String word : ts){
            res += word + " ";
        }
        return res;
    }
}
