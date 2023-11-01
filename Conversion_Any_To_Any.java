package assignment1;

import java.util.Scanner;

public class Conversion_Any_To_Any {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int sb=scn.nextInt();
		int db=scn.nextInt();
		int sn=scn.nextInt();
		
		int ans=0;
		int digit=0;
		int mult=0;
		int ans1=0;
		while(sn>0) {
			 digit=sn%10;
			 ans=(int)(ans+digit*Math.pow(sb, mult));
			 mult++;
			sn=sn/10;
		
		if(ans!=0) {
		ans=ans%2;
		ans1=ans1+ans*10;
		ans=ans/2;
	}
		}
System.out.println(ans1);
}
}
