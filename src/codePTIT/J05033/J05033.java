package codePTIT.J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            list.add(new Time(hour, minute, second));
        }
        Collections.sort(list);
        for(Time time : list){
            System.out.println(time);
        }
    }
}
