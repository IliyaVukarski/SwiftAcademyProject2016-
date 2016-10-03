package task2C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2C {
	public static void main(String[] args) {
		System.out.println("How many numbers you wish ot enter");
		Scanner scanner = new Scanner(System.in);
		int countOfNumbers = scanner.nextInt();
		int[] arrayOfNumbers = new int[countOfNumbers];		
		for(int index = 0; index < countOfNumbers; index++) {
			int currentNumber = scanner.nextInt();
			arrayOfNumbers[index] = currentNumber;
			
		}
		System.out.printf("You now need to enter %s numbers %n", countOfNumbers);
		System.out.print("The even numbers are ");
		for(int evenNumber : arrayOfNumbers) {
			if(evenNumber % 2 ==0) {
				System.out.print(evenNumber + " ");
			}
		}
	}
}
