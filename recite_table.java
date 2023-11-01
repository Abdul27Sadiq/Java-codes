package assignment1;

import java.util.Scanner;

public class recite_table {

	public static void main(String[] args) {
		// recite table till x is less than y
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int n = 1;
		int j=1;
		while(x<=10000 && y<=10000) {
			while (n <= 10) {
			int	ans = x * j;
				if(ans<=y) {
				System.out.println(ans);
				n++;
				j++;
				}
			
			}
		}
	}

}
