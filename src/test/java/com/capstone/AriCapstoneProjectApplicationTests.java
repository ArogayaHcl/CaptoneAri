package com.capstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
public class AriCapstoneProjectApplication implements CommandLineRunner {
	@Autowired
	private EmailService service;
	
	@Autowired AddressRepository addressRepo;
	@Autowired UserRepository userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CapstoneProjectAppllication.class, args, args);
		System.out.println("this is a test");
	}
	
	@Override
	public void run(String...args) throws Exception {
		service.sendEMail("testing@gmail.com", "entered through email");
	}
	 
}
