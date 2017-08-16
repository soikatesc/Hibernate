package com.soikatesc.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="STREET_NAME")
	private String street;
	@Column (name="CITY_NAME")
	private String ciry;
	private String state;
	private String pincode;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCiry() {
		return ciry;
	}
	public void setCiry(String ciry) {
		this.ciry = ciry;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
