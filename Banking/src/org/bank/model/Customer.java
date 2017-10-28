package org.bank.model;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name="CUSTOMER")
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CUSTOMER_ID")
	private long customerID;
	
	@Column(name="SALUTATION")
	private String slautation;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="ADDRESS")
	private String address;

	@Column(name="DOB")
	private Date dob;
	
	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="MOBILE_NUMBER")
	private long mobileNumber;
	
	@Column(name="PANCARD")
	private long pancard;
	
	@Column(name="AADHAR_CARD")
	private long aadharcard;
	
	@Column(name="NOMINEE_NAME")
	private String nomineeName;
	
	@Column(name="NOMINEE_RELATION")
	private String nomineeRelation;
	
	@Column(name="CRTED_TMSTMP")
	private Timestamp createdTimestamp;
	
	@Column(name="UPTD_TMSTMP")
	private Timestamp updateTimestamp;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "CUSTOMER_ACCOUNT_DETAILS", joinColumns = {@JoinColumn(name="ACCOUNT_ID") }, inverseJoinColumns = { @JoinColumn(name="CUSTOMER_ID")})
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
	
	public Customer(String slautation, String userName, String password, String firstName,
			String middleName, String lastName, String address, Date dob, String email, long mobileNumber, long pancard,
			long aadharcard, String nomineeName, String nomineeRelation, Timestamp createdTimestamp,
			Timestamp updateTimestamp, List<Account> accounts) {
		super();
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
