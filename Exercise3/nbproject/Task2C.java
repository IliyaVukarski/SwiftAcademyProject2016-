package task2c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2C {

	public static void main(String[] args) {
		System.out.println("How many numbers you wish ot enter");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		System.out.printf("You now need to enter %s numbers %n", count);
		for(int index = 0; index < count; index++) {
			int currentNumber = scanner.nextInt();
			if(currentNumber % 2== 0) {
				evenNumbers.add(currentNumber);
			}
		}
		System.out.print("The even numbers are ");
		for(Integer number : evenNumbers) {
			System.out.print(number + " ");
		}
	}
}
