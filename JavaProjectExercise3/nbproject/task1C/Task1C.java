package task1C;

import java.util.Scanner;

public class Task1C {

	public static void main(String[] args) {
		System.out.println("Please enter number ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int remainder = 0;
		int sumOfElements = 0;
		while(number != 0) {
			remainder = number % 10;
			sumOfElements = sumOfElements + remainder;
			number = number / 10;
		}
		System.out.printf("The sum of the digits of the number is %d", sumOfElements);
	}
}
