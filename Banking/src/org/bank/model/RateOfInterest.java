package org.bank.model;

public class RateOfInterest 
{
	private long rateOfInetrestID;
	private String name;
	private String description;
	private float interestRate;
	
	
	public RateOfInterest() {}
	
	public RateOfInterest(long rateOfInetrestID, String name, String description, float interestRate) {
		super();
		this.rateOfInetrestID = rateOfInetrestID;
		this.name = name;
		this.description = description;
		this.interestRate = interestRate;
	}

	public long getRateOfInetrestID() {
		return rateOfInetrestID;
	}

	public void setRateOfInetrestID(long rateOfInetrestID) {
		this.rateOfInetrestID = rateOfInetrestID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
}
