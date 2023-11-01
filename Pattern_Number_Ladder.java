package assignment1;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int N= 1;
		int numstr = 1;
		int num=1;
		while (N <= n) {
			int i = 0;

			while (i < numstr) {
				
				System.out.print(num+"    " );
				i++;
				num++;

			}
			N++;
			numstr++;
			System.out.println();

		}
	}

}
