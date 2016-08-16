package org.ims.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="IMS_PURCHASE_ORDER")
public class PurchaseOrderBean {
	@Id
	@Column(name="ORDER_NUMBER",nullable=false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderNum;
	@Column(name="SUBTOTAL",nullable=false)
	private String subtotal;
	@Column(name="PURCHASE_DATE",nullable=false)
	private String purchaseDate;
	@Column(name="TAX_AMOUNT",nullable=false)
	private String taxAmount;
	@Column(name="PO_TOTAL",nullable=false)
	private int poTotal;
	@ManyToOne
	@JoinColumn(name="CLIENT_ID",nullable=false)
	private ClientBean client;
	@OneToMany(mappedBy="order")
	private Set<POLineBean> orderLines;

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
	public Set<POLineBean> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(Set<POLineBean> orderLines) {
		this.orderLines = orderLines;
	}
	public PurchaseOrderBean(int orderNum, String subtotal, String purchaseDate, String taxAmount, int poTotal,
			ClientBean client, Set<POLineBean> orderLines) {
		super();
		this.orderNum = orderNum;
		this.subtotal = subtotal;
		this.purchaseDate = purchaseDate;
		this.taxAmount = taxAmount;
		this.poTotal = poTotal;
		this.client = client;
		this.orderLines = orderLines;
	}
}
