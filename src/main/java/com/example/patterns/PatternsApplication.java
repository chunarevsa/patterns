package com.example.patterns;

import com.example.patterns.creational.abstractFactory.banking.BankingProject;
import com.example.patterns.creational.abstractFactory.website.WebsiteProject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);

		BankingProject bankingProject = new BankingProject();
		bankingProject.start();

		System.out.println("_________________________");

		WebsiteProject websiteProject = new WebsiteProject();
		websiteProject.start();
	}

}
