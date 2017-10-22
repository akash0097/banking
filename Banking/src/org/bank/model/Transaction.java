package org.bank.model;

import java.sql.Timestamp;
import java.util.*;

public class Transaction {
	
	private long transactionID;
	private Date transactionDate;
	private Timestamp transactionTimestamp;
	private long ifscCode;
	private long benificiaryAccNo;
	private String benificiaryName;
	private String benificiaryType;
	private String description;
	private double transactionAmount;
	private String transactionType;
	
	public Transaction() {	}
	
	
	public Transaction(long transactionID, Date transactionDate, Timestamp transactionTimestamp, long ifscCode,
			long benificiaryAccNo, String benificiaryName, String benificiaryType, String description,
			double transactionAmount, String transactionType) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.transactionTimestamp = transactionTimestamp;
		this.ifscCode = ifscCode;
		this.benificiaryAccNo = benificiaryAccNo;
		this.benificiaryName = benificiaryName;
		this.benificiaryType = benificiaryType;
		this.description = description;
		this.transactionAmount = transactionAmount;
		this.transactionType = transactionType;
	}


	public long getTransactionID() {
		return transactionID;
	}


	public void setTransactionID(long transactionID) {
		this.transactionID = transactionID;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}


	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	public Timestamp getTransactionTimestamp() {
		return transactionTimestamp;
	}


	public void setTransactionTimestamp(Timestamp transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}


	public long getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(long ifscCode) {
		this.ifscCode = ifscCode;
	}


	public long getBenificiaryAccNo() {
		return benificiaryAccNo;
	}


	public void setBenificiaryAccNo(long benificiaryAccNo) {
		this.benificiaryAccNo = benificiaryAccNo;
	}


	public String getBenificiaryName() {
		return benificiaryName;
	}


	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}


	public String getBenificiaryType() {
		return benificiaryType;
	}


	public void setBenificiaryType(String benificiaryType) {
		this.benificiaryType = benificiaryType;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getTransactionAmount() {
		return transactionAmount;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
