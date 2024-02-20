package com.example.cab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabBookingApplicationDriver {
	public static void main(String[] args) {
		SpringApplication.run(CabBookingApplicationDriver.class, args);
//		CabBookingService cabBookingService = new CabBookingService();
//
//		// Add users
//		cabBookingService.addUser(new User("Abhishek", "M", 23));
//		cabBookingService.addUser(new User("Rahul", "M", 29));
//		cabBookingService.addUser(new User("Nandini", "F", 22));
//
//		// Add drivers
//		cabBookingService.addDriver(new Driver("Driver1", "M", 22, "Swift KA-01-12345", new double[] { 10, 1 }, true));
//		cabBookingService.addDriver(new Driver("Driver2", "M", 29, "Swift KA-01-12345", new double[] { 11, 10 }, true));
//		cabBookingService.addDriver(new Driver("Driver3", "M", 24, "Swift KA-01-12345", new double[] { 5, 3 }, true));
//
//		// Test find ride
//		List<Driver> rideForAbhishek = cabBookingService.findRide("Abhishek", new double[] { 0, 0 },
//				new double[] { 20, 1 });
//		System.out.println("Ride for Abhishek: " + rideForAbhishek); // Expected: []
//
//		List<Driver> rideForRahul = cabBookingService.findRide("Rahul", new double[] { 10, 0 }, new double[] { 15, 3 });
//		System.out.println("Ride for Rahul: " + rideForRahul); // Expected: [Driver1]
//
//		List<Driver> rideForNandini = cabBookingService.findRide("Nandini", new double[] { 15, 6 },
//				new double[] { 20, 4 });
//		System.out.println("Ride for Nandini: " + rideForNandini); // Expected: []
//
//		// Test choose ride
//		Driver chosenRide = cabBookingService.chooseRide("Rahul", "Driver1");
//		System.out.println("Chosen ride for Rahul: " + chosenRide); // Expected: Driver1
	}
}
