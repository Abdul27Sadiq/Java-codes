package assignment1;
import java.util.Scanner;
public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int min = scn.nextInt();

		int max = scn.nextInt();

		int step = scn.nextInt();

		while (min <= max) {
	// double F = sc.nextDouble();

			float C = (min - 32) * (5f / 9);

			//int part1 = (int) C;

			int part2 = (int) C;

			System.out.println(min + " " + part2);
			min +=step;

		}
	}

}
