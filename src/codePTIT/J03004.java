package codePTIT;

import java.util.Scanner;

public class J03004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String[] words = sc.nextLine().trim().split("\\s+");
			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
			}
			System.out.println(String.join(" ", words));

		}

			
	}

}
