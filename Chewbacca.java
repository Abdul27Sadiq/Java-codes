package assignment1;

import java.util.Scanner;

public class Chewbacca {

	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long x=scn.nextLong();
		
		long ans=0;
		long mult=1;
		
		while(x>0) {
		     
			 long digit=x%10;
			 
			if(digit>=5) {
				digit=9-digit;
				}
			if(x==9) {
				digit=9;
				
			}
			
			ans=ans+digit*mult;
			mult=mult*10;
			x=x/10;
			
			
		}
		
		System.out.println(ans);
		
	}

}

//if(digit==0) {
//digit=9;
//}