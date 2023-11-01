package assignment1;

import java.util.Scanner;

public class Ice_cream {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(indexOfSmallest(arr));
	}

	public static int indexOfSmallest(int[] array){
	    int index = 1;
	    int min = array[index];

	    for (int i = 0; i < array.length; i++){
	        if (array[i] <= min){
	        min = array[i];
	        index = i+1;
	        }
	    }
	        return index;
	}
}
