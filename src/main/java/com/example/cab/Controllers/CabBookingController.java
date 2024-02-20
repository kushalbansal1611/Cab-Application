package com.example.cab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cab.Dtos.Driver;
import com.example.cab.Dtos.User;
import com.example.cab.Services.CabBookingService;

@RestController
@RequestMapping("/cab")
public class CabBookingController {
	@Autowired
	private CabBookingService cabBookingService;

	@PostMapping("/user")
	public void addUser(@RequestBody User user) {
		cabBookingService.addUser(user);
	}

	@PostMapping("/driver")
	public void addDriver(@RequestBody Driver driver) {
		cabBookingService.addDriver(driver);
	}

	@GetMapping("/ride")
	public List<Driver> findRide(@RequestParam String username, @RequestParam double[] source,
			@RequestParam double[] destination) {
		return cabBookingService.findRide(username, source, destination);
	}

	@PostMapping("/choose")
	public Driver chooseRide(@RequestParam String username, @RequestParam String driverName) {
		return cabBookingService.chooseRide(username, driverName);
	}
}
