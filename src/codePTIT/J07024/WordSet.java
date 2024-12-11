package codePTIT.J07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    TreeSet<String> ts;

    public WordSet(String fileName) throws FileNotFoundException {
        ts = new TreeSet<>();
        Scanner sc = new Scanner(new File(fileName));
        while(sc.hasNext()) {
            ts.add(sc.next().toLowerCase());
        }
    }
    public WordSet(){
        ts = new TreeSet<>();
    }

    public WordSet difference(WordSet wordSet) {
        WordSet ws = new WordSet();
        for(String word : ts) {
            if(!wordSet.ts.contains(word)) {
                ws.ts.add(word);
            }
        }
        return ws;
    }
    public String toString(){
        String res = "";
        for(String word : ts) {
            res += word + " ";
        }
        return res;
    }
}
