package task1f;

import java.util.Scanner;

public class Task1F {
	public static void main(String[] args) {
		System.out.println("Enter one number in order to be converted to binary");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String binaryNumber = "";
		while(number > 0) {
			int remainder = number % 2;
			binaryNumber = remainder +  binaryNumber ;
			number = (number - remainder) / 2;
		}
		
		System.out.println(binaryNumber);
	}
}
