package codePTIT;

import java.util.Scanner;

public class J02010 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int cnt = 0;
		int tp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[i]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					tp = 1;
				}
			}
			if(tp == 1) {
				cnt++;
				System.out.printf("Buoc %d: ", cnt);
			}
			for(int k = 0; k < n; k++) {
				if(tp == 1) {
					System.out.print(a[k] + " ");
				}
			}
			System.out.println();
			tp = 0;

		}
		
	}

}
