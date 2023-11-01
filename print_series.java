package assignment1;

import java.util.Scanner;

public class print_series {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int n=1;
		//int j=1;
		
		//while (N1 < 100 && N2 < 100) {
			
			while (n <=N1) {     // in case we use j then condition is j<=N1
				
				int S = 3 * n + 2;
				if ( S%N2 == 0) {
					n++;
					S=3*n+2;
					N1++;
				}
				n++;
				//j++;
				System.out.println(S);
			}
		}

	}

//}
