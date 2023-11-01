package assignment1;

import java.util.Scanner;

public class to_find_how_many_times_ali {

	public static void main(String[] args) {
		int N, x, count = 0, i = 0;
        Scanner scn = new Scanner(System.in);
       // System.out.print("Enter no. of elements you want in array:");
        N = scn.nextInt();
        int a[] = new int[N];
       // System.out.print("Enter all the elements:");
        for(i = 0; i < N; i++)
        {
            a[i] = scn.nextInt();
        }
      //  System.out.print("Enter the element of which you want to count number of occurrences:");
        x = scn.nextInt();
        for(i = 0; i < N; i++)
        {
            if(a[i] == x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}	