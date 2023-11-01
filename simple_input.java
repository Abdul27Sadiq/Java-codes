package assignment1;

import java.util.Scanner;

public class simple_input {
	public static void main(String[] args) {
	int i=1;
	int sum=0;
	while(i<=5) {
	Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
	sum=sum+x;
	while(sum<0) {
		i++;
		break;
		
	}
	if(sum>=0) {
		System.out.println(x);
		i++;
	}
	}
	
}
}
// dimag kharab ho raha h
