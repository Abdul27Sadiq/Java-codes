package assignment1;

import java.util.Scanner;

public class Make_number_from_digits_1 {

	public static void main(String[] args) {
		// 
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int n=1;
		int ans=0;
	    int val=0;
	    int rem=0;
		while(n<=num) {
			int digit=scn.nextInt();
			rem=digit%10;
			ans=ans*10+digit;
			n++;
		}
		
		//System.out.println(ans);
		while(ans!=0) {
			int digit1=ans%10;
			
		
		ans=ans/10;
		val=val*10+digit1;
		}
		System.out.println(val);
	}
	

}
//Ques mei concatenate likha h na to String mei concatenate krte hue bhi hum ise kar skte h usse test case fail nhi hoga
