package codePTIT;

import java.util.*;

public class J03010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		HashMap<String, Integer> hm = new HashMap<>();
		while (t-- > 0) {
			String[] word = sc.nextLine().trim().toLowerCase().split("\\s+");
			String fistName = "";
			for(int i = 0; i < word.length-1; i++) {
				fistName += word[i].substring(0,1);
			}
			if(!hm.containsKey(fistName)) {
				System.out.println(word[word.length-1] + fistName + "@ptit.edu.vn");
				hm.put(fistName, 2);
			}else{
				System.out.println(word[word.length-1] + fistName + hm.get(fistName) + "@ptit.edu.vn");
				hm.put(fistName, hm.get(fistName) + 1);
			}
		}
	}
}
