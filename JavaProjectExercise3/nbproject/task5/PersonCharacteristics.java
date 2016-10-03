package task5;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

import javax.print.attribute.standard.Fidelity;

public class PersonCharacteristics {
	//data fields
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private double weight;
	private double height;
	private String profession;
	
	public PersonCharacteristics() {
		
	}
	
	public PersonCharacteristics(String firstName, String lastName,
			int yearOfBirth, double weight, double height, String profession) {
		this.setFirstName(firstName);
		this.setLastName(lastName); 
		this.setYearOfBirth(yearOfBirth); 
		this.setWeight(weight); 
		this.setHeight(height); 
		this.setProfession(profession);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public static void main(String[] args) {
		PersonCharacteristics personCharacteristics = new PersonCharacteristics();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter new correct value for First Name");
		personCharacteristics.setFirstName(scanner.nextLine());
		System.out.println("Please enter new correct value for Last Name");
		personCharacteristics.setLastName(scanner.nextLine());
		System.out.println("Enter correct value for profession");
		personCharacteristics.setProfession(scanner.nextLine());
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
			
		System.out.println("First Name " + personCharacteristics.getFirstName());
		System.out.println("Last Name " + personCharacteristics.getLastName());
		System.out.println("Year of birth" + personCharacteristics.getYearOfBirth());
		System.out.println("Weight " + personCharacteristics.getWeight());
		System.out.println("Heighy " + personCharacteristics.getHeight());
		System.out.println("Profession "+ personCharacteristics.getProfession());	
		
		
		for(int index = 0; index < 2; index++) {
			
			PersonCharacteristics person = new  PersonCharacteristics();
			System.out.println("Please enter new correct value for First Name");
			person.setFirstName(scanner.nextLine());
			System.out.println("Please enter new correct value for Last Name");
			person.setLastName(scanner.nextLine());
			System.out.println("Please enter new correct value for Year of birth");
			person.setYearOfBirth(scanner.nextInt());
			System.out.println("Please enter new correct value for weigth");
			person.setWeight(scanner.nextInt());
			System.out.println("Please enter new correct value for heigth");
			person.setHeight(scanner.nextInt());
			System.out.println("Please enter new correct value for profession");
			person.setProfession(scanner.nextLine());
			
			System.out.println("First Name " + person.getFirstName());
			System.out.println("Last Name " + person.getLastName());
			System.out.println("Year of birth" + person.getYearOfBirth());
			System.out.println("Weight " + person.getWeight());
			System.out.println("Heighy " + person.getHeight());
			System.out.println("Profession "+ person.getProfession());	
		}
	}
}
