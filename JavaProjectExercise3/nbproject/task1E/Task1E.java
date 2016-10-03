package task1E;

import java.util.Scanner;

public class Task1E {

	public static void main(String[] args) {
		System.out.println("Enter number to check if it's prime");
		Scanner scanner = new Scanner(System.in);
		int numberToCheck = scanner.nextInt();
		boolean flag = true;
		for(int index = 2; index < numberToCheck; index++) {
			if(numberToCheck % index == 0) {
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		
		if(flag) {
			System.out.printf("%d is prime", numberToCheck);
		}else {
			System.out.printf("%d is not prime", numberToCheck);
		}
	}
}
