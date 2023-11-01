package assignment1;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int b = 0;
		while (b < N) {
			 int ans = 0;
			
			int a = scn.nextInt();
	
			int n = 0;
			// f * 25 + e * 24 + d * 23 + …..+ a * 20.
			while (a > 0) {
				int digit = a % 10;

			ans = (int) (ans + digit * Math.pow(2, n));
				a = a / 10;
				n++;

			}
	System.out.println(ans);
			b++;
			
         
			
		}

	
	}

}
