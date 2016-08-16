package org.ims.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_ADDRESS")
public class AddressBean {
	
	@Id
	@Column(name="ADDRESS_ID", nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	@Column(name="STREET_ADDRESS_1", nullable=false)
	private String streetAddress1;
	@Column(name="STREET_ADDRESS_2", nullable=false)
	private String streetAddress2;
	@Column(name="ADDRESS_CITY", nullable=false)
	private String addressCity;
	@Column(name="ADDRESS_ZIP", nullable=false)
	private String addressZip;
	@ManyToOne
	@JoinColumn(name="STATE_ID", nullable=false)
	private StateAbbrvBean stateAbbrv;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressZip() {
		return addressZip;
	}
	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressBean(int addressId, String streetAddress1, String streetAddress2, String addressCity,
			String addressZip, StateAbbrvBean stateAbbrv) {
		super();
		this.addressId = addressId;
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.addressCity = addressCity;
		this.addressZip = addressZip;
		this.stateAbbrv = stateAbbrv;
	}	
}
