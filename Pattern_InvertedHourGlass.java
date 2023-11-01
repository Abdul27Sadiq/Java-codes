package assignment1;
import java.util.Scanner;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		   // System.out.print("Enter the number of rows: ");
		    int N = sc.nextInt();
		    int nsp = 2 *N - 1;
		 
		    int nr = 2 *N + 1;
		    int num = N;
		    int a = 0;
		 
		    for (int i = 1; i <= nr; i++)
		    {
		      if (i > N + 1)
		        a = nr - i + 1;
		      else
		        a = i;
		 
		      //numbers
		      for (int cst = 1; cst <= a; cst++)
		      {
		        System.out.print(num+" ");
		        num--;
		      }
		 
		      //Spaces
		      for (int csp = 1; csp <= nsp; csp++)
		      {
		        System.out.print(" ");
		      }
		 
		      for (int cst = 1; cst <= a; cst++)
		      {
		        num++;
		        if (num != 0)
		          System.out.print(" "+num);
		      }
		 
		      if (i <= (nr) / 2)
		        nsp -= 2;
		      else
		        nsp += 2;
		 
		      System.out.println();
		    }
		  

	}

}
