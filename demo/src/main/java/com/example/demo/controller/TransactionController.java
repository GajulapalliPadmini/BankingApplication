package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AccountRepo;
import com.example.demo.dao.TransactionRepo;
import com.example.demo.model.Account;
import com.example.demo.model.Transaction;

@RestController
public class TransactionController {
	
@Autowired	
 TransactionRepo transactionrepo;

@Autowired
 AccountRepo accountrepo;

@PostMapping("/account/{accountnumber}/transaction")
public Optional<Transaction> createTransaction(@PathVariable (value = "accountnumber") Long accountnumber,
                             @Valid @RequestBody Transaction transaction) {
	return accountrepo.findById(accountnumber).map(account -> {
        transaction.setAccount(account);
        return transactionrepo.save(transaction);
    });
}

@GetMapping("/transactions/account/{accountnumber}")
public String getAccountTransactions(@PathVariable("accountnumber") long accountnumber,
                                  Model model) {
    List<Transaction> accountTransactions = transactionrepo.findTransactionsByAccountnumber(accountnumber);
    model.addAttribute("Transactions", accountTransactions);
    return "card-transactions";
}

/*@PostMapping("/add-transaction")
public String processAddTransaction(@ModelAttribute("addTransactionForm") Transaction transaction,
                                    Model model) {
    String currency = transaction.getCurrency();
    String transactionType=transaction.getTransationtype();
    long transactionamount=transaction.getTransactionamount();
    long transactionid=transaction.getTransactionid();
    Account account=transaction.getAccount();


 Transaction transaction1=new Transaction(account,transactionid,transactionType,currency,transactionamount);
 transactionrepo.save(transaction1);
 
 model.addAttribute("successfulTransaction", "successfulTransaction");
    
    return "transaction";
}
*/
}
