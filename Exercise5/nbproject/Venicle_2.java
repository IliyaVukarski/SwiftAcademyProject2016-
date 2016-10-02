package task3;

import java.util.Scanner;

public class Venicle {

	private String type;
	private String model;
	private static double power;
	private static double fuelConsumption;
	private int yearProduced;
	private int licenceNo;
	private int weight;
	private String color;
	
	public Venicle(String type, String model, double power, double fuelConsumption, int yearProduced, int licenceNo,
			int weight, String color) {
		this.setType(type);
		this.setModel(model);
		this.setPower(power);
		this.setFuelConsumption(fuelConsumption);
		this.setYearProduced(yearProduced);
		this.setLicenceNo(licenceNo);
		this.setWeight(weight);
		this.setColor(color);
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public int getYearProduced() {
		return yearProduced;
	}
	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}
	public int getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double calculatePrice(double fuelPrice, double distance) {
		System.out.println("Calculating price for the trip");
		double price = 0;
		price = fuelPrice * distance;
		System.out.println("The trip will cost " + price);
		return price;
	}
	
	public double getInsurancePrice(int carAge, String type) {
		double priceInsurarance = 0;
		double typeCoefficient = 0;
		switch(type) {
		case "car":
			typeCoefficient = 1.00;
			break;
		case "suv":
			typeCoefficient = 1.12;
			break;
		case "truck":
			typeCoefficient = 1.20;
			break;
		case "motorcycle":
			typeCoefficient = 1.50;
			break;
		default:
			System.out.println("Not available data!");
			break;
		}
		priceInsurarance = ((power * 0.16) * (carAge * 1.25) * (fuelConsumption * 0.05) * typeCoefficient);
		return priceInsurarance;
	}
}
