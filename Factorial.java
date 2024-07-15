import java.util.Scanner;

public class Factorial {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int factorial = 0;
		int sum;

		System.out.print("\n enter your number: ");
		int number = input.nextInt();

		for  (sum = 1; sum < number; sum++) {
			factorial = factorial * (number - sum);
				factorial ++;
		}
		
			System.out.println(factorial);

	}
}