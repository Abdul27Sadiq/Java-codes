package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int T=scn.nextInt();
			while(T>=0) {
			int N = scn.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = scn.nextInt();
			}T--;
			Arrays.sort(arr);
			int target = scn.nextInt();
			findsum(arr, N, target);
		}
		}
	static void findsum(int arr[], int n, int sum) {
		int count=0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n ; j++) {
					if (arr[i] + arr[j]  == sum) {
						
						if(i-j<=sum) {
							
						System.out.println("Deepak should by roses whose prices are " + arr[i] + " and " + arr[j] );
					}
					}
				}
			}

	}
		

}
