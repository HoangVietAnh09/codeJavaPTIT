package codePTIT;

import java.util.Scanner;

class Rectange{
	private double width,height;
	private String color;
	public Rectange(){
		width = height = 0;
		color = "red";
	}
	public Rectange(double width, double height, String color){
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public String getColor(){
		return color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
	}
	public void setColor(String color){
		this.color = color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
	}
	public double findrea(){
		return width*height;
	}
	public double findPerimeter(){
		return 2*width+2*height;
	}
	@Override
	public String toString(){
		return String.format("%d %d %s", (int)findPerimeter(), (int)findrea(), getColor());
	}


}


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
