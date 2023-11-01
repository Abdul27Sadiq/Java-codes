package assignment1;

import java.util.Scanner;

public class incrreasing_decreasing {

	
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int total=scn.nextInt();
		int prev=Integer.MAX_VALUE;
		int decreasing=1;
		boolean ans=true;
		for(int i=0;i<total;i++) {
			int num=scn.nextInt();
			if(decreasing==1 && num>prev) {
				decreasing=0;
			}
			if(decreasing==0 && prev>num) {
				ans=false;
			}
			prev=num;
			
		}
		System.out.println(ans);
	}

}
