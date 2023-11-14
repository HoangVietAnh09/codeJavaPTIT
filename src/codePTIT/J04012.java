package codePTIT;

import java.util.Scanner;
class nv{
	private String mnv, ten, chuc;
	private int bonus, sal, base, wage, count;
	public nv() {
		
	}
	public nv(String mnv, String ten, int base, int count, String chuc) {
		this.mnv = "NV01";
		this.ten = ten;
		this.base = base;
		this.count = count;
		this.wage = base*count;
		
		
		if(count >= 25) sal = wage/5;
		else if(count >= 22 && count < 25) sal = wage/10;
		else sal = 0;
		
		this.chuc = chuc;
		
		if(chuc.equals("GD")) bonus = 250000;
		else if(chuc.equals("PGD")) bonus = 200000;
		else if(chuc.equals("TP")) bonus = 180000;
		else if(chuc.equals("NV")) bonus = 150000;
	}
	public int getWage() {
		return wage;
	}
	public int tong() {
		return bonus + sal + wage;
	}
	
	public String toString() {
		return mnv + " " + ten + " " + wage + " " + sal + " " + bonus + " " + tong(); 
	}
	
	
}

public class J04012 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String ten = sc.nextLine();
		int baseSalary = Integer.parseInt(sc.nextLine());
		int count = Integer.parseInt(sc.nextLine());
		String chuc = sc.nextLine();
		nv nv1 = new nv("NV01", ten, baseSalary, count, chuc);
		System.out.println(nv1);
		
	}

}
