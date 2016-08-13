package org.ims.beans;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="IMS_STATE_ABBRV")
public class StateAbbrvBean {
	
	@Id
	@Column(name="ABBRV_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int arrvId;
	
	@Column(name="STATE_NAME")
	private String stateName;
	
	@Column(name="STATE_ABBRV")
	private String stateAbbrv;
	
	@OneToMany(mappedBy="stateAbbrv")
	private Set<AddressBean> stateAddressSet;
	
	public int getArrvId() {
		return arrvId;
	}
	public void setArrvId(int arrvId) {
		this.arrvId = arrvId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateAbbrv() {
		return stateAbbrv;
	}
	public void setStateAbbrv(String stateAbbrv) {
		this.stateAbbrv = stateAbbrv;
	}
	public StateAbbrvBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StateAbbrvBean(int arrvId, String stateName, String stateAbbrv, Set<AddressBean> stateAddressSet) {
		super();
		this.arrvId = arrvId;
		this.stateName = stateName;
		this.stateAbbrv = stateAbbrv;
		this.stateAddressSet = stateAddressSet;
	}
}