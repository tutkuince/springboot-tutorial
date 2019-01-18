package com.muditasoft.springboottutorial.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	// There are 10+ Spring Boot Actuator endpoints
	// /auditevents -> Audit events for your application
	// /beans -> List of all beans registered in the Spring application context
	// /mappings -> List of all @RequestMapping paths
	
	// Inject properties for: developer.name and department.name
	@Value("${developer.name}")
	private String developerName;
	
	@Value("${department.name}")
	private String departmentName;

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
	
	// expose new endpoint for "department" info
	@GetMapping("/departmentinfo")
	public String getDepartmentInfo() {
		return "Developer name: " + developerName + ", Department name: " + departmentName;
	}
}
