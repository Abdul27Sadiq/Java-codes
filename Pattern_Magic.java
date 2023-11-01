package assignment1;
import java.util.Scanner;
public class Pattern_Magic {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		 // Number of rows.
	      
		    // Print upper half of pattern  
		    for(int i=1; i<N; i++)
		    {
		        // We print left side stars.
		        for(int j=i; j<=N; j++)
		        {
		            System.out.print("*");
		        }
		        // Then print spaces , first row has one blank space
		        for(int j=1; j<=(2*i-1); j++)
		        {
		            System.out.print(" ");
		        }
		        // then we print right side stars.
		        for(int j=i; j<=N; j++)
		        {
		            System.out.print("*");
		        }
		 
		        System.out.println();
		    }
		 
		    // Loop to print lower half of the pattern
		    for(int i=1; i<=N; i++)
		    {
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }
		        // Here we decrease no. of blank spaces after each printing each row.
		        for(int j=(2*i-2); j<(2*N-1); j++)
		        {
		            System.out.print(" ");
		        }
		 
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }
		 
		        System.out.println();
		    }
		 
	}

}
