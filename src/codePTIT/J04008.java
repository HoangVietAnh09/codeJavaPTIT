package codePTIT;

import java.util.Scanner;
import static java.lang.Math.*;

class Point{
	private double x, y;
	public Point() {
		this(0f, 0f);
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	double distance(Point p) {
		return sqrt(pow(this.x-p.x, 2) + pow(this.y - p.y, 2));
	}
	double distance(Point a, Point b) {
		return sqrt(pow(a.x-b.x, 2) + pow(a.y-b.y, 2));
	}
	public String toString() {
		return  x + " " + y;
	}
	
}
public class J04008 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			Point[] arr = new Point[3];
			for(int i = 0; i < 3; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				arr[i] = new Point(x, y);
			}
			double a = arr[0].distance(arr[1]);
			double b = arr[1].distance(arr[2]);
			double c = arr[0].distance(arr[2]);
			
			if(a + b > c && a + c > b && b + c > a) {
				System.out.printf("%.3f\n", a+b+c);
			}else {
				System.out.println("INVALID");
			}
		}
	}

}
