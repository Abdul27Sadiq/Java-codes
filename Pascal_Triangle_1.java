package assignment1;
import java.util.Scanner;
public class Pascal_Triangle_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		
		  
	        for (int i = 0; i < N; i++) {
	            int number = 1;
	            System.out.printf("%" + (N - i) * 2 + "s", "");
	            for (int j = 0; j <= i; j++) {
	                System.out.printf("%4d", number);
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	  
	    }
}