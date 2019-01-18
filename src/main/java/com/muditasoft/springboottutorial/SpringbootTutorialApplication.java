package com.muditasoft.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// Composed of @EnableAutoConfiguration, @ComponenetScan, @Configuration

// More on Component Scanning
// @SpringBootApplication(scanBasePackages= {"io.spring.utils", "edu.cmu.wean"})
public class SpringbootTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
		// SpringApplication.run(SpringbootTutorialApplication.class, args);
		// Creates application context and registers all beans
		// Starts the embedded server Tomcat etc...
	}

}

