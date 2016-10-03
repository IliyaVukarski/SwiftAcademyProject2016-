package task1A;

import java.util.Scanner;

public class Task1A {

	public static void main(String[] args) {
		System.out.println("Enter one number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int sum = 0;
		while(number >= 10) {
			number = number /10;	
		}
		sum = sum + number;
		System.out.println("After execution only the first digit will remain - " + sum);
	}
}
