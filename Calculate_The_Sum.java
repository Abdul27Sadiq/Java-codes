package assignment1;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int[]arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=scn.nextInt();
			}
		for(int A:arr) {
			System.out.print(A+" ");
		}
		
	}

}
