package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		long sum = 0;
		while(sc.hasNext()) {
			String tmp = sc.next();
			try {
				sum += Integer.parseInt(tmp);	
			}catch(Exception e) {
				
			}
		}
		System.out.println(sum);
		
	}

}