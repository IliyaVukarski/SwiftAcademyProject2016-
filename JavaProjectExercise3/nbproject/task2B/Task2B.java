package task2B;

import java.util.Scanner;

public class Task2B {

	public static void main(String[] args) {
		System.out.println("How many numbers you wish ot enter");
		Scanner scanner = new Scanner(System.in);
		int countOfNumbers = scanner.nextInt();
		int[] numbersArr = new int[countOfNumbers];
		for(int index = 0; index < countOfNumbers; index++) {
			int currentTypedNumber = scanner.nextInt();
			numbersArr[index] = currentTypedNumber;
		}
		for(int number : numbersArr) {
			System.out.printf("%s ", number);
		}
		System.out.println();
		for(int index = 0; index < numbersArr.length / 2; index++) {
			int temporary  = numbersArr[index];
			numbersArr[index] = numbersArr[numbersArr.length - 1 - index];
			numbersArr[numbersArr.length - 1] = temporary;
		}
		for(int number : numbersArr) {
			System.out.printf("%s ", number);
		}

	}

}
