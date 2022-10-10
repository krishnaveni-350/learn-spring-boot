package com.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

		 
@RestController
public class CurrencyController {
	@Autowired
	private CurrencyConfigurationProperties configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyConfigurationProperties retrieveAllCourses() {
		
		return configuration;
	}

}
