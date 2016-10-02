package task1g;

import java.util.Scanner;

public class Task1G {
	public static void main(String[] args) {
		System.out.println("Enter one number in order to be converted to binary");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String hexNumber = "";
		while(number > 0) {
			int remainder = number % 16;
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
			case 16:
				hexNumber = 'G' + hexNumber;
				break;
				default:
					hexNumber = remainder + hexNumber;
					break;
			}
			number = (number - remainder) / 16;
		}
		System.out.println(hexNumber);
	}
}
