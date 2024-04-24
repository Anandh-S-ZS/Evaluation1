package evaluation1;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)arr[i] = sc.nextInt();
		
//		int[]arr = {2,7,5,-1,-3,2,9,7};
//		int[] arr = {3,-1,6,1,-5,1,3,-8};
//		int n = arr.length;
		
		int i=0,j=0;
		int max = 0;
		int tempMax = 0;
		int i1=0,j1=0;
		while(i<n && j<n) {
			if(arr[j]>=0) {
				tempMax+=arr[j];
			}
			else {
				if(tempMax>max) {
					max = tempMax;
					i1 = i;
					j1 = j;
					tempMax = 0;
				}
				i=j+1;
			}
			j++;
		}
		if(tempMax>max) {
			max = tempMax;
			i1 = i;
			j1 = j;
			tempMax = 0;
		}
		
		System.out.println(max);
		for(int x = i1;x<j1;x++) {
			System.out.print(arr[x]+" ");
		}
	}
}
