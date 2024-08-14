package codePTIT;

import java.util.Scanner;
class diem{
	private double x, y;
	
	public diem(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public static diem nextPoint(Scanner sc) {
		return new diem(sc.nextDouble(), sc.nextDouble());
	}
	
}
class Triangle{
	private diem a;
	private diem b;
	private diem c;
	
	public Triangle(diem a, diem b, diem c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public diem getA() {
		return a;
	}
	public diem getB() {
		return b;
	}
	public diem getC() {
		return c;
	}
	
	
	public boolean valid() {
		double ab = Math.sqrt(Math.pow(a.getX()+b.getX(), 2) + Math.pow(a.getY() + b.getY(), 2));
		double ac = Math.sqrt(Math.pow(a.getX()+c.getX(), 2) + Math.pow(a.getY() + c.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX()+b.getX(), 2) + Math.pow(c.getY() + b.getY(), 2));
		if(ab + ac > bc && ab + bc > ac && ac + bc > ab)
			return true;
		return false;
	}
	
	public String getPerimeter() {
		double ab = Math.sqrt(Math.pow(a.getX()+b.getX(), 2) + Math.pow(a.getY() + b.getY(), 2));
		double ac = Math.sqrt(Math.pow(a.getX()+c.getX(), 2) + Math.pow(a.getY() + c.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX()+b.getX(), 2) + Math.pow(c.getY() + b.getY(), 2));
		return String.format("%.3f", ab + ac + bc);
		
	}
	
	
}

public class J04019 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            Triangle a = new Triangle(diem.nextPoint(sc), diem.nextPoint(sc), diem.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
