package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("Enter any number. For example enter number 1234567");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int oneMinuteLength = 60; // 1 second contains 60 seconds
		int oneHourLength = 3600; // 1 hour contains 3600 seconds (60 * 60)
		int oneDayLength = 86400; // 1 day contains 86400 (60 * 60 * 24)		
		int numberOfDays = number / oneDayLength;
		int numberOfHours = ((number % oneDayLength) / oneHourLength);
		int numberOfMinutes = (((number % oneDayLength) % oneHourLength) / oneMinuteLength);
		int numberOfSeconds = (((number % oneDayLength) % oneHourLength) % oneMinuteLength);
		System.out.println(numberOfDays + " days " + 
						   numberOfHours + " hours " + 
						   numberOfMinutes + " minutes " + 
						   numberOfSeconds + " seconds ");
	}
}
