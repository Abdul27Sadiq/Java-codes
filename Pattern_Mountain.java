package assignment1;
import java.util.Scanner;
public class Pattern_Mountain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();

		int nst=1;
		int nsp=2*n - 3;

		int row = 1;
		while (row<=n){
		int val = 1;
			for(int cst=1;cst<=nst;cst++){
				System.out.print(val+" ");
				val++;
			}
			for (int csp=1;csp<=nsp;csp++) {
				System.out.print("  ");
			}
			int cst=1;
			if (row==n) {
				cst=2;
			}
			if(row<n) {
				val-=1;
			}
			else {
				val-=2;
			}
			for(;cst<=nst;cst++){
				System.out.print(val+" ");
				val--;
			}

			System.out.println();
			row++;
			nsp=nsp-2;
			nst++;
		}
		}
		}




	
		/*// TODO Auto-generated method stub
		int n = 4;
		int nst = 1;
		int row = 1;
		int nsp = 2 * n - 3;
		
		while (row <= n) {
			int no=1;
			int cst1 = 0;
			while (cst1 < nst) {
				System.out.print(no+" ");
				no++;
				cst1++;
				
			}

			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst2 = 0;
			if (row == n) {
				cst2 = 1;
			}
			while (cst2 < nst) {
				
				System.out.print("1 " );
				
				cst2++;
			}
			nsp = nsp - 2;
			row++;
			nst++;
			no++;
			System.out.println();
		}
	}


}*/
	
		/*
		 * int n = 4; int row = 1; int numstr = 1;
		 * 
		 * while (row <= n) { int i = 0; int no=1; while (i < numstr) {
		 * System.out.print(no+" "); no++; i++;
		 * 
		 * }
		 * 
		 * row++; numstr++; System.out.println();
		 * 
		 * }
		 */
	

