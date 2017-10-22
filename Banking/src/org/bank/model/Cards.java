package org.bank.model;

import java.util.*;

public class Cards {
	
	private long cardID;
	private String cardName;
	private long cvvNumber;
	private long cardNumber;
	private Date expiryDate;
	private Double cardLimit;
	
	public Cards() {}
	
	
	public Cards(long cardID, String cardName, long cvvNumber, long cardNumber, Date expiryDate, Double cardLimit) {
		super();
		this.cardID = cardID;
		this.cardName = cardName;
		this.cvvNumber = cvvNumber;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cardLimit = cardLimit;
	}


	public long getCardID() {
		return cardID;
	}


	public void setCardID(long cardID) {
		this.cardID = cardID;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public long getCvvNumber() {
		return cvvNumber;
	}


	public void setCvvNumber(long cvvNumber) {
		this.cvvNumber = cvvNumber;
	}


	public long getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}


	public Date getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public Double getCardLimit() {
		return cardLimit;
	}


	public void setCardLimit(Double cardLimit) {
		this.cardLimit = cardLimit;
	}

}
