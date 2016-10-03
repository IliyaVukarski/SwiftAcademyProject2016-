package task2A;

import java.util.Scanner;

public class Task2A {

	public static void main(String[] args) {
		System.out.println("Please enter how many number you wish to type");
		Scanner scanner = new Scanner(System.in);
		int countOfNumbers = scanner.nextInt();
		System.out.println(countOfNumbers);
		int sum = 0;
		System.out.printf("You now need to enter %s numbers %n", countOfNumbers);
		do {
			int currentNumber = scanner.nextInt();
			sum = sum + currentNumber;
			countOfNumbers--;
		}while(countOfNumbers != 0);
		System.out.println(sum);
	}
}
