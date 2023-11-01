package assignment1;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}
		int n = arr.length;
		findMajority(arr, n);
	}

	public static void findMajority(int arr[], int n) {
		int maxCount = 0;
		int index = -1;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		if (maxCount > n / 2) {
			System.out.println(arr[index]);
		}

	}
}
