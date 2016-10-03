	package task1F;
	
	import java.util.Scanner;
	
	public class Task1E {
	
		public static void main(String[] args) {
			System.out.println("Enter number that will be converted to binary number");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			int remainder = 0;
			int binaryDigit  = 0;
			String binNumber = "";
			while(number != 0) {
				remainder = number % 2;
				switch(remainder) {
				case 0:
					binNumber = 0 + binNumber;
					break;
				default:
					binNumber = 1 + binNumber;
				}
					binaryDigit = binaryDigit * 10   +  remainder;
				
				number = number / 2;
			}
			System.out.println(binNumber);
		}
	}
