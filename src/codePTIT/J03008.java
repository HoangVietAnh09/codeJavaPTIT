package codePTIT;

import java.util.Scanner;

public class J03008 {
	public static boolean checkReverse(String s){
		for(int i = 0; i < s.length()/2; i++){
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			String res = s.matches("[2357]+") && checkReverse(s) ? "YES" :"NO";
			System.out.println(res);
		}
	}
}
