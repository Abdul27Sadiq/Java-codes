package assignment1;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		// sum of even digit and odd digit
		Scanner scn=new Scanner(System.in);
		int sum=0;
		int sum1=0;
		int count=0;
		int N=scn.nextInt();
		while(N!=0) {
			int digit1=N%10;
			N=N/10;
			count++;
		  if(count%2==0) { 
			  sum=sum+digit1;
			  } 
		  else  { 
			  sum1=sum1+digit1;
			  }
		
		}
		  System.out.println(sum1); 
		  System.out.println(sum);
			
		}
	}
	


	
