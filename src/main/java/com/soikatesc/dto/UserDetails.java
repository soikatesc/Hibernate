package com.soikatesc.dto;


import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;


@Entity(name = "USER_DETAILS")
public class UserDetails {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
//	@ElementCollection(fetch=FetchType.EAGER)
//	@JoinTable (name="USER_ADDRESS",
//				joinColumns=@JoinColumn(name="USER_ID")
//				
//			)
//	@GenericGenerator(name="sequence-gen", strategy="sequence")
//	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "sequence-gen", type = @Type(type="long"))
//	private Collection<Address> listofAddresses = new ArrayList<Address>();
	

	public int getUserId() {
		return userId;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
	
}
