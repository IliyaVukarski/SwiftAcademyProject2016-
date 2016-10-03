package task6;

import java.util.Scanner;

import javax.jws.Oneway;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("Enter any number. For example type 1234567");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int oneDayLength = 86400; // 60 * 60 * 24
		int oneHourLength = 3600; // 60 * 60
		int oneMinuteLength = 60; // 60
		int oneSecondLength = 1; // 1
		int numberOfDays = number / oneDayLength;
		int numberOfHours = ((number % oneDayLength) / oneHourLength);
		int numberOfMinutes = ((number % oneDayLength) % oneHourLength) / oneMinuteLength;
		int numberOfSeconds = (((number % oneDayLength) % oneHourLength) % oneMinuteLength) / oneSecondLength;
		System.out.printf("%s hous %s days %s minutes %s seconds",
						  numberOfDays, numberOfHours, numberOfMinutes, numberOfSeconds);
	}

}
