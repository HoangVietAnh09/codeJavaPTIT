package codePTIT;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        for(int i = 0; i < list.size(); i++){
            String[] tmp = list.get(i).split("[a-zA-Z]+");
            String res = "";
            int s = 0;
            for(int j = 0; j < tmp.length; j++){
                res += tmp[j];
            }
            res = res.replaceFirst("^0*","");
            if(res.isEmpty()) res = "0";
            for(int j = 0; j < res.length(); j++){
                s += (int)(res.charAt(j) - '0');
            }
            System.out.printf("%s %d\n", res, s);
        }
    }
}
