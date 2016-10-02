package task4;

import java.util.Scanner;

public class Calculator {

	public static void operations() {
		System.out.println("Please Choose TypeOfOperation");
		System.out.println("between SUM, SUB, MUL, DIV, PER");
		Scanner scanner = new Scanner(System.in);
		String operation = scanner.next();
		System.out.print("Enter first number");
		double numberA = 0;
		numberA = scanner.nextDouble();
		System.out.print("Enter second number");
		double numberB = 0;
		numberB = scanner.nextDouble();
		switch(operation) {
		case "SUM":
			System.out.println(operation +  numberA +" "+ numberB);
			System.out.print(numberA + numberB);
			break;
		case "SUB": 
			System.out.println(operation +  numberA +" "+ numberB);
			System.out.print(numberA - numberB);
			break;
		case "MUL": 
			System.out.println(operation +  numberA +" "+ numberB);
			System.out.print(numberA * numberB);
			break;
		case "DIV": 
			System.out.println(operation +  numberA +" "+ numberB);
			System.out.print(numberA / numberB);
			break;
		case "PER": 
			System.out.println(operation +  numberA +" "+ numberB);
			System.out.print(Math.pow(numberA, numberB));
			break;
		}
	}
	
}
