package assignment1;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) {
		// count digit
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int digit=scn.nextInt();
		int count=0;
		while(N!=0) {
			
			int dig=N%10;
			N=N/10;
			if(dig==digit) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
