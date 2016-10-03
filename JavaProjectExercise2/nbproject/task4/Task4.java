package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Enter the length in inches");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int inches = scanner.nextInt();
		final double inchPerCentimeter = 2.54;
		double centimeters = (inches * inchPerCentimeter);
		System.out.printf("%s inches is %s cm", inches, centimeters);
	}

}
