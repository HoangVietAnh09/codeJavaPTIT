package codePTIT.J04002;

import java.util.Scanner;




public class J04002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		String color = sc.next();
		if(w > 0 && h > 0){
			Rectange r = new Rectange(w, h, color);
			System.out.println(r);
		}else{
			System.out.println("INVALID");
		}
	}
}
