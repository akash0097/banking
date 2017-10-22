package org.bank.model;

import java.sql.Timestamp;
import java.util.*;

public class Account
{
	private long accountID;
	private long accountNumber;
	private String accountType;
	private Timestamp createTimestamp;
	private Timestamp updateTimestamp;
	private double balance;
	private RateOfInterest rateOfInterest;
	private List<Cards> cardDetails;
	private List<Transaction> transactionDetails;

	
	public Account() {}

	public Account(long accountID, long accountNumber, String accountType, Timestamp createTimestamp,
			Timestamp updateTimestamp, double balance, RateOfInterest rateOfInterest, List<Cards> cardDetails,
			List<Transaction> transactionDetails) {
		super();
		this.accountID = accountID;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.createTimestamp = createTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.balance = balance;
		this.rateOfInterest = rateOfInterest;
		this.cardDetails = cardDetails;
		this.transactionDetails = transactionDetails;
	}


	public long getAccountID() {
		return accountID;
	}

	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Timestamp getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(Timestamp createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public RateOfInterest getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(RateOfInterest rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public List<Cards> getCardDetails() {
		return cardDetails;
	}

	public void setCardDetails(List<Cards> cardDetails) {
		this.cardDetails = cardDetails;
	}

	public List<Transaction> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<Transaction> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

}
