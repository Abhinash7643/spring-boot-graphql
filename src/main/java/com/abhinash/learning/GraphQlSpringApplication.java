package com.abhinash.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {

		SecurityAutoConfiguration.class
})
public class GraphQlSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphQlSpringApplication.class, args);
	}

}
