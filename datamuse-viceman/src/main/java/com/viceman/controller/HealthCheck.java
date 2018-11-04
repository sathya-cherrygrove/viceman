package com.viceman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@RequestMapping("/datamuse/getHealth")
	public String getHealth()
	{
		return "Datamuse-Viceman is running normally...";
	}

}
