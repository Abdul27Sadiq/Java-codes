package assignment1;

import java.util.Scanner;

public class Make_number_from_digits_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int n=1;
		int ans=0;
	    int val=0;
	    int rem=0;
		while(n<=num) {
			int digit=scn.nextInt();
			//rem=digit%10;
			ans=ans*10+digit;
		   
			n++;
		}
		
		System.out.println(ans);
	}

}
