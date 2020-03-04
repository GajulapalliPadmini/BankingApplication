package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Transaction {
	

public Transaction(Account account, Long transactionid, String transationtype, String currency,
			long transactionamount) {
		super();
		this.account = account;
		this.transactionid = transactionid;
		this.transationtype = transationtype;
		this.currency = currency;
		this.transactionamount = transactionamount;
	}
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name="accountnumber",nullable=false)
@JsonIgnore
private Account account;

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long transactionid;
 public Account getAccount() {
	return account;
}
public void setAccount(Account account) {
	this.account = account;
}
private String transationtype;
 private String currency;
 private long transactionamount;
 
public Long getTransactionid() {
	return transactionid;
}
public void setTransactionid(Long transactionid) {
	this.transactionid = transactionid;
}
public String getTransationtype() {
	return transationtype;
}
public void setTransationtype(String transationtype) {
	this.transationtype = transationtype;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public long getTransactionamount() {
	return transactionamount;
}
public void setTransactionamount(long transactionamount) {
	this.transactionamount = transactionamount;
}
 
 
}
