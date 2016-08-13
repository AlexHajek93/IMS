package org.ims.beans;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="IMS_CLIENT")
public class ClientBean {
	@Id
	@Column(name="CLIENT_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="CLIENT_NAME")
	private String name;
	@Column(name="CLIENT_EMAIL")
	private String email;
	@Column(name="POINT_OF_CONTACT_NAME")
	private String pocn;
	@Column(name="CLIENT_PHONE")
	private String phone;
	@Column(name="CLIENT_FAX")
	private String fax;
	
//Mappings
	@OneToOne
	@JoinColumn(name="ADDRESS_ID")
	private AddressBean address;
	@ManyToOne
	@JoinColumn(name="CLIENT_TYPE_ID")
	private ClientTypeBean clientType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPocn() {
		return pocn;
	}
	public void setPocn(String pocn) {
		this.pocn = pocn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public AddressBean getAddress() {
		return address;
	}
	public void setAddress(AddressBean address) {
		this.address = address;
	}
	public ClientTypeBean getClientType() {
		return clientType;
	}
	public void setClientType(ClientTypeBean clientType) {
		this.clientType = clientType;
	}
	public ClientBean() {
		super();
	}
	public ClientBean(int id, String name, String email, String pocn, String phone, String fax, AddressBean address,
	    ClientTypeBean clientType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pocn = pocn;
		this.phone = phone;
		this.fax = fax;
		this.address = address;
		this.clientType = clientType;
	}
}
