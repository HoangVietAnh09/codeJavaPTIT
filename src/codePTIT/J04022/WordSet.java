package codePTIT.J04022;

import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private String s;
    Set<String> st = new TreeSet<>();

    public WordSet(){

    }
    public WordSet(String s) {
        this.s = s;
        String[] tmp = s.split("\\s+");
        for (int i = 0; i < tmp.length; i++) {
            st.add(tmp[i]);
        }
    }

//    public WordSet union(WordSet ws) {
//        WordSet c = new WordSet();
//
//    }

    public WordSet intersection(WordSet ws) {
        for (String s : st) {
            if (ws.st.contains(s)) {
                this.st.add(s);
            }
        }
        return this;
    }

    public String toString(){
        String s = "";
        for(String x : st){
            s += x + " ";
        }
        return s;
    }
}
