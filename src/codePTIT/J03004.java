package codePTIT;

import java.util.Scanner;

public class J03004 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String[] words = sc.nextLine().trim().split("\\s+");
			for(int i = 0; i < words.length; i++) {
				words[i] = words[i].toUpperCase().substring(0, 1) + words[i].toLowerCase().substring(1);
			}
				System.out.println(String.join(" ", words));
		}
		
			
	}

}
