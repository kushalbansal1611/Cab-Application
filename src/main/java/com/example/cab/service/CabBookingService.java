package com.example.cab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.cab.dto.Driver;
import com.example.cab.dto.User;

@Service
public class CabBookingService {
	private List<User> users = new ArrayList<>();
	private List<Driver> drivers = new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}

	public void addDriver(Driver driver) {
		drivers.add(driver);
	}

	public List<Driver> getDrivers() {
		return drivers;
	}

	public List<Driver> findRide(String username, double[] source, double[] destination) {
		if (username == null || source == null || destination == null) {
			throw new IllegalArgumentException("Username, source, and destination must not be null");
		}
		return drivers.stream().filter(
				driver -> driver.isAvailable() && isWithinRange(driver.getCurrentLocation(), source, destination))
				.collect(Collectors.toList());
	}

	public Driver chooseRide(String username, String driverName) {
		if (username == null || driverName == null) {
			throw new IllegalArgumentException("Username and driverName must not be null");
		}
		for (Driver driver : drivers) {
			if (driver.getName().equals(driverName) && driver.isAvailable()) {
				driver.setAvailable(false); // Mark the driver as unavailable
				return driver;
			}
		}
		return null;
	}

	private boolean isWithinRange(double[] driverLocation, double[] source, double[] destination) {
		double distanceToSource = calculateDistance(driverLocation, source);
		double distanceToDestination = calculateDistance(source, destination);
		return distanceToSource <= 5 && distanceToDestination > distanceToSource;
	}

	private double calculateDistance(double[] loc1, double[] loc2) {
		double x1 = loc1[0];
		double y1 = loc1[1];
		double x2 = loc2[0];
		double y2 = loc2[1];
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
