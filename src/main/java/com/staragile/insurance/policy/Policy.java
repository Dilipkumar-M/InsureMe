package com.staragile.insurance.policy;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Policy {

	@Id
	String policyId;
	String customerName;
	String customerAddress;
	String contactNumber;
	
	
	public Policy() {
		super();
	}
	
	
	public Policy(String policyId, String customerName, String customerAddress, String contactNumber) {
		super();
		this.policyId = policyId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.contactNumber = contactNumber;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
