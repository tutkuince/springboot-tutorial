package com.muditasoft.springboottutorial.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	// There are 10+ Spring Boot Actuator endpoints
	// /auditevents -> Audit events for your application
	// /beans -> List of all beans registered in the Spring application context
	// /mappings -> List of all @RequestMapping paths

	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is: " + LocalDateTime.now();
	}
	
	// expose a new endpoint for "workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}
	
	// expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day!";
	}
}
