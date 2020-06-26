package com.app.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SprintBootApplications extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(SprintBootApplications.class, args);
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(SprintBootApplications.class);
	}
	
}
