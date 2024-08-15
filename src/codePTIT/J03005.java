package codePTIT;

import java.util.Scanner;

public class J03005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while (t-- > 0) {
			String[] words = sc.nextLine().trim().split("\\s+");
			for(int i = 1; i < words.length; i++){
				words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
				System.out.print(words[i]);
				if(i == words.length - 1){
					System.out.print(", ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(words[0].toUpperCase());
		}
	}
}
