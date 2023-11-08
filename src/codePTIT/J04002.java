package codePTIT;

import java.util.Scanner;

class Rectange{
	private double width, height;
	private String color;
	
	public Rectange() {
		width = height = 1;
	}
	public Rectange(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getColor() {
		return color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double findArea() {
		return width * height;
		
	}
	public double findPerimeter() {
		return 2*(width + height);
	
	}
	
	public String toString() {
		return String.format("%d %d %s", (int)findPerimeter(), (int)findArea(), getColor());
	}
	
	
}

public class J04002 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		String color = sc.nextLine();
		Rectange a = new Rectange(width, height, color);
		if(width <= 0 || height <= 0) {
			System.out.println("INVALID");
		}else {
			System.out.println(a);
		}
		
		
	}
}
