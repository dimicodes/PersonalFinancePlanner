package com.group.PersonalFinancePlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PersonalFinancePlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinancePlannerApplication.class, args);

		Scanner scanner = new Scanner(System.in);
		Client client = ClientApplication.createClient(scanner);
		scanner.close();

		// Optional: Display the gathered information or use the created client object for further processing
		System.out.println("Client Created: " + client.getFullName());
		FinancialAdvisor.runFinancialAdvisor(client);
	}
}
