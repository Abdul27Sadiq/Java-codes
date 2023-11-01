package assignment1;

import java.util.Scanner;

public class prime_factorisastion {

	public static void main(String[] args) {
		// prime factorisation
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int dividend=num;
		int divisor=2;
			while(true) {
				int rem= dividend%divisor;
				dividend=rem;
				System.out.println(divisor);
			}
			
		}

	}


