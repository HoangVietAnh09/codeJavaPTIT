package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static int n;
    public static int[] a;
    public static ArrayList<String> res = new ArrayList<>();
    public static void backTrack(int i, String s, int dem){
        for(int j = i+1; j <= n; j++){
            if(a[i] < a[j]){
                if(dem > 0){
                    res.add(s + Integer.toString(a[j]) + " ");
                }
                backTrack(j, s + Integer.toString(a[j]) + " ", dem+1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\File\\DAYSO.in"));
        n = sc.nextInt();
        a = new int[104];
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        backTrack(0, "",0);
        Collections.sort(res);
        for(String s : res){
            System.out.println(s);
        }
    }
}
