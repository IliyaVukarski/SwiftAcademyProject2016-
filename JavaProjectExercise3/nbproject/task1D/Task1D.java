package task1D;

import java.util.Scanner;

public class Task1D {

	public static void main(String[] args) {
		System.out.println("Please enter number ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.printf("The dividers of %d are ", number);
		for(int divider = 1; divider <= number; divider++) {
			if(number % divider == 0) {
				System.out.printf( "%d ", divider);
			}
		}
	}
}
