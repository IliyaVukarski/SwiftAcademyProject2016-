package task4;

import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class PersonCharacteristics {
	//data fields
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private double weight;
	private double height;
	private String profession;
	private char[] gender;
	private int[] grades = new int[]{2, 3, 4, 5, 6};
	
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
	
	public char[] getGender() {
		return gender;
	}

	public void setGender(char[] gender) {
		this.gender = gender;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
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

}
