package codePTIT;

import java.util.Scanner;
import static java.lang.Math.*;

class point{
	private double x;
	private double y;
	public point() {
		x = y = 0;
	}
	public point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public point(point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	double distance(point p) {
		return sqrt(pow(this.x-p.x, 2) + pow(this.y-p.y, 2));
	}
	double distance(point a, point b) {
		return sqrt(pow(a.x-b.x, 2) + pow(a.y-b.y, 2));
	}
	public String toString() {
		return x + " " + y;
	}
}

public class J04001 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t-->0) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			point a = new point(x, y);
			x = sc.nextDouble();
			y = sc.nextDouble();
			point b = new point(x, y);
			System.out.printf("%.4f\n", a.distance(b));
		}
	}
}
