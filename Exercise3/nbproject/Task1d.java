package task1d;

import java.util.Scanner;

public class Task1d {
	public static void main(String[] args) {
		System.out.println("Please enter number ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int divider = 1; divider <= number; divider++) {
			if(number % divider == 0) {
				System.out.print(" " + divider);
			}
		}
	}
}
