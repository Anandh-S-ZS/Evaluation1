package evaluation1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n=6;
		
		int f = n/2+1;
		int[][] ans = new int[n][n];
		int c = 1;
		int t = n;
		int direction = 0;
		int i=0,j=0;
		int originali=-2,originalj=-2;
		int put = 1;
		
		for(int x=0;x<f;x++) {
			if(x%2!=0)continue;
			i = originali+2;
			j = originalj+2;
			l:while(true) {
				if(c<=t)
				ans[i][j] = put;
				if(c>=t) {
					c=0;
					if(direction==0)t--;
					if(direction<4)direction++;
					else {
						direction = 0;
						break l;
					}
				}
				switch(direction) {
				case 0:
					j++;
					break;
				case 1:
					i++;
					break;
				case 2:
					j--;
					break;
				case 3:
					i--;
					break;
				}
				c++;
			}
			originali+=2;
			originalj+=2;
			t-=3;
			c=1;
		}
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++) {
				System.out.print(ans[x][y]+" ");
			}
			System.out.println();
		}
	}
}
