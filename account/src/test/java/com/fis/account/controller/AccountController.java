package com.fis.account.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	private long number;
	

	@GetMapping("/{number}")
	public Account getAccount(@PathVariable long number) {
		return new Account(987987973432l, "savings", 234343);
	}

}
