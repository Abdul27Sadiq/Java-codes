package assignment1;

import java.util.Scanner;

public class Decimal_to_octal {

	
 
	public static void main(String[] args) {
		// Decimal to octal
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int ans=0;
		int digit=0;
		int mult=1;
		while(N>0) {
			 digit=N%8;
			 ans=ans+digit*mult;
			 mult=mult*10;
			N=N/8;
		}System.out.println(ans);

	}

}
