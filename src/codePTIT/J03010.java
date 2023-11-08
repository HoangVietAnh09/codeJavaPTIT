package codePTIT;

import java.util.Scanner;

public class J03010 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String[] s = sc.nextLine().trim().split("\\s+");
			for(int i = 0; i < s.length; i++) {
				s[i] = s[i].toLowerCase();
			}
			System.out.print(s[s.length-1]);
			for(int i = 0; i < s.length-1; i++) {
				System.out.print(s[i].substring(0,1));
			}
			System.out.println("@ptit.edu.vn");
			
			
		}
		
	}

}
