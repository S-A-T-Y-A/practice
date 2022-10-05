package com.practice.QuickStart.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Employee employee() {
		return new Employee();
	}
	@Bean
	public Service service() {
		return new Service();
	}
}
