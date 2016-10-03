package task1G;

import java.util.Scanner;

public class Task1G {
	public static void calculateSum(int... arr) {
		
	}
	public static void main(String[] args) {
		System.out.println("Enter number that will be converted to binary number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int remainder = 0;
		int hexadecimal  = 0;
		String hexNumber = " ";
		while(number != 0) {
			remainder = number % 16;
			switch(remainder) {
			
			case 10:	
				hexNumber = 'A' + hexNumber;
				break;
			case 11:
				hexNumber = 'B' + hexNumber;
				break;
			case 12:
				hexNumber = 'C' + hexNumber;
				break;
			case 13:
				hexNumber = 'D' + hexNumber;
				break;
			case 14:
				hexNumber = 'E' + hexNumber;
				break;
			case 15:
				hexNumber = 'F' + hexNumber;
				break;
				default:
					hexNumber = remainder + hexNumber;
			}
			hexadecimal = hexadecimal * 10  +  remainder;
			number = number / 16;
		}
		System.out.println(hexNumber);
	}

}
