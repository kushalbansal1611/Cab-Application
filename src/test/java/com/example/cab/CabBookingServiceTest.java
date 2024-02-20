package com.example.cab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.cab.Dtos.Driver;
import com.example.cab.Dtos.User;
import com.example.cab.Services.CabBookingService;

class CabBookingServiceTest {

	private CabBookingService cabBookingService;

	@BeforeEach
	void setUp() {
		cabBookingService = new CabBookingService();
	}

	@Test
	void testAddUser() {
		User user = new User("John", "M", 30);
		cabBookingService.addUser(user);
		assertEquals(1, cabBookingService.getUsers().size());
	}

	@Test
	void testAddDriver() {
		Driver driver = new Driver("Driver1", "M", 25, "Swift KA-01-12345", new double[] { 10.0, 1.0 }, true);
		cabBookingService.addDriver(driver);
		assertEquals(1, cabBookingService.getDrivers().size());
	}

	@Test
	void testFindRide() {
		User user = new User("John", "M", 30);
		cabBookingService.addUser(user);
		Driver driver = new Driver("Driver1", "M", 25, "Swift KA-01-12345", new double[] { 10.0, 1.0 }, true);
		cabBookingService.addDriver(driver);

		List<Driver> rideForJohn = cabBookingService.findRide("John", new double[] { 10.0, 0.0 },
				new double[] { 15.0, 3.0 });
		assertEquals(1, rideForJohn.size());
	}

	@Test
	void testChooseRide() {
		User user = new User("John", "M", 30);
		cabBookingService.addUser(user);
		Driver driver = new Driver("Driver1", "M", 25, "Swift KA-01-12345", new double[] { 10.0, 1.0 }, true);
		cabBookingService.addDriver(driver);

		Driver chosenRide = cabBookingService.chooseRide("John", "Driver1");
		assertNotNull(chosenRide);
		assertFalse(chosenRide.isAvailable());
	}
}
