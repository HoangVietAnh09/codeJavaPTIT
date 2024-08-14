package codePTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Goods implements Comparable<Goods>{
	public static int cnt = 0;
	private String id, name, unit;
	private int giaMua, giaBan, profit;
	public Goods(String name, String unit, int giaMua, int giaBan) {
		this.id = "MH" + String.format("%03d", ++cnt);
		this.name = name;
		this.unit = unit;
		this.giaBan = giaBan;
		this.giaMua = giaMua;
		this.profit = giaBan - giaMua;
	}
	public int getProfit() {
		return profit;
	}
	public int compareTo(Goods p) {
		return p.getProfit() - this.profit;
	}
	public String toString() {
		return id + " " + name + " " + unit + " " + giaMua + " " + giaBan + " " + profit;
	}
	
}
public class J05081 {
	static int cnt = 0;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		List<Goods> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			String name = sc.nextLine();
			String unit = sc.nextLine();
			int giaMua = Integer.parseInt(sc.nextLine());
			int giaBan = Integer.parseInt(sc.nextLine());
			Goods goods = new Goods(name, unit, giaMua, giaBan);
			list.add(goods);
		}
		Collections.sort(list);
		for(Goods i : list) {
			System.out.println(i);
		}
		
	}

}
