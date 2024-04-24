package evaluation1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Uppercase Character:");
		char c = sc.next().charAt(0);
		
		int n = alp.indexOf(c);
		n++;
		System.out.println(n);
		int x = ((n)*2);
		int k = 3;
		
		for(int i=0;i<x;i++) {
			int temp = i;
			if(i>n) {
				temp = i-k;
				k+=2;
			}
			if(i==n)continue;
			for(int j=1;j<x;j++) {
				if(j == n-temp || j == n+temp) {
					System.out.print(alp.charAt(temp));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
