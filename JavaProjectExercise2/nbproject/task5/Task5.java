package task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("Enter two number in order to swap their values");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first Number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second Number");
		int secondNumber = scanner.nextInt();
		
		System.out.println("Current value for firstNumber " + firstNumber);
		System.out.println("Current value for secondNumber " + secondNumber);
		
		int temporary = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temporary;
		
		System.out.println("New value for firstNumber " + firstNumber);
		System.out.println("New value for secondNumber " + secondNumber);
	}

}
