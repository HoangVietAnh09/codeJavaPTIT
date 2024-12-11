package codePTIT.LuyenTap;

import java.util.Scanner;

public class B6 {
    public static void option1(String hoTen){
        String res = "";
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        res += words[words.length-1] + " ";
        for(int i = 0; i < words.length-1; i++){
            res += words[i] + " ";
        }
        System.out.println(res);
    }
    public static void option2(String hoTen){
        String res = "";
        String[] words = hoTen.trim().split("\\s+");
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        for(int i = 1; i < words.length; i++){
            res += words[i] + " ";
        }
        res += words[0] + " ";
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            int n = Integer.parseInt(sc.nextLine());
            String hoTen = sc.nextLine();

            if(n == 1){
                option1(hoTen);
            }else if(n == 2){
                option2(hoTen);
            }
        }
    }
}
