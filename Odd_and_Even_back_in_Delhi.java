package assignment1;

import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {

	public static void main(String[] args) {
		// Odd and Even back in Delhi
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int n=1;
		while(n<=N) {
		int sum=0;
		int sum1=0;
	    n++;
		int no=scn.nextInt();
		while(no!=0) {
		
		int digit=no%10;
		no=no/10;
		if(digit%2==0) {
			sum=sum+digit;
		}
		else {
			sum1=sum1+digit;
		}
		
		
		}
		if(sum%4==0 || sum1%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	
	}
	}
}
