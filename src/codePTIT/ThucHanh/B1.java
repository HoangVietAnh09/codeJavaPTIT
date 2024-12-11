package codePTIT.ThucHanh;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();
        for(int i = 0; i < n; i++){
            s1.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            s2.add(sc.nextInt());
        }
        for(Integer i : s1){
            if(s2.contains(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i : s1){
            if(!s2.contains(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for(Integer i : s2){
            if(!s1.contains(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
