package com.maincontroler.demomicroservice.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class DemoMaincontroler 
{
	@GetMapping("/statuscheck")
	public String getStarted()
	{
		return "working";
	}
}
