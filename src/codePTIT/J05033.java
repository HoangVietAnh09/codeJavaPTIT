package codePTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
	private int hours, minutes, seconds, time;
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.time = hours*3600 + minutes*60 + seconds;
	}
	int getHours() {
		return hours;
	}
	int getMinutes() {
		return minutes;
	}
	int getSeconds() {
		return seconds;
	}
	
	public int compareTo(Time t) {
		int s1 = hours * 3600 + minutes * 60 + seconds;
		int s2 = t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds();
		return s1-s2;
	}
	public String toString() {
		return hours + " " + minutes + " " + seconds;
	}
	
}
public class J05033 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		List<Time> list = new ArrayList<>(n);
		for(int i = 0; i < n; i++) {
			int hours = sc.nextInt();
			int minutes = sc.nextInt();
			int seconds = sc.nextInt();
			Time time = new Time(hours, minutes, seconds);
			list.add(time);
		}
		Collections.sort(list);
		for(Time x : list) {
			System.out.println(x);
		}
		
		
	}

}
