package evaluation1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> a = new HashMap<>();
		System.out.println("Enter array Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			int temp = a.getOrDefault(arr[i], 0);
			a.put(arr[i], temp+1);
			if(temp+1 > max) {
				max = temp+1;
			}
		}
		
		int[] ans = new int[8];
		int end=0;
		
		for(int i=0;i<5;i++) {
			for(int x: a.keySet()) {
				if(a.get(x) == max) {
					for(int k=end;k<end+max;k++) {
						ans[k] = x;
					}
					end+=max;
					a.put(x, 0);
					break;
				}
			}
			max = findMax(a);
		}	
		System.out.println(Arrays.toString(ans));
	}

	private static int findMax(HashMap<Integer, Integer> a) {
		int ans = 0;
		for(int x: a.keySet()) {
			if(a.get(x) > ans)ans = a.get(x);
		}
		return ans;
	}
}
