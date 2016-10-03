package task4;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		PersonCharacteristics personCharacteristics = new PersonCharacteristics();
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter new correct value for First Name");
			personCharacteristics.setFirstName(scanner.next());
			System.out.println("Please enter new correct value for Last Name");
			personCharacteristics.setLastName(scanner.next());
			
			boolean isValid;
			do {
				System.out.println("Enter value for year of birth, please");
				if(scanner.hasNextInt()) {
					personCharacteristics.setYearOfBirth(scanner.nextInt());
					isValid = true;
				}else {
					System.out.println("Enter new correct value for year of birth, please");
					isValid = false;
					scanner.next();
				}
			}while(!(isValid));
			
			do {
				System.out.println("Enter correct value for weight, please");
				if(scanner.hasNextDouble()) {
					personCharacteristics.setWeight(scanner.nextDouble());
					isValid = true;
				}else {
					System.out.println("Enter correct value for weight, please");
					isValid = false;
					scanner.next();
				}
			}while(!(isValid));
			
			do {
				System.out.println("Enter correct value for height, please");
				if(scanner.hasNextDouble()) {
					personCharacteristics.setHeight(scanner.nextDouble());
					isValid = true;
				}else {
					System.out.println("Enter correct value for height, please");
					isValid = false;
					scanner.next();
				}
			}while(!(isValid));
			System.out.println("Enter correct value for profession");
			personCharacteristics.setProfession(scanner.next());
			System.out.println("First Name " + personCharacteristics.getFirstName());
			System.out.println("Last Name " + personCharacteristics.getLastName());
			System.out.println("Year of birth" + personCharacteristics.getYearOfBirth());
			System.out.println("Weight " + personCharacteristics.getWeight());
			System.out.println("Heighy " + personCharacteristics.getHeight());
			System.out.println("Profession "+ personCharacteristics.getProfession());
			
		}catch(Exception ex) {
			System.out.println("Wrong value!");
		}
	}

}
