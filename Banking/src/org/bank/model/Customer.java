package org.bank.model;

import java.util.*;
import java.sql.Timestamp;

public class Customer 
{
	private long customerID;
	private String slautation;
	private String userName;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private Date dob;
	private String email;
	private long mobileNumber;
	private long pancard;
	private long aadharcard;
	private String nomineeName;
	private String nomineeRelation;
	private Timestamp createdTimestamp;
	private Timestamp updateTimestamp;
	private List<Account> accounts;
	
	
	public Customer() { }
	
	public Customer(long customerID, String slautation, String userName, String password, String firstName,
			String middleName, String lastName, String address, Date dob, String email, long mobileNumber, long pancard,
			long aadharcard, String nomineeName, String nomineeRelation, Timestamp createdTimestamp,
			Timestamp updateTimestamp, List<Account> accounts) {
		super();
		this.customerID = customerID;
		this.slautation = slautation;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.pancard = pancard;
		this.aadharcard = aadharcard;
		this.nomineeName = nomineeName;
		this.nomineeRelation = nomineeRelation;
		this.createdTimestamp = createdTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.accounts = accounts;
	}

	
	public long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}

	public String getSlautation() {
		return slautation;
	}

	public void setSlautation(String slautation) {
		this.slautation = slautation;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getPancard() {
		return pancard;
	}

	public void setPancard(long pancard) {
		this.pancard = pancard;
	}

	public long getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(long aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

//	@Override
//	public String toString() {
//		return "Customer [customerID=" + customerID + ", slautation=" + slautation + ", userName=" + userName
//				+ ", password=" + password + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
//				+ lastName + ", address=" + address + ", dob=" + dob + ", email=" + email + ", mobileNumber="
//				+ mobileNumber + ", pancard=" + pancard + ", aadharcard=" + aadharcard + ", nomineeName=" + nomineeName
//				+ ", nomineeRelation=" + nomineeRelation + ", createdTimestamp=" + createdTimestamp
//				+ ", updateTimestamp=" + updateTimestamp + ", accounts=" + accounts + "]";
//	}
	
}
