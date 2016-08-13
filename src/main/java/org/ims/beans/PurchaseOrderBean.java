package org.ims.beans;

import javax.persistence.*;

@Entity
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrderBean {
	@Id
	@Column(name="ORDER_NUMBER")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNum;
	@Column(name="SUBTOTAL")
	private String subtotal;
	@Column(name="PURCHASE_DATE")
	private String purchaseDate;
	@Column(name="TAX_AMOUNT")
	private String taxAmount;
	@Column(name="PO_TOTAL")
	private int poTotal;
	@ManyToOne
	@JoinColumn(name="CLIENT_ID")
	private ClientBean client;
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int getPoTotal() {
		return poTotal;
	}
	public void setPoTotal(int poTotal) {
		this.poTotal = poTotal;
	}
	public ClientBean getClient() {
		return client;
	}
	public void setClient(ClientBean client) {
		this.client = client;
	}
	public PurchaseOrderBean() {
		super();
	}
	public PurchaseOrderBean(int orderNum, String subtotal, String purchaseDate, String taxAmount, int poTotal,
	    ClientBean client) {
		super();
		this.orderNum = orderNum;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
	}
}
