package codePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J07004 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("D:\\codeJavaPTIT\\src\\codePTIT\\DATA.in"));
		HashMap<Integer, Integer> map = new HashMap<>();
		while (sc.hasNext()) {
			int s = Integer.parseInt(sc.next());
			if(!map.containsKey(s)){
				map.put(s, 1);
			}else{
				map.put(s, map.get(s)+1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
