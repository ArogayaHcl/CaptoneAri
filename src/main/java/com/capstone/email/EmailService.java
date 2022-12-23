package com.capstone.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailService {
	@Bean
	public SimpleMailMessage emailTemplate() {
		
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setTo("1@gmail.com");
		smm.setFrom("2@gmail.com");
		smm.setSubject("Test Email");
		smm.setText("Welcome to the springboot email");
		return smm;
	}

}
