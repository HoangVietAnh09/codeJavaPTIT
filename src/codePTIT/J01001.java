package codePTIT;

import java.util.Scanner;

public class J01001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cd = sc.nextInt();
		int cr = sc.nextInt();
		if(cd <= 0 || cr <= 0) {
			System.out.println("0");
		}else {
			System.out.println(2*(cd+cr) + " " + (cd*cr));
		}
		
		
	}

}
