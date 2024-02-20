package com.example.cab.dto;

import java.util.Arrays;

public class Driver {

	public Driver() {
		super();
	}

	public Driver(String name, String gender, int age, String vehicleDetails, double[] currentLocation,
			boolean available) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.vehicleDetails = vehicleDetails;
		this.currentLocation = currentLocation;
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVehicleDetails() {
		return vehicleDetails;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", gender=" + gender + ", age=" + age + ", vehicleDetails=" + vehicleDetails
				+ ", currentLocation=" + Arrays.toString(currentLocation) + ", available=" + available + "]";
	}

	public void setVehicleDetails(String vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public double[] getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(double[] currentLocation) {
		this.currentLocation = currentLocation;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	private String name;
	private String gender;
	private int age;
	private String vehicleDetails;
	private double[] currentLocation;
	private boolean available;

	public Driver(String name, String gender, int age, String vehicleDetails, double[] currentLocation) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.vehicleDetails = vehicleDetails;
		this.currentLocation = currentLocation;
	}
}
