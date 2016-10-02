package task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Enter year to check if it's leap");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if((year % 4 == 0) && (year % 100 !=0)) {
			System.out.println("The year is leap");
		}else if((year % 4 == 0) && (year % 100 == 0) && (year % 400 ==0)) {
			System.out.println("The year is leap");
		}else {
			System.out.println("The year is not leap");
		}
	}
}
