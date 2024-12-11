package codePTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        while(true){
            boolean stop = true;
            for(int i = 0; i < list.size()-1; i++){
                if((list.get(i) + list.get(i+1))%2 == 0){
                    list.remove(i+1);
                    list.remove(i);
                    i--;
                    stop = false;
                }
            }
            if(stop){
                System.out.println(list.size());
                return;
            }
        }
    }
}
