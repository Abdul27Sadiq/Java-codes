package assignment1;
import java.util.Scanner;
public class Pattern_HourGlass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N=0;
		if(scn.hasNext()) {
			N=scn.nextInt();
		}
		int i,j,space,value;
		value=N;
		//upper part
		for(i=0;i<=N;i++) {
			value=N-i;
			for(space=0;space<=i;space++) {
				System.out.print("  ");
			}
			for(j=i;j<=2*N-i;j++) {
				
				System.out.print(value+" ");
				if(j<=N && value>0) {
					value--;
				}
				else {
					value++;
				}
			}
			System.out.println();
		}
			//lower part
			for(i=0;i<N;i++) {
				value=i+1;
				int count=0;
				for(space=0;space<N-i;space++) {
					System.out.print("  ");
					count++;
				}
				for(j=0;j<(N/2)+2*i+1;j++) {
					System.out.print(value+" ");
					if(j<=N-space+1 && value>0) {
						value--;
					}
					else {
						value++;
					}
				}
				System.out.println();
			}
			
		}

	}