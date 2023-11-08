package codePTIT;

import java.util.Scanner;

public class J03008 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String s = sc.nextLine();
			
			if(s.matches("[^01489]+")&& thuanNghich(s) == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
	public static boolean thuanNghich(String s) {
		int l = s.length();
		for(int i = 0; i < l/2; i++) {
			if(s.charAt(i) != s.charAt(l-i-1)) return false;
		}
		return true;
	}

}
