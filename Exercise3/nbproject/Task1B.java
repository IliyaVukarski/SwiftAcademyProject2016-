package task1b;

import java.util.Scanner;

public class Task1B {

	public static void main(String[] args) {
		int number = 0;
		int reverse = 0;
		int remainder = 0;
		
		System.out.println("Enter number to reverse");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		while(number != 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse of entered number is " + reverse);
	}
}
