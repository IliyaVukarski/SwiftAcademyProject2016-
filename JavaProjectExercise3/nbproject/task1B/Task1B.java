package task1B;

import java.util.Scanner;

public class Task1B {

	public static void main(String[] args) {

		System.out.println("Enter one number ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int reverseNumber = 0;
		int remainder = 0;
		while(number != 0) {
			remainder = number % 10;
			reverseNumber = reverseNumber * 10 + remainder;
			number = number / 10;
		}
		System.out.printf("The reverse number of this number is %d ", reverseNumber);
	}
}
