package assignment1;
import java.util.Scanner;
public class Pattern_with_Zeros {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i=1;i<=n;i++){
		//for(int j=1;j<=i;j++){
		if(i>n/2){
		System.out.print(i+"	");
		for(int k=1;k<=i-2;k++){
			System.out.print("0		");
		}
		System.out.print(i+"	");
		}
		else{
		for(int j=1;j<=i;j++){
		System.out.print(i+"	");
		}
		}
		//}
		System.out.println();
		}

	}

}
