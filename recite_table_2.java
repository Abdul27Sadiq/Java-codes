package assignment1;

import java.util.Scanner;

public class recite_table_2 {

	public static void main(String[] args) {
		// recite table till x*y
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int i = 1;
		while (true) {
			int val = x * i;
			if (val <= x*y) {
				System.out.println(val);
			} else {
				break;
			}
			i++;
		}
	}

}
