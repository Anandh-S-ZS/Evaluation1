package evaluation1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Digits:");
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i=0;i<n1;i++)a1[i] = sc.nextInt();
		
		System.out.println("Number of Digits:");
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i=0;i<n1;i++)a2[i] = sc.nextInt();
		
//		int[] a1 = {9,2,8,1,3,5,6,7,3,1,1,6};
//		int[] a2 = {7,8,4,6,2,1,9,9,7};
		
//		int[] a1 = {9,9,9,9,9};
//		int[] a2 = {9,9,9,9,9,9,9};
		
		int i=a1.length-1;
		int j=a2.length-1;
		
		int []ans = new int[i>j ? i+2:j+2];
		int ansi = i>j ? i+1:j+1;
		
		if(j>i) {
			int[]temp = a1;
			a1 = a2;
			a2 = temp;
			
			int t = i;
			i=j;
			j=t;
		}
		
		while(i>=0 && j>=0) {
			int temp = a1[i]+a2[j];
			
			if(temp>9) {
				ans[ansi] = temp%10;
				temp/=10;
				if(i-1>=0)
					a1[i-1]+=temp;
				else
					ans[ansi-1]+=temp;
				
			}
			else {
				ans[ansi] = temp;
			}
			ansi--;
			i--;
			j--;
		}
		
		while(i>=0) {
			if(a1[i]>9) {
				ans[ansi] = a1[i]%10;
				a1[i]/=10;
				if(i-1>=0)
					a1[i-1]+=a1[i];
				else
					ans[ansi-1]+=a1[i];
			}
			else {
				ans[ansi] = a1[i];
			}
			ansi--;
			i--;
		}
		System.out.println(Arrays.toString(ans));
		
	}
}
