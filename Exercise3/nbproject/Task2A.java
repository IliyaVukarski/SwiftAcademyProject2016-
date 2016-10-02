package task2a;

import java.util.Scanner;

public class Task2A {

	public static void main(String[] args) {
		System.out.println("How many numbers you wish ot enter");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int sum = 0;
		System.out.printf("You now need to enter %s numbers %n", count);
		for(int index = 0; index < count; index++) {
			int currentNumber = scanner.nextInt();
			sum = sum + currentNumber;
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
