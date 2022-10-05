package com.practice.QuickStart.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Autowired
	private Service service;
	public void empservice() {
		service.working();
	}

}
