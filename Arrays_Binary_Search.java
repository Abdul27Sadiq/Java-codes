package assignment1;

import java.util.Scanner;

public class Arrays_Binary_Search {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];
	
		
		for(int i=0;i<N;i++) {
			arr[i] = scn.nextInt();
		}
		int M=scn.nextInt();
		System.out.println(Find(arr, M));
	}

	public static int Find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}


}