package com.kaffa.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	/* Rest API returns a JSON
	 * How it works:
	 * localhost:8080/users - To return all clients - GET
	 * localhost:8080/users/{id} - To return an specific user - GET
	 * localhost:8080/users/Object JSON - To save an user in database - POST
	 * localhost:8080/user/{id} - To delete an user - DELETE
	 * localhost:8080/user/{id}/Object JSON - To update an user in database - PUT
	 * 
	 * Access H2 DATABASE:
	 * localhost:8080/h2-console
	 * username = kaffa
	 * password =
	 */

@SpringBootApplication
public class KaffaMainFrame {

	public static void main(String[] args) {
		SpringApplication.run(KaffaMainFrame.class, args);
	}
}
