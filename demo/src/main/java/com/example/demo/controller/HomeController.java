package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AccountRepo;
import com.example.demo.model.Account;

@RestController
public class HomeController {

	@Autowired
	AccountRepo accountrepo;

	@RequestMapping("/addAccount")
	public Account addAccount(@RequestBody Account account) {
		return accountrepo.save(account);
	}

	@GetMapping("/accounts")
	@ResponseBody()
	public List getAccounts() {
		return (List) accountrepo.findAll();
	}

	@PutMapping("/account/{accountnumber}")
	public Optional<Account> getAccount(@PathVariable long accountnumber) {
		return accountrepo.findById(accountnumber);
	}

}
