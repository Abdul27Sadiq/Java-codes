package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int N = scn.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = scn.nextInt();
			}
			Arrays.sort(arr);
			int target = scn.nextInt();
			findsum(arr, N, target);
		}
	static void findsum(int arr[], int n, int sum) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
					if (arr[i] + arr[j]  == sum) {
						System.out.println(arr[i] + " and " + arr[j] );
					}
				}
			}
		}
	}
	
