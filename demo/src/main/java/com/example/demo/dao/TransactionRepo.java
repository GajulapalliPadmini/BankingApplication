package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Account;
import com.example.demo.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
//	public Transaction findAllByAccoArrayList(Account account);
    List<Transaction> findTransactionsByAccountnumber(long accountnumber);

    
	/*Page<Transaction> findAllByAccounNumberAyyayList(Account account, Pageable pageable);
    Optional<Transaction> findByTransactionIdAndAccountNumber(int transactionid, Long accountNumber);*/

	
}