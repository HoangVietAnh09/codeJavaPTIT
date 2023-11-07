package codePTIT;

import java.util.Scanner;

public class J03005 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String token[] = sc.nextLine().trim().split("\\s+");
			for(int i = 1; i < token.length; i++) {
				token[i] = token[i].toUpperCase().substring(0, 1) + token[i].toLowerCase().substring(1);
				System.out.print(token[i]);
				if(i != token.length-1) {
					System.out.print(" ");
				}
			}
			token[0] = token[0].toUpperCase();
			System.out.print(", " + token[0] + "\n");
		}
		
	}

}
