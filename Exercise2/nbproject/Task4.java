package task4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Enter length in inches");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		int inches = scanner.nextInt();
		double centimeters = (inches * 2.54);
		System.out.println(centimeters);
	}

}
