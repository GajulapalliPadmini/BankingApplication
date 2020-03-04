package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Account {
	@Id
	private long accountnumber;
	private String accountname;
	private double openingavailablebalance;
	Transaction transaction;
	
   public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getAccountname() {
		return accountname;
	}
	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}
	public double getOpeningavailablebalance() {
		return openingavailablebalance;
	}
	public void setOpeningavailablebalance(double openingavailablebalance) {
		this.openingavailablebalance = openingavailablebalance;
	}
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	private Date date;
	
	

}
