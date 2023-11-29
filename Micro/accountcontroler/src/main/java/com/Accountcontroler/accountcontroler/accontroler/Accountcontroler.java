package com.Accountcontroler.accountcontroler.accontroler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class Accountcontroler
{
 @GetMapping("/statuscheck")
 public String getStatus()
 {
	 return "working";
 }
}
